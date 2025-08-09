package com.stepup.mains;

import com.stepup.exceptions.OperationAttemptException;

public class MainException {

    public static void main(String[] args) {
        SquareRootCalculator root = new SquareRootCalculator();

        try {
            // Успешный случай
            double result = root.calculateSquareRoot(16);
            System.out.println("Квадратный корень: " + result);

            result = root.calculateSquareRoot(-9);
            System.out.println("Квадратный корень: " + result);

        } catch (OperationAttemptException e) {
            System.err.println("Ошибка при вычислении корня: " + e.getMessage());
        }
    }
}

class SquareRootCalculator {
    /**
     * Вычисляет квадратный корень числа
     * @param number число, из которого извлекается корень
     * @return квадратный корень числа
     * @throws OperationAttemptException если число отрицательное
     */
    public double calculateSquareRoot(double number) throws OperationAttemptException {
        if (number < 0) throw new OperationAttemptException("Невозможно извлечь корень из отрицательного числа: " + number);
        return Math.sqrt(number);
    }
}