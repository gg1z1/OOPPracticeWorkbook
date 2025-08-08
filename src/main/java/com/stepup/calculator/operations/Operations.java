package com.stepup.calculator.operations;

public enum Operations {
    ADD(1) {
        @Override
        public int calculate (int x, int y) {
            return x + y;
        }
    },
    SUBTRACT(2) {
        @Override
        public int calculate (int x, int y) {
            return x - y;
        }
    },
    MULTIPLY(3) {
        @Override
        public int calculate (int x, int y) {
            return x * y;
        }
    },
    DIVIDE(4) {
        @Override
        public int calculate (int x, int y) {
            if (y == 0) {
                throw new ArithmeticException("Деление на ноль");
            }
            return x / y;
        }
    };

    private final int code;

    Operations(int code) {
        this.code = code;
    }

    public abstract int calculate (int x, int y);

    public static Operations getOperationByCode(int code) {
        for (Operations operation : Operations.values())
            if (operation.code == code) return operation;
        throw new IllegalArgumentException("Неизвестная операция: " + code);
    }
}
