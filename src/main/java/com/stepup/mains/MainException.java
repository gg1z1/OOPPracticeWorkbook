package com.stepup.mains;

import com.stepup.exceptions.OperationAttemptException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainException {

    public static void main(String[] args) {
        SquareRootCalculator root = new SquareRootCalculator();

        try {
            // Успешный случай
            double result = root.calculateSquareRoot(16);
            System.out.println("Квадратный корень: " + result);

//            result = root.calculateSquareRoot(-9);
//            System.out.println("Квадратный корень: " + result);

        } catch (OperationAttemptException e) {
            System.err.println("Ошибка при вычислении корня: " + e.getMessage());
        }

        String[] testFiles = {
                "existingFile.txt",    // существующий файл
                "multipleNumbers.txt",    // много правильных цифр, берёт только первые два
                "validNumbers.txt",    // другие правильные цифры
                "nonExistentFile.txt", // несуществующего файла
                "oneNumber.txt",       // файл с одним числом
                "invalidData.txt",     // файл с некорректными данными
                "zeroDivision.txt"     // файл с делением на ноль
        };

        for (String fileName : testFiles) {
            try {
                System.out.println("\nПопытка чтения файла: " + fileName);
                int result = divide(fileName);
                System.out.println("Результат деления: " + result);
            } catch (OperationAttemptException e) {
                System.err.println("Ошибка при обработке файла " + fileName + ": " + e.getMessage());
                System.out.println("Возвращаем 0");
                System.out.println("0");
            }
        }
    }

    public static int divide(String fileName) throws OperationAttemptException {
        File f = new File(fileName);
        Scanner sc = null;
        try {
            sc = new Scanner(f);
            return sc.nextInt() / sc.nextInt();
        } catch (FileNotFoundException e) {
            throw new OperationAttemptException("Файл не найден: " + e.getMessage());
        } catch (InputMismatchException e) {
            throw new OperationAttemptException("Ошибка формата данных: " + e.getMessage());
        } catch (NoSuchElementException e) {
            throw new OperationAttemptException("Недостаточно чисел в файле: " + e.getMessage());
        } catch (ArithmeticException e) {
            throw new OperationAttemptException("Деление на ноль: " + e.getMessage());
        } finally {
            if (sc != null) sc.close();
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