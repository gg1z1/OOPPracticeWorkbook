package com.stepup.mains;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCollectionsCheck {
    public static void main(String[] args) {

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
}
