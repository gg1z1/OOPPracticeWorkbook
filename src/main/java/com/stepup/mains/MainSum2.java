package com.stepup.mains;

import java.util.Scanner;

public class MainSum2 {
    public static void main(String[] args) {
        double total = 0;
        Scanner scannerOfNumbers = new Scanner(System.in);

        // Регулярное выражение для проверки формата числа
        String numberPattern = "^-?\\d+(\\.\\d+)?$";

        // Проходим по всем переданным параметрам
        for (String str : args) {
            boolean isValid = false;

            //до тех пор, пока параметр не будет валиден
            //(т.е. до тех пор, пока мы не вобьём число вместо него)
            //проверяем его на соответствие паттерну числа
            while (!isValid) {
                // Проверяем строку на соответствие формату числа
                if (str.matches(numberPattern)) {
                    total += Double.parseDouble(str);
                    isValid = true;
                } else {
                    System.out.println("Ошибка: \"" + str + "\" - это не число!");
                    System.out.print("Введите корректное число: ");
                    str = scannerOfNumbers.nextLine();
                }
            }
        }

        System.out.println("Результат: " + total);
        scannerOfNumbers.close();
    }
}