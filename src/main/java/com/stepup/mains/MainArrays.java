package com.stepup.mains;

import java.util.Arrays;

public class MainArrays {
    public static void main(String[] str) {

//        // Тестирование функции findFirst
//        System.out.println("Тестирование функции findFirst");
//
//// Тест 1: элемент в начале массива
//        System.out.println("\nТестовый случай 1: элемент в начале массива");
//        int[] arr1 = {2, 3, 4, 5, 6};
//        System.out.println("Вводим: findFirst(" + Arrays.toString(arr1) + ", 2)");
//        System.out.println("Ожидаемый результат: 0");
//        System.out.println("Фактический результат: " + findFirst(arr1, 2));
//
//// Тест 2: элемент в середине массива
//        System.out.println("\nТестовый случай 2: элемент в середине массива");
//        int[] arr2 = {1, 2, 3, 4, 5};
//        System.out.println("Вводим: findFirst(" + Arrays.toString(arr2) + ", 3)");
//        System.out.println("Ожидаемый результат: 2");
//        System.out.println("Фактический результат: " + findFirst(arr2, 3));
//
//// Тест 3: элемент в конце массива
//        System.out.println("\nТестовый случай 3: элемент в конце массива");
//        int[] arr3 = {1, 2, 3, 4, 5};
//        System.out.println("Вводим: findFirst(" + Arrays.toString(arr3) + ", 5)");
//        System.out.println("Ожидаемый результат: 4");
//        System.out.println("Фактический результат: " + findFirst(arr3, 5));
//
//// Тест 4: элемент встречается несколько раз
//        System.out.println("\nТестовый случай 4: элемент встречается несколько раз");
//        int[] arr4 = {1, 2, 3, 2, 2, 5};
//        System.out.println("Вводим: findFirst(" + Arrays.toString(arr4) + ", 2)");
//        System.out.println("Ожидаемый результат: 1");
//        System.out.println("Фактический результат: " + findFirst(arr4, 2));
//
//// Тест 5: элемент не найден
//        System.out.println("\nТестовый случай 5: элемент не найден");
//        int[] arr5 = {1, 2, 3, 4, 5};
//        System.out.println("Вводим: findFirst(" + Arrays.toString(arr5) + ", 6)");
//        System.out.println("Ожидаемый результат: -1");
//        System.out.println("Фактический результат: " + findFirst(arr5, 6));
//
//// Тест 6: пустой массив
//        System.out.println("\nТестовый случай 6: пустой массив");
//        int[] arr6 = {};
//        System.out.println("Вводим: findFirst(" + Arrays.toString(arr6) + ", 1)");
//        System.out.println("Ожидаемый результат: -1");
//        System.out.println("Фактический результат: " + findFirst(arr6, 1));
//
//// Тест 7: массив с одним элементом (найден)
//        System.out.println("\nТестовый случай 7: массив с одним элементом (найден)");
//        int[] arr7 = {7};
//        System.out.println("Вводим: findFirst(" + Arrays.toString(arr7) + ", 7)");
//        System.out.println("Ожидаемый результат: 0");
//        System.out.println("Фактический результат: " + findFirst(arr7, 7));
//
//// Тест 8: массив с одним элементом (не найден)
//        System.out.println("\nТестовый случай 8: массив с одним элементом (не найден)");
//        int[] arr8 = {7};
//        System.out.println("Вводим: findFirst(" + Arrays.toString(arr8) + ", 8)");
//        System.out.println("Ожидаемый результат: -1");
//        System.out.println("Фактический результат: " + findFirst(arr8, 8));
//
//        //задание 2
//// Тестирование функции findLast
//        System.out.println("Тестирование функции findLast");
//
//// Тест 1: элемент встречается несколько раз
//        System.out.println("\nТестовый случай 1: элемент встречается несколько раз");
//        int[] arr1 = {1, 2, 3, 4, 2, 2, 5};
//        System.out.println("Вводим: findLast(" + Arrays.toString(arr1) + ", 2)");
//        System.out.println("Ожидаемый результат: 5");
//        System.out.println("Фактический результат: " + findLast(arr1, 2));
//
//// Тест 2: элемент встречается один раз
//        System.out.println("\nТестовый случай 2: элемент встречается один раз");
//        int[] arr2 = {5, 8, 12, 7, 3};
//        System.out.println("Вводим: findLast(" + Arrays.toString(arr2) + ", 12)");
//        System.out.println("Ожидаемый результат: 2");
//        System.out.println("Фактический результат: " + findLast(arr2, 12));
//
//// Тест 3: элемент не встречается
//        System.out.println("\nТестовый случай 3: элемент не встречается");
//        int[] arr3 = {10, 20, 30, 40};
//        System.out.println("Вводим: findLast(" + Arrays.toString(arr3) + ", 50)");
//        System.out.println("Ожидаемый результат: -1");
//        System.out.println("Фактический результат: " + findLast(arr3, 50));
//
//// Тест 4: пустой массив
//        System.out.println("\nТестовый случай 4: пустой массив");
//        int[] arr4 = {};
//        System.out.println("Вводим: findLast(" + Arrays.toString(arr4) + ", 5)");
//        System.out.println("Ожидаемый результат: -1");
//        System.out.println("Фактический результат: " + findLast(arr4, 5));
//
//// Тест 5: массив с одним элементом (совпадение)
//        System.out.println("\nТестовый случай 5: массив с одним элементом (совпадение)");
//        int[] arr5 = {7};
//        System.out.println("Вводим: findLast(" + Arrays.toString(arr5) + ", 7)");
//        System.out.println("Ожидаемый результат: 0");
//        System.out.println("Фактический результат: " + findLast(arr5, 7));
//
//// Тест 6: массив с одним элементом (не совпадение)
//        System.out.println("\nТестовый случай 6: массив с одним элементом (не совпадение)");
//        int[] arr6 = {7};
//        System.out.println("Вводим: findLast(" + Arrays.toString(arr6) + ", 8)");
//        System.out.println("Ожидаемый результат: -1");
//        System.out.println("Фактический результат: " + findLast(arr6, 8));
//
//// Тест 7: элемент в начале массива
//        System.out.println("\nТестовый случай 7: элемент в начале массива");
//        int[] arr7 = {5, 1, 2, 3, 4};
//        System.out.println("Вводим: findLast(" + Arrays.toString(arr7) + ", 5)");
//        System.out.println("Ожидаемый результат: 0");
//        System.out.println("Фактический результат: " + findLast(arr7, 5));
//
//// Тест 8: элемент в конце массива
//        System.out.println("\nТестовый случай 8: элемент в конце массива");
//        int[] arr8 = {1, 2, 3, 4, 5};
//        System.out.println("Вводи: findLast(" + Arrays.toString(arr8) + ", 5)");
//        System.out.println("Ожидаемый результат: 4");
//        System.out.println("Фактический результат: " + findLast(arr8, 5));
//
//        //Задание 3
//        // Тест 1: Положительные и отрицательные числа
//        System.out.println("\nТестовый случай 1: Положительные и отрицательные числа");
//        System.out.println("Вводим: maxAbs([1, -2, -7, 4, 2, 2, 5])");
//        System.out.println("Ожидаемый результат: -7");
//        System.out.println("Фактический результат: " + maxAbs(new int[]{1, -2, -7, 4, 2, 2, 5}));
//
//        // Тест 2: Все положительные числа
//        System.out.println("\nТестовый случай 2: Все положительные числа");
//        System.out.println("Вводим: maxAbs([10, 20, 30, 40, 50])");
//        System.out.println("Ожидаемый результат: 50");
//        System.out.println("Фактический результат: " + maxAbs(new int[]{10, 20, 30, 40, 50}));
//
//        // Тест 3: Все отрицательные числа
//        System.out.println("\nТестовый случай 3: Все отрицательные числа");
//        System.out.println("Вводим: maxAbs([-10, -20, -30, -40, -50])");
//        System.out.println("Ожидаемый результат: -50");
//        System.out.println("Фактический результат: " + maxAbs(new int[]{-10, -20, -30, -40, -50}));
//
//        // Тест 4: Один элемент
//        System.out.println("\nТестовый случай 4: Один элемент");
//        System.out.println("Вводим: maxAbs([42])");
//        System.out.println("Ожидаемый результат: 42");
//        System.out.println("Фактический результат: " + maxAbs(new int[]{42}));
//
//        // Тест 5: Нули и положительные числа
//        System.out.println("\nТестовый случай 5: Нули и положительные числа");
//        System.out.println("Вводим: maxAbs([0, 0, 5, 0, 0])");
//        System.out.println("Ожидаемый результат: 5");
//        System.out.println("Фактический результат: " + maxAbs(new int[]{0, 0, 5, 0, 0}));
//
//        // Тест 6: Нули и отрицательные числа
//        System.out.println("\nТестовый случай 6: Нули и отрицательные числа");
//        System.out.println("Вводим: maxAbs([0, -3, 0, -1, 0])");
//        System.out.println("Ожидаемый результат: -3");
//        System.out.println("Фактический результат: " + maxAbs(new int[]{0, -3, 0, -1, 0}));
//
//        // Тест 7: Одинаковые по модулю числа
//        System.out.println("\nТестовый случай 7: Одинаковые по модулю числа");
//        System.out.println("Вводим: maxAbs([3, -3, 3, -3])");
//        System.out.println("Ожидаемый результат: 3 (или -3, возвращается первый найденный)");
//        System.out.println("Фактический результат: " + maxAbs(new int[]{3, -3, 3, -3}));
//
//        //Задание 4
//        System.out.println("Тестирование функции countPositive");
//
//        // Тест 1: базовый случай с положительными и отрицательными числами
//        System.out.println("\nТестовый случай 1: базовый случай");
//        int[] arr1 = {1, -2, -7, 4, 2, 2, 5};
//        System.out.println("Вводим: countPositive([1, -2, -7, 4, 2, 2, 5])");
//        System.out.println("Ожидаемый результат: 5");
//        System.out.println("Фактический результат: " + countPositive(arr1));
//
//        // Тест 2: все числа положительные
//        System.out.println("\nТестовый случай 2: все положительные числа");
//        int[] arr2 = {10, 20, 30, 40, 50};
//        System.out.println("Вводим: countPositive([10, 20, 30, 40, 50])");
//        System.out.println("Ожидаемый результат: 5");
//        System.out.println("Фактический результат: " + countPositive(arr2));
//
//        // Тест 3: все числа отрицательные
//        System.out.println("\nТестовый случай 3: все отрицательные числа");
//        int[] arr3 = {-1, -2, -3, -4, -5};
//        System.out.println("Вводим: countPositive([-1, -2, -3, -4, -5])");
//        System.out.println("Ожидаемый результат: 0");
//        System.out.println("Фактический результат: " + countPositive(arr3));
//
//        // Тест 4: массив с нулями
//        System.out.println("\nТестовый случай 4: массив с нулями");
//        int[] arr4 = {0, 0, 0, 0, 0};
//        System.out.println("Вводим: countPositive([0, 0, 0, 0, 0])");
//        System.out.println("Ожидаемый результат: 0");
//        System.out.println("Фактический результат: " + countPositive(arr4));
//
//        // Тест 5: пустой массив
//        System.out.println("\nТестовый случай 5: пустой массив");
//        int[] arr5 = {};
//        System.out.println("Вводим: countPositive([])");
//        System.out.println("Ожидаемый результат: 0");
//        System.out.println("Фактический результат: " + countPositive(arr5));
//
//        // Тест 6: массив с одним положительным числом
//        System.out.println("\nТестовый случай 6: одно положительное число");
//        int[] arr6 = {5};
//        System.out.println("Вводим: countPositive([5])");
//        System.out.println("Ожидаемый результат: 1");
//        System.out.println("Фактический результат: " + countPositive(arr6));
//
//        // Тест 7: массив с одним отрицательным числом
//        System.out.println("\nТестовый случай 7: одно отрицательное число");
//        int[] arr7 = {-5};
//        System.out.println("Вводим: countPositive([-5])");
//        System.out.println("Ожидаемый результат: 0");
//        System.out.println("Фактический результат: " + countPositive(arr7));
//
//        // Тест 8: массив с чередующимися знаками
//        System.out.println("\nТестовый случай 8: чередующиеся знаки");
//        int[] arr8 = {1, -1, 2, -2, 3, -3};
//        System.out.println("Вводим: countPositive([1, -1, 2, -2, 3, -3])");
//        System.out.println("Ожидаемый результат: 3");
//        System.out.println("Фактический результат: " + countPositive(arr8));
//        //Задание 5
//
//                System.out.println("Тестирование функции palindrom");
//
//                // Тест 1: пример из условия (не палиндром)
//                System.out.println("\nТестовый случай 1: пример из условия (не палиндром)");
//                int[] test1 = {1, -2, -7, 4, 2, 2, 5};
//                System.out.println("Вводим: palindrom(" + arrayToString(test1) + ")");
//                System.out.println("Ожидаемый результат: false");
//                System.out.println("Фактический результат: " + palindrom(test1));
//
//                // Тест 2: пример из условия (палиндром)
//                System.out.println("\nТестовый случай 2: пример из условия (палиндром)");
//                int[] test2 = {1, -2, -7, 4, -7, -2, 1};
//                System.out.println("Вводим: palindrom(" + arrayToString(test2) + ")");
//                System.out.println("Ожидаемый результат: true");
//                System.out.println("Фактический результат: " + palindrom(test2));
//
//                // Тест 3: пустой массив
//                System.out.println("\nТестовый случай 3: пустой массив");
//                int[] test3 = {};
//                System.out.println("Вводим: palindrom(" + arrayToString(test3) + ")");
//                System.out.println("Ожидаемый результат: true");
//                System.out.println("Фактический результат: " + palindrom(test3));
//
//                // Тест 4: один элемент
//                System.out.println("\nТестовый случай 4: один элемент");
//                int[] test4 = {42};
//                System.out.println("Вводим: palindrom(" + arrayToString(test4) + ")");
//                System.out.println("Ожидаемый результат: true");
//                System.out.println("Фактический результат: " + palindrom(test4));
//
//                // Тест 5: два одинаковых элемента
//                System.out.println("\nТестовый случай 5: два одинаковых элемента");
//                int[] test5 = {5, 5};
//                System.out.println("Вводим: palindrom(" + arrayToString(test5) + ")");
//                System.out.println("Ожидаемый результат: true");
//                System.out.println("Фактический результат: " + palindrom(test5));
//
//                // Тест 6: два разных элемента
//                System.out.println("\nТестовый случай 6: два разных элемента");
//                int[] test6 = {1, 2};
//                System.out.println("Вводим: palindrom(" + arrayToString(test6) + ")");
//                System.out.println("Ожидаемый результат: false");
//                System.out.println("Фактический результат: " + palindrom(test6));
//
//                // Тест 7: палиндром с отрицательными числами
//                System.out.println("\nТестовый случай 7: палиндром с отрицательными числами");
//                int[] test7 = {-1, -2, -3, -2, -1};
//                System.out.println("Вводим: palindrom(" + arrayToString(test7) + ")");
//                System.out.println("Ожидаемый результат: true");
//                System.out.println("Фактический результат: " + palindrom(test7));
//
//                // Тест 8: не палиндром с нулями
//                System.out.println("\nТестовый случай 8: не палиндром с нулями");
//                int[] test8 = {0, 1, 0, 2, 0};
//                System.out.println("Вводим: palindrom(" + arrayToString(test8) + ")");
//                System.out.println("Ожидаемый результат: false");
//                System.out.println("Фактический результат: " + palindrom(test8));
//        //задание 6
//        System.out.println("Тестирование функции reverse");
//
//        // Тест 1: базовый случай с нечетной длиной
//        System.out.println("\nТестовый случай 1: базовый случай (нечетная длина)");
//        int[] test1 = {1, 2, 3, 4, 5};
//        System.out.println("Вводим: reverse(" + arrayToString(test1) + ")");
//        System.out.println("Ожидаемый результат: [5, 4, 3, 2, 1]");
//        reverse(test1);
//        System.out.println("Фактический результат: " + arrayToString(test1));
//
//        // Тест 2: базовый случай с четной длиной
//        System.out.println("\nТестовый случай 2: базовый случай (четная длина)");
//        int[] test2 = {10, 20, 30, 40};
//        System.out.println("Вводим: reverse(" + arrayToString(test2) + ")");
//        System.out.println("Ожидаемый результат: [40, 30, 20, 10]");
//        reverse(test2);
//        System.out.println("Фактический результат: " + arrayToString(test2));
//
//        // Тест 3: массив с отрицательными числами
//        System.out.println("\nТестовый случай 3: массив с отрицательными числами");
//        int[] test3 = {-1, -2, -3, -4, -5};
//        System.out.println("Вводим: reverse(" + arrayToString(test3) + ")");
//        System.out.println("Ожидаемый результат: [-5, -4, -3, -2, -1]");
//        reverse(test3);
//        System.out.println("Фактический результат: " + arrayToString(test3));
//
//        // Тест 4: массив с одинаковыми элементами
//        System.out.println("\nТестовый случай 4: массив с одинаковыми элементами");
//        int[] test4 = {5, 5, 5, 5, 5};
//        System.out.println("Вводим: reverse(" + arrayToString(test4) + ")");
//        System.out.println("Ожидаемый результат: [5, 5, 5, 5, 5]");
//        reverse(test4);
//        System.out.println("Фактический результат: " + arrayToString(test4));
//
//        // Тест 5: массив с чередующимися положительными и отрицательными числами
//        System.out.println("\nТестовый случай 5: чередующиеся числа");
//        int[] test5 = {1, -1, 2, -2, 3, -3};
//        System.out.println("Вводим: reverse(" + arrayToString(test5) + ")");
//        System.out.println("Ожидаемый результат: [-3, 3, -2, 2, -1, 1]");
//        reverse(test5);
//        System.out.println("Фактический результат: " + arrayToString(test5));
//
//        // Тест 6: массив с одним элементом
//        System.out.println("\nТестовый случай 6: один элемент");
//        int[] test6 = {42};
//        System.out.println("Вводим: reverse(" + arrayToString(test6) + ")");
//        System.out.println("Ожидаемый результат: [42]");
//        reverse(test6);
//        System.out.println("Фактический результат: " + arrayToString(test6));
//
//        // Тест 7: пустой массив
//        System.out.println("\nТестовый случай 7: пустой массив");
//        int[] test7 = {};
//        System.out.println("Вводим: reverse(" + arrayToString(test7) + ")");
//        System.out.println("Ожидаемый результат: []");
//        reverse(test7);
//        System.out.println("Фактический результат: " + arrayToString(test7));
//        //Задание 7
//// Тестирование функции reverseBack
//        System.out.println("Тестирование функции reverseBack");
//
//// Тест 1: базовый пример из условия
//        System.out.println("\nТестовый случай 1: базовый пример");
//        int[] test1 = {1, 2, 3, 4, 5};
//        System.out.println("Вводим: reverseBack(" + Arrays.toString(test1) + ")");
//        System.out.println("Ожидаемый результат: [5, 4, 3, 2, 1]");
//        System.out.println("Фактический результат: " + Arrays.toString(reverseBack(test1)));
//
//// Тест 2: массив с отрицательными числами
//        System.out.println("\nТестовый случай 2: массив с отрицательными числами");
//        int[] test2 = {-1, -2, -3, -4, -5};
//        System.out.println("Вводим: reverseBack(" + Arrays.toString(test2) + ")");
//        System.out.println("Ожидаемый результат: [-5, -4, -3, -2, -1]");
//        System.out.println("Фактический результат: " + Arrays.toString(reverseBack(test2)));
//
//// Тест 3: массив с разными знаками
//        System.out.println("\nТестовый случай 3: массив с разными знаками");
//        int[] test3 = {1, -2, 3, -4, 5};
//        System.out.println("Вводим: reverseBack(" + Arrays.toString(test3) + ")");
//        System.out.println("Ожидаемый результат: [5, -4, 3, -2, 1]");
//        System.out.println("Фактический результат: " + Arrays.toString(reverseBack(test3)));
//
//// Тест 4: массив из одного элемента
//        System.out.println("\nТестовый случай 4: массив из одного элемента");
//        int[] test4 = {42};
//        System.out.println("Вводим: reverseBack(" + Arrays.toString(test4) + ")");
//        System.out.println("Ожидаемый результат: [42]");
//        System.out.println("Фактический результат: " + Arrays.toString(reverseBack(test4)));
//
//// Тест 5: пустой массив
//        System.out.println("\nТестовый случай 5: пустой массив");
//        int[] test5 = {};
//        System.out.println("Вводим: reverseBack(" + Arrays.toString(test5) + ")");
//        System.out.println("Ожидаемый результат: []");
//        System.out.println("Фактический результат: " + Arrays.toString(reverseBack(test5)));
//
//// Тест 6: массив с одинаковыми элементами
//        System.out.println("\nТестовый случай 6: массив с одинаковыми элементами");
//        int[] test6 = {7, 7, 7, 7};
//        System.out.println("Вводим: reverseBack(" + Arrays.toString(test6) + ")");
//        System.out.println("Ожидаемый результат: [7, 7, 7, 7]");
//        System.out.println("Фактический результат: " + Arrays.toString(reverseBack(test6)));
//
//// Тест 7: массив с четным количеством элементов
//        System.out.println("\nТестовый случай 7: массив с четным количеством элементов");
//        int[] test7 = {10, 20, 30, 40};
//        System.out.println("Вводим: reverseBack(" + Arrays.toString(test7) + ")");
//        System.out.println("Ожидаемый результат: [40, 30, 20, 10]");
//        System.out.println("Фактический результат: " + Arrays.toString(reverseBack(test7)));

//        //Задание 8
//// Тест 1: базовый случай с непустыми массивами
//        System.out.println("\nТестовый случай 1: базовый случай");
//        int[] test1a = {1, 2, 3};
//        int[] test1b = {4, 5, 6};
//        System.out.println("Вводим: concat(" + arrayToString(test1a) + ", " + arrayToString(test1b) + ")");
//        System.out.println("Ожидаемый результат: [1, 2, 3, 4, 5, 6]");
//        System.out.println("Фактический результат: " + arrayToString(concat(test1a, test1b)));
//
//// Тест 2: первый массив пустой
//        System.out.println("\nТестовый случай 2: первый массив пустой");
//        int[] test2a = {};
//        int[] test2b = {7, 8, 9};
//        System.out.println("Вводим: concat(" + arrayToString(test2a) + ", " + arrayToString(test2b) + ")");
//        System.out.println("Ожидаемый результат: [7, 8, 9]");
//        System.out.println("Фактический результат: " + arrayToString(concat(test2a, test2b)));
//
//// Тест 3: второй массив пустой
//        System.out.println("\nТестовый случай 3: второй массив пустой");
//        int[] test3a = {10, 11, 12};
//        int[] test3b = {};
//        System.out.println("Вводим: concat(" + arrayToString(test3a) + ", " + arrayToString(test3b) + ")");
//        System.out.println("Ожидаемый результат: [10, 11, 12]");
//        System.out.println("Фактический результат: " + arrayToString(concat(test3a, test3b)));
//
//// Тест 4: оба массива пустые
//        System.out.println("\nТестовый случай 4: оба массива пустые");
//        int[] test4a = {};
//        int[] test4b = {};
//        System.out.println("Вводим: concat(" + arrayToString(test4a) + ", " + arrayToString(test4b) + ")");
//        System.out.println("Ожидаемый результат: []");
//        System.out.println("Фактический результат: " + arrayToString(concat(test4a, test4b)));
//
//// Тест 5: массивы разной длины
//        System.out.println("\nТестовый случай 5: массивы разной длины");
//        int[] test5a = {1, 2};
//        int[] test5b = {3, 4, 5, 6};
//        System.out.println("Вводим: concat(" + arrayToString(test5a) + ", " + arrayToString(test5b) + ")");
//        System.out.println("Ожидаемый результат: [1, 2, 3, 4, 5, 6]");
//        System.out.println("Фактический результат: " + arrayToString(concat(test5a, test5b)));
//
//// Тест 6: отрицательные числа
//        System.out.println("\nТестовый случай 6: отрицательные числа");
//        int[] test6a = {-1, -2, -3};
//        int[] test6b = {-4, -5, -6};
//        System.out.println("Вводим: concat(" + arrayToString(test6a) + ", " + arrayToString(test6b) + ")");
//        System.out.println("Ожидаемый результат: [-1, -2, -3, -4, -5, -6]");
//        System.out.println("Фактический результат: " + arrayToString(concat(test6a, test6b)));
//
//// Тест 7: смешанные положительные и отрицательные числа
//        System.out.println("\nТестовый случай 7: смешанные положительные и отрицательные числа");
//        int[] test7a = {-1, 2, -3, 4};
//        int[] test7b = {5, -6, 7, -8};
//        System.out.println("Вводим: concat(" + arrayToString(test7a) + ", " + arrayToString(test7b) + ")");
//        System.out.println("Ожидаемый результат: -1, 2, -3, 4, 5, -6, 7, -8");
//        System.out.println("Фактический результат: " + arrayToString(concat(test7a, test7b)));
//
//// Тест 8: массивы с нулями
//        System.out.println("\nТестовый случай 8: массивы с нулями");
//        int[] test8a = {0, 0, 1};
//        int[] test8b = {2, 0, 3};
//        System.out.println("Вводим: concat(" + arrayToString(test8a) + ", " + arrayToString(test8b) + ")");
//        System.out.println("Ожидаемый результат: 0, 0, 1, 2, 0, 3");
//        System.out.println("Фактический результат: " + arrayToString(concat(test8a, test8b)));
//
//// Тест 9: большие числа
//        System.out.println("\nТестовый случай 9: большие числа");
//        int[] test9a = {1000000, 2000000};
//        int[] test9b = {3000000, 4000000};
//        System.out.println("Вводим: concat(" + arrayToString(test9a) + ", " + arrayToString(test9b) + ")");
//        System.out.println("Ожидаемый результат: 1000000, 2000000, 3000000, 4000000");
//        System.out.println("Фактический результат: " + arrayToString(concat(test9a, test9b)));
//
//// Тест 10: один элемент в каждом массиве
//        System.out.println("\nТестовый случай 10: один элемент в каждом массиве");
//        int[] test10a = {42};
//        int[] test10b = {99};
//        System.out.println("Вводим: concat(" + arrayToString(test10a) + ", " + arrayToString(test10b) + ")");
//        System.out.println("Ожидаемый результат: 42, 99");
//        System.out.println("Фактический результат: " + arrayToString(concat(test10a, test10b)));
//
//// Тест 11: проверка на сохранение порядка
//        System.out.println("\nТестовый случай 11: проверка на сохранение порядка");
//        int[] test11a = {10, 20, 30};
//        int[] test11b = {40, 50, 60};
//        System.out.println("Вводим: concat(" + arrayToString(test11a) + ", " + arrayToString(test11b) + ")");
//        System.out.println("Ожидаемый результат: 10, 20, 30, 40, 50, 60");
//        System.out.println("Фактический результат: " + arrayToString(concat(test11a, test11b)));

//    //задание 9
//        System.out.println("Тестирование функции findAll");
//
//// Тест 1: пример из условия
//        System.out.println("\nТестовый случай 1: пример из условия");
//        int[] test1 = {1, 2, 3, 8, 2, 2, 9};
//        int x1 = 2;
//        System.out.println("Вводим: findAll(" + arrayToString(test1) + ", " + x1 + ")");
//        System.out.println("Ожидаемый результат: [1, 4, 5]");
//        System.out.println("Фактический результат: " + arrayToString(findAll(test1, x1)));
//
//// Тест 2: элемент встречается один раз
//        System.out.println("\nТестовый случай 2: элемент встречается один раз");
//        int[] test2 = {5, 7, 9, 3};
//        int x2 = 9;
//        System.out.println("Вводим: findAll(" + arrayToString(test2) + ", " + x2 + ")");
//        System.out.println("Ожидаемый результат: [2]");
//        System.out.println("Фактический результат: " + arrayToString(findAll(test2, x2)));
//
//// Тест 3: элемент не встречается
//        System.out.println("\nТестовый случай 3: элемент не встречается");
//        int[] test3 = {10, 20, 30, 40};
//        int x3 = 50;
//        System.out.println("Вводим: findAll(" + arrayToString(test3) + ", " + x3 + ")");
//        System.out.println("Ожидаемый результат: []");
//        System.out.println("Фактический результат: " + arrayToString(findAll(test3, x3)));
//
//// Тест 4: все элементы одинаковые
//        System.out.println("\nТестовый случай 4: все элементы одинаковые");
//        int[] test4 = {7, 7, 7, 7, 7};
//        int x4 = 7;
//        System.out.println("Вводим: findAll(" + arrayToString(test4) + ", " + x4 + ")");
//        System.out.println("Ожидаемый результат: [0, 1, 2, 3, 4]");
//        System.out.println("Фактический результат: " + arrayToString(findAll(test4, x4)));
//
//// Тест 5: пустой массив
//        System.out.println("\nТестовый случай 5: пустой массив");
//        int[] test5 = {};
//        int x5 = 1;
//        System.out.println("Вводим: findAll(" + arrayToString(test5) + ", " + x5 + ")");
//        System.out.println("Ожидаемый результат: []");
//        System.out.println("Фактический результат: " + arrayToString(findAll(test5, x5)));
//
//// Тест 6: отрицательные числа
//        System.out.println("\nТестовый случай 6: отрицательные числа");
//        int[] test6 = {-1, -2, -3, -2, -4};
//        int x6 = -2;
//        System.out.println("Вводим: findAll(" + arrayToString(test6) + ", " + x6 + ")");
//        System.out.println("Ожидаемый результат: [1, 3]");
//        System.out.println("Фактический результат: " + arrayToString(findAll(test6, x6)));
//// Тест 8: элемент встречается несколько раз подряд
//        System.out.println("\nТестовый случай 8: элемент встречается несколько раз подряд");
//        int[] test8 = {1, 2, 2, 2, 3, 4};
//        int x8 = 2;
//        System.out.println("Вводим: findAll(" + arrayToString(test8) + ", " + x8 + ")");
//        System.out.println("Ожидаемый результат: 1, 2, 3");
//        System.out.println("Фактический результат: " + arrayToString(findAll(test8, x8)));
//
//// Тест 9: массив с одним элементом
//        System.out.println("\nТестовый случай 9: массив с одним элементом");
//        int[] test9 = {42};
//        int x9 = 42;
//        System.out.println("Вводимый массив: findAll(" + arrayToString(test9) + ", " + x9 + ")");
//        System.out.println("Ожидаемый результат: 0");
//        System.out.println("Фактический результат: " + arrayToString(findAll(test9, x9)));
//
//// Тест 10: массив с одним элементом (элемент не совпадает)
//        System.out.println("\nТестовый случай 10: массив с одним элементом (элемент не совпадает)");
//        int[] test10 = {42};
//        int x10 = 24;
//        System.out.println("Вводимый массив: findAll(" + arrayToString(test10) + ", " + x10 + ")");
//        System.out.println("Ожидаемый результат: ");
//        System.out.println("Фактический результат: " + arrayToString(findAll(test10, x10)));
//
//// Тест 11: массив с повторяющимися элементами и искомым в середине
//        System.out.println("\nТестовый случай 11: массив с повторяющимися элементами и искомым в середине");
//        int[] test11 = {1, 1, 1, 2, 1, 1, 1};
//        int x11 = 2;
//        System.out.println("Вводимый массив: findAll(" + arrayToString(test11) + ", " + x11 + ")");
//        System.out.println("Ожидаемый результат: 3");
//        System.out.println("Фактический результат: " + arrayToString(findAll(test11, x11)));
//
//// Тест 12: массив с большими числами
//        System.out.println("\nТестовый случай 12: массив с большими числами");
//        int[] test12 = {1000000, 2000000, 1000000, 3000000};
//        int x12 = 1000000;
//        System.out.println("Вводимый массив: findAll(" + arrayToString(test12) + ", " + x12 + ")");
//        System.out.println("Ожидаемый результат: 0, 2");
//        System.out.println("Фактический результат: " + arrayToString(findAll(test12, x12)));

//        //задание 10
//// Тест 1: базовый пример из условия
//        System.out.println("\nТестовый случай 1: базовый пример из условия");
//        int[] test1 = {1, 2, -3, 4, -2, 2, -5};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test1) + ")");
//        System.out.println("Ожидаемый результат: [1, 2, 4, 2]");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test1)));
//
//// Тест 2: массив только с положительными числами
//        System.out.println("\nТестовый случай 2: массив только с положительными числами");
//        int[] test2 = {5, 10, 15, 20};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test2) + ")");
//        System.out.println("Ожидаемый результат: [5, 10, 15, 20]");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test2)));
//
//// Тест 3: массив только с отрицательными числами
//        System.out.println("\nТестовый случай 3: массив только с отрицательными числами");
//        int[] test3 = {-1, -2, -3, -4};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test3) + ")");
//        System.out.println("Ожидаемый результат: []");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test3)));
//
//// Тест 4: массив с нулями
//        System.out.println("\nТестовый случай 4: массив с нулями");
//        int[] test4 = {0, 0, 0, 0};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test4) + ")");
//        System.out.println("Ожидаемый результат: [0, 0, 0, 0]");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test4)));
//
//// Тест 5: смешанный массив с нулями и отрицательными
//        System.out.println("\nТестовый случай 5: смешанный массив с нулями и отрицательными");
//        int[] test5 = {0, -1, 2, -3, 4, 0, -5};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test5) + ")");
//        System.out.println("Ожидаемый результат: [0, 2, 4, 0]");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test5)));
//
//// Тест 6: пустой массив
//        System.out.println("\nТестовый случай 6: пустой массив");
//        int[] test6 = {};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test6) + ")");
//        System.out.println("Ожидаемый результат: []");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test6)));
//
//// Тест 7: массив с одним положительным элементом
//        System.out.println("\nТестовый случай 7: массив с одним положительным элементом");
//        int[] test7 = {7};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test7) + ")");
//        System.out.println("Ожидаемый результат: [7]");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test7)));
//
//// Тест 8: массив с одним отрицательным элементом
//        System.out.println("\nТестовый случай 8: массив с одним отрицательным элементом");
//        int[] test8 = {-7};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test8) + ")");
//        System.out.println("Ожидаемый результат: []");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test8)));
//
//// Тест 9: массив с чередующимися положительными и отрицательными
//        System.out.println("\nТестовый случай 9: массив с чередующимися положительными и отрицательными");
//        int[] test9 = {1, -1, 2, -2, 3, -3};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test9) + ")");
//        System.out.println("Ожидаемый результат: 1, 2, 3");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test9)));
//
//// Тест 10: массив с большими числами
//        System.out.println("\nТестовый случай 10: массив с большими числами");
//        int[] test10 = {100000, -50000, 200000, -300000, 400000};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test10) + ")");
//        System.out.println("Ожидаемый результат: 100000, 200000, 400000");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test10)));
//
//// Тест 11: массив с повторяющимися элементами
//        System.out.println("\nТестовый случай 11: массив с повторяющимися элементами");
//        int[] test11 = {5, 5, -5, 5, -5, 5};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test11) + ")");
//        System.out.println("Ожидаемый результат: 5, 5, 5, 5");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test11)));
//
//// Тест 12: массив с нулями и положительными
//        System.out.println("\nТестовый случай 12: массив с нулями и положительными");
//        int[] test12 = {0, 1, 0, 2, 0, 3};
//        System.out.println("Вводим: deleteNegative(" + arrayToString(test12) + ")");
//        System.out.println("Ожидаемый результат: 0, 1, 0, 2, 0, 3");
//        System.out.println("Фактический результат: " + arrayToString(deleteNegative(test12)));

//        //задание 11
//        System.out.println("Тестирование функции add");
//
//// Тест 1: базовый случай из условия
//        System.out.println("\nТестовый случай 1: базовый случай из условия");
//        int[] test1 = {1, 2, 3, 4, 5};
//        int x1 = 9;
//        int pos1 = 3;
//        System.out.println("Вводим: add(" + arrayToString(test1) + ", " + x1 + ", " + pos1 + ")");
//        System.out.println("Ожидаемый результат: [1, 2, 3, 9, 4, 5]");
//        System.out.println("Фактический результат: " + arrayToString(add(test1, x1, pos1)));
//
//// Тест 2: вставка в начало массива
//        System.out.println("\nТестовый случай 2: вставка в начало массива");
//        int[] test2 = {5, 6, 7};
//        int x2 = 0;
//        int pos2 = 0;
//        System.out.println("Вводим: add(" + arrayToString(test2) + ", " + x2 + ", " + pos2 + ")");
//        System.out.println("Ожидаемый результат: [0, 5, 6, 7]");
//        System.out.println("Фактический результат: " + arrayToString(add(test2, x2, pos2)));
//
//// Тест 3: вставка в конец массива
//        System.out.println("\nТестовый случай 3: вставка в конец массива");
//        int[] test3 = {8, 9, 10};
//        int x3 = 11;
//        int pos3 = 3;
//        System.out.println("Вводим: add(" + arrayToString(test3) + ", " + x3 + ", " + pos3 + ")");
//        System.out.println("Ожидаемый результат: [8, 9, 10, 11]");
//        System.out.println("Фактический результат: " + arrayToString(add(test3, x3, pos3)));
//
//// Тест 4: пустой массив
//        System.out.println("\nТестовый случай 4: пустой массив");
//        int[] test4 = {};
//        int x4 = 42;
//        int pos4 = 0;
//        System.out.println("Вводим: add(" + arrayToString(test4) + ", " + x4 + ", " + pos4 + ")");
//        System.out.println("Ожидаемый результат: [42]");
//        System.out.println("Фактический результат: " + arrayToString(add(test4, x4, pos4)));
//
//// Тест 5: массив из одного элемента
//        System.out.println("\nТестовый случай 5: массив из одного элемента");
//        int[] test5 = {42};
//        int x5 = 24;
//        int pos5 = 1;
//        System.out.println("Вводим: add(" + arrayToString(test5) + ", " + x5 + ", " + pos5 + ")");
//        System.out.println("Ожидаемый результат: [42, 24]");
//        System.out.println("Фактический результат: " + arrayToString(add(test5, x5, pos5)));
//
//// Тест 6: отрицательные числа
//        System.out.println("\nТестовый случай 6: отрицательные числа");
//        int[] test6 = {-1, -2, -3};
//        int x6 = -99;
//        int pos6 = 1;
//        System.out.println("Вводим: add(" + arrayToString(test6) + ", " + x6 + ", " + pos6 + ")");
//        System.out.println("Ожидаемый результат: [-1, -99, -2, -3]");
//        System.out.println("Фактический результат: " + arrayToString(add(test6, x6, pos6)));
//
//// Тест 7: большие числа
//        System.out.println("\nТестовый случай 7: большие числа");
//        int[] test7 = {1000, 2000, 3000};
//        int x7 = 9999;
//        int pos7 = 2;
//        System.out.println("Вводим: add(" + arrayToString(test7) + ", " + x7 + ", " + pos7 + ")");
//        System.out.println("Ожидаемый результат: 1000, 2000, 9999, 3000");
//        System.out.println("Фактический результат: " + arrayToString(add(test7, x7, pos7)));
//
//// Тест 8: вставка в середину большого массива
//        System.out.println("\nТестовый случай 8: вставка в середину большого массива");
//        int[] test8 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int x8 = 42;
//        int pos8 = 4;
//        System.out.println("Вводим: add(" + arrayToString(test8) + ", " + x8 + ", " + pos8 + ")");
//        System.out.println("Ожидаемый результат: 1, 2, 3, 4, 42, 5, 6, 7, 8, 9");
//        System.out.println("Фактический результат: " + arrayToString(add(test8, x8, pos8)));
//
//// Тест 9: вставка в позицию 0 в большом массиве
//        System.out.println("\nТестовый случай 9: вставка в позицию 0 в большом массиве");
//        int[] test9 = {10, 20, 30, 40, 50};
//        int x9 = -1;
//        int pos9 = 0;
//        System.out.println("Вводим: add(" + arrayToString(test9) + ", " + x9 + ", " + pos9 + ")");
//        System.out.println("Ожидаемый результат: -1, 10, 20, 30, 40, 50");
//        System.out.println("Фактический результат: " + arrayToString(add(test9, x9, pos9)));
//
//// Тест 10: вставка в последнюю позицию большого массива
//        System.out.println("\nТестовый случай 10: вставка в последнюю позицию большого массива");
//        int[] test10 = {100, 200, 300, 400};
//        int x10 = 500;
//        int pos10 = 4;
//        System.out.println("Вводим: add(" + arrayToString(test10) + ", " + x10 + ", " + pos10 + ")");
//        System.out.println("Ожидаемый результат: 100, 200, 300, 400, 500");
//        System.out.println("Фактический результат: " + arrayToString(add(test10, x10, pos10)));
//
//// Тест 11: массив с повторяющимися элементами
//        System.out.println("\nТестовый случай 11: массив с повторяющимися элементами");
//        int[] test11 = {5, 5, 5, 5};
//        int x11 = 3;
//        int pos11 = 2;
//        System.out.println("Вводим: add(" + arrayToString(test11) + ", " + x11 + ", " + pos11 + ")");
//        System.out.println("Ожидаемый результат: 5, 5, 3, 5, 5");
//        System.out.println("Фактический результат: " + arrayToString(add(test11, x11, pos11)));
//// Тест 12: крайняя левая позиция
//        System.out.println("\nТестовый случай 12: крайняя левая позиция");
//        int[] test12 = {1, 2, 3};
//        int x12 = 0;
//        int pos12 = 0;
//        System.out.println("Вводим: add(" + arrayToString(test12) + ", " + x12 + ", " + pos12 + ")");
//        System.out.println("Ожидаемый результат: 0, 1, 2, 3");
//        System.out.println("Фактический результат: " + arrayToString(add(test12, x12, pos12)));
//
//// Тест 13: крайняя правая позиция
//        System.out.println("\nТестовый случай 13: крайняя правая позиция");
//        int[] test13 = {1, 2, 3};
//        int x13 = 0;
//        int pos13 = 3;
//        System.out.println("Вводим: add(" + arrayToString(test13) + ", " + x13 + ", " + pos13 + ")");
//        System.out.println("Ожидаемый результат: 1, 2, 3, 0");
//        System.out.println("Фактический результат: " + arrayToString(add(test13, x13, pos13)));
//
//// Тест 14: вставка в массив с одним уникальным элементом
//        System.out.println("\nТестовый случай 14: вставка в массив с одним уникальным элементом");
//        int[] test14 = {42};
//        int x14 = 42;
//        int pos14 = 0;
//        System.out.println("Вводим: add(" + arrayToString(test14) + ", " + x14 + ", " + pos14 + ")");
//        System.out.println("Ожидаемый результат: 42, 42");
//        System.out.println("Фактический результат: " + arrayToString(add(test14, x14, pos14)));
//
//// Тест 15: массив с чередующимися положительными и отрицательными числами
//        System.out.println("\nТестовый случай 15: массив с чередующимися положительными и отрицательными числами");
//        int[] test15 = {1, -1, 2, -2, 3, -3};
//        int x15 = 0;
//        int pos15 = 3;
//        System.out.println("Вводим: add(" + arrayToString(test15) + ", " + x15 + ", " + pos15 + ")");
//        System.out.println("Ожидаемый результат: 1, -1, 2, 0, -2, 3, -3");
//        System.out.println("Фактический результат: " + arrayToString(add(test15, x15, pos15)));
//
//// Тест 16: массив с нулями
//        System.out.println("\nТестовый случай 16: массив с нулями");
//        int[] test16 = {0, 0, 0, 0};
//        int x16 = 1;
//        int pos16 = 2;
//        System.out.println("Вводим: add(" + arrayToString(test16) + ", " + x16 + ", " + pos16 + ")");
//        System.out.println("Ожидаемый результат: 0, 0, 1, 0, 0");
//        System.out.println("Фактический результат: " + arrayToString(add(test16, x16, pos16)));
//
//// Тест 17: массив с разными типами чисел
//        System.out.println("\nТестовый случай 17: массив с разными типами чисел");
//        int[] test17 = {-100, 0, 100};
//        int x17 = 50;
//        int pos17 = 1;
//        System.out.println("Вводим: add(" + arrayToString(test17) + ", " + x17 + ", " + pos17 + ")");
//        System.out.println("Ожидаемый результат: -100, 50, 0, 100");
//        System.out.println("Фактический результат: " + arrayToString(add(test17, x17, pos17)));
//
//
        System.out.println("Тестирование функции add2");

// Тест 1: базовый случай из условия
        System.out.println("\nТестовый случай 1: базовый случай из условия");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] ins1 = {7, 8, 9};
        int pos1 = 3;
        System.out.println("Вводим: add2(" + Arrays.toString(arr1) + ", " + Arrays.toString(ins1) + ", " + pos1 + ")");
        System.out.println("Ожидаемый результат: [1, 2, 3, 7, 8, 9, 4, 5]");
        System.out.println("Фактический результат: " + Arrays.toString(add2(arr1, ins1, pos1)));

// Тест 2: вставка в начало массива
        System.out.println("\nТестовый случай 2: вставка в начало массива");
        int[] arr2 = {4, 5, 6};
        int[] ins2 = {1, 2, 3};
        int pos2 = 0;
        System.out.println("Вводим: add2(" + Arrays.toString(arr2) + ", " + Arrays.toString(ins2) + ", " + pos2 + ")");
        System.out.println("Ожидаемый результат: [1, 2, 3, 4, 5, 6]");
        System.out.println("Фактический результат: " + Arrays.toString(add2(arr2, ins2, pos2)));

// Тест 3: вставка в конец массива
        System.out.println("\nТестовый случай 3: вставка в конец массива");
        int[] arr3 = {1, 2, 3};
        int[] ins3 = {4, 5, 6};
        int pos3 = 3;
        System.out.println("Вводим: add2(" + Arrays.toString(arr3) + ", " + Arrays.toString(ins3) + ", " + pos3 + ")");
        System.out.println("Ожидаемый результат: [1, 2, 3, 4, 5, 6]");
        System.out.println("Фактический результат: " + Arrays.toString(add2(arr3, ins3, pos3)));

// Тест 4: вставка пустого массива
        System.out.println("\nТестовый случай 4: вставка пустого массива");
        int[] arr4 = {1, 2, 3};
        int[] ins4 = {};
        int pos4 = 1;
        System.out.println("Вводим: add2(" + Arrays.toString(arr4) + ", " + Arrays.toString(ins4) + ", " + pos4 + ")");
        System.out.println("Ожидаемый результат: [1, 2, 3]");
        System.out.println("Фактический результат: " + Arrays.toString(add2(arr4, ins4, pos4)));

// Тест 5: вставка одного элемента
        System.out.println("\nТестовый случай 5: вставка одного элемента");
        int[] arr5 = {1, 3, 4};
        int[] ins5 = {2};
        int pos5 = 1;
        System.out.println("Вводим: add2(" + Arrays.toString(arr5) + ", " + Arrays.toString(ins5) + ", " + pos5 + ")");
        System.out.println("Ожидаемый результат: [1, 2, 3, 4]");
        System.out.println("Фактический результат: " + Arrays.toString(add2(arr5, ins5, pos5)));

// Тест 6: вставка в пустой массив
        System.out.println("\nТестовый случай 6: вставка в пустой массив");
        int[] arr6 = {};
        int[] ins6 = {1, 2, 3};
        int pos6 = 0;
        System.out.println("Вводим: add2(" + Arrays.toString(arr6) + ", " + Arrays.toString(ins6) + ", " + pos6 + ")");
        System.out.println("Ожидаемый результат: [1, 2, 3]");
        System.out.println("Фактический результат: " + Arrays.toString(add2(arr6, ins6, pos6)));

