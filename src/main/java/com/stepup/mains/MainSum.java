package com.stepup.mains;

public class MainSum {
    public static void main(String[] args) {
        // Инициализируем сумму
        double totalSum = 0;

        // Проходим по всем переданным параметрам
        for (String str : args) {
            try {
                // Пытаемся преобразовать строку в число
                double parsNumber = Double.parseDouble(str);
                totalSum += parsNumber;
            } catch (NumberFormatException e) {
                // Если преобразование не удалось, то просто ничего не делаем)
                // т.е.  Ничего не прибавляем
                System.out.println("Некорректное число: " + str + ". Будем считать его 0");
            }
        }
        // Выводим результат
        System.out.println("Результат: " + totalSum);
    }
}