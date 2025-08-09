package com.stepup.mains;

import com.stepup.exceptions.OperationAttemptException;

public class MainException {
    public static void main(String[] args) {
        try {
            performOperation();
        } catch (OperationAttemptException e) {
            System.err.println("Произошла ошибка: " + e.getMessage());
        }
    }

    public static void performOperation() throws OperationAttemptException {
        // Имитация условия, при котором возникает исключение
        if (true) {
            throw new OperationAttemptException("Операция не может быть выполнена");
        }
    }
}