        float f2 = (float) 1_000.0;
        double f4 = 1000.0;
        float f7 = (float) f4;


    }

    public static int[] add2(int[] arr, int[] ins, int pos) {
        // Создаём новый массив с нужной длиной
        int[] result = new int[arr.length + ins.length];

        // Копируем элементы до позиции вставки
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        // Копируем вставляемые элементы
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        // Копируем оставшиеся элементы
        for (int i = pos; i < arr.length; i++) {
            result[pos + ins.length + (i - pos)] = arr[i];
        }

        return result;
    }

    public static int[] add(int[] arr, int x, int pos) {
        // Создаем новый массив на один элемент больше
        int[] result = new int[arr.length + 1];

        // Копируем элементы до позиции pos
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        // Вставляем новое значение
        result[pos] = x;

        // Копируем оставшиеся элементы, смещая их на одну позицию вправо
        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    public static int[] add(int[] arr, int[] ins, int pos) {
        // Создаём новый массив с нужной длиной
        int[] result = new int[arr.length + ins.length];

        // Копируем элементы до позиции вставки
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        // Копируем вставляемые элементы
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        // Копируем оставшиеся элементы
        for (int i = pos; i < arr.length; i++) {
            result[pos + ins.length + (i - pos)] = arr[i];
        }

        return result;
    }

    public static int[] deleteNegative(int[] arr) {
        // Подсчет количества неотрицательных элементов
        int count = 0;
        for (int num : arr) {
            if (num >= 0) count++;
        }

        // Создание нового массива нужного размера
        int[] result = new int[count];
        // Создание индекса для нового массива
        int index = 0;

        // Копирование неотрицательных элементов по аналогии с прошлым заданием
        for (int num : arr) {
            if (num >= 0) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }

    public static int[] findAll(int[] arr, int x) {
        // Сначала считаем количество вхождений для определения размерности второго массива
        int count = 0;
        for (int num : arr) {
            if (num == x) count++;
        }

        // Посчитали и теперь создаем массив для хранения индексов
        int[] result = new int[count];
        // И внешний счетчик для смещения индекса для созданного массива
        int index = 0;

        // Заполняем массив индексами
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }

        return result;
    }

    public static int[] concat(int[] arr1, int[] arr2) {
        // Создаем новый массив с длиной, равной сумме длин исходных массивов
        int[] result = new int[arr1.length + arr2.length];

        // Копируем элементы первого массива
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        // Копируем элементы второго массива, начиная с позиции arr1.length
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        return result;
    }

    public static int[] reverseBack(int[] arr) {
        // Создаем новый массив той же длины
        int[] result = new int[arr.length];

        // Заполняем новый массив в обратном порядке
        // мне кажется использоваться 2 указателя в направленные друг на друга более понятно
        // хотя конечно можно обойтись и одним указателем
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            result[i] = arr[j];  // Копируем элементы с конца исходного массива
        }
        return result;
    }

    public static void reverse(int[] arr) {
        // Определяем указатели на начало и конец массива
        int left = 0;
        int right = arr.length - 1;

        // Пока указатели не встретятся в центре массива
        while (left < right) {
            // Сохраняем значение левого элемента
            int temp = arr[left];

            // Меняем элементы местами
            arr[left] = arr[right];
            arr[right] = temp;

            // Перемещаем указатели навстречу друг другу
            left++;
            right--;
        }
    }

    private static String arrayToString(int[] arr) {
        if (arr == null) {
            return "null";
        }

        if (arr.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);

            // Если это не последний элемент, добавляем запятую и пробел
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }

    public static boolean palindrom(int[] arr) {
        // если null, то вроде как false??
        if (arr == null) return false;

        // Инициализируем указатели
        int left = 0;
        int right = arr.length - 1;

        // Сравниваем элементы с обоих концов,
        // если не четный - то элемент посредине просто не проверяется
        while (left < right) {
            // Если элементы не равны — возвращаем false
            if (arr[left] != arr[right]) return false;
            // Двигаем указатели "навстречу" друг другу
            left++;
            right--;
        }
        // Если дошли до конца — массив палиндром
        return true;
    }

    public static int countPositive(int[] arr) {
        // Создаем счетчик положительных чисел
        int count = 0;
        // Проходим по всем элементам массива
        // Идея сама мне предложила на for each поменять
        for (int j : arr) {
            // Проверяем, является ли текущий элемент положительным
            // Увеличиваем счетчик
            if (j > 0) count++;
        }
        return count;
    }

    public static int maxAbs(int[] arr) {
        // Берем первый элемент как начальный максимум
        int max = arr[0];
        // Перебираем все элементы массива
        for (int i = 1; i < arr.length; i++) {
            // Сравниваем модули чисел и записываем если прошлый элемент попадает под условие true
            if (Math.abs(arr[i]) > Math.abs(max)) max = arr[i];
        }
        //возвращаем последнее изменение max
        return max;
    }

    public static int findLast(int[] arr, int x) {
        // Начинаем поиск с конца массива
        for (int i = arr.length - 1; i >= 0; i--) {
            // Если нашли совпадение , возвращаем индекс
            if (arr[i] == x) return i;
        }
        // Если не нашли ни одного совпадения
        return -1;
    }

    public static int findFirst(int[] arr, int x) {
        // Проходим по всем элементам массива
        for (int i = 0; i < arr.length; i++) {
            // Если нашли искомое значение
            if (arr[i] == x) return i;
        }
        // Если элемент не найден, возвращаем -1
        return -1;
    }
}