package com.stepup.mains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainCollectionsCheck {
    public static void main(String[] args) {

//        // Тестовые данные
//        int[] testArray = {5, 3, 8, 4, 2};
//        ArrayList<Integer> testList = new ArrayList<>();
//        for (int num : testArray) {
//            testList.add(num);
//        }
//
//        // Ожидаемый результат
//        int[] expectedArray = {2, 3, 4, 5, 8};
//        ArrayList<Integer> expectedList = new ArrayList<>();
//        for (int num : expectedArray) {
//            expectedList.add(num);
//        }
//
//        // Клонируем массивы для тестирования обеих реализаций
//        int[] arrayCopy = testArray.clone();
//        ArrayList<Integer> listCopy = new ArrayList<>(testList);
//
//        // Тестируем сортировку для ArrayList
//        bubbleSort(listCopy);
//        System.out.println("Тестирование ArrayList:");
//        System.out.println("Исходные данные: " + testList);
//        System.out.println("Результат сортировки: " + listCopy);
//        System.out.println("Ожидаемый результат: " + expectedList);
//        System.out.println("Тест пройден: " + listCopy.equals(expectedList));
//
//        // Тестируем сортировку для массива
//        bubbleSort(arrayCopy);
//        System.out.println("\nТестирование массива:");
//        System.out.println("Исходные данные: " + Arrays.toString(testArray));
//        System.out.println("Результат сортировки: " + Arrays.toString(arrayCopy));
//        System.out.println("Ожидаемый результат: " + Arrays.toString(expectedArray));
//        System.out.println("Тест пройден: " + Arrays.equals(arrayCopy, expectedArray));

        // Тестирование для массива
        int[] array = {1, 2, 3, 4, 5};
        int[] expectedArray = {5, 4, 3, 2, 1};

        System.out.println("Тестирование массива:");
        System.out.println("Исходный массив: " + Arrays.toString(array));

        reverse(array);

        System.out.println("Результат: " + Arrays.toString(array));
        System.out.println("Ожидаемый результат: " + Arrays.toString(expectedArray));
        System.out.println("Тест пройден: " + Arrays.equals(array, expectedArray));

        // Тестирование для ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(5);
        expectedList.add(4);
        expectedList.add(3);
        expectedList.add(2);
        expectedList.add(1);

        System.out.println("\nТестирование ArrayList:");
        System.out.println("Исходный список: " + list);

        reverse(list);

        System.out.println("Результат: " + list);
        System.out.println("Ожидаемый результат: " + expectedList);
        System.out.println("Тест пройден: " + list.equals(expectedList));

    }

    public static void swapPairs () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите чётное число N: ");
        int n = scanner.nextInt();
        if (n % 2 != 0) { System.out.println("Число должно быть чётным!"); return; }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) list.add(i);
        System.out.println("Исходный список: " + list);

        //перестановка
        for (int i = 0; i < n; i += 2) {
            if (i + 1 < n) {
                int temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
            }
        }
        System.out.println("Результат: " + list);
    }

    public static void bubbleSort(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() - 1; i++) {
            for (int j = 0; j < intList.size() - i - 1; j++) {
                if (intList.get(j) > intList.get(j + 1)) {
                    int temp = intList.get(j);
                    intList.set(j, intList.get(j + 1));
                    intList.set(j + 1, temp);
                }
            }
        }
    }

    public static void bubbleSort(int[] intArray) {
        int n = intArray.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }

    public static void reverse(int[] intArray) {
        int n = intArray.length - 1;
        for (int i = 0; i < intArray.length / 2; i++) {
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
    }

    public static void reverse(ArrayList<Integer> intList) {
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(intList.size() - i - 1));
            intList.set(intList.size() - i - 1, temp) ;
        }
    }

}


