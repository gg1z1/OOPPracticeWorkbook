package com.stepup.mains;

import com.stepup.calculator.advanced.Fraction;
import com.stepup.calculator.basic.Calculator;
import com.stepup.calculator.operations.AddOperation;
import com.stepup.calculator.operations.DelimOperation;

import javax.xml.stream.FactoryConfigurationError;

public class MainCalculator {
    public static void main(String[] args){
//        //задание 1
//        // Создаем дроби
//        Fraction f1 = new Fraction(1, 3);    // 1/3
//        Fraction f2 = new Fraction(2, 5);    // 2/5
//        Fraction f3 = new Fraction(7, 8);    // 7/8
//
//        // Выполняем последовательные операции
//        Fraction result = f1.sum(f2).sum(f3).minus(5);
//
//
//        // Выводим результат
//        System.out.println("Результат: " + result);
//
//        //Fraction f4 = new Fraction(7, -8);    // 7/8
//        /*
//        * Exception in thread "main" java.lang.IllegalArgumentException: Знаменатель должен быть положительным
//	        at com.stepup.check.Fraction.<init>(Fraction.java:11)
//	        at com.stepup.practice.com.stepup.check.Main.main(com.stepup.check.Main.java:12)
//        * */

        Calculator calc = new Calculator();

//        AddOperation slozhenie = new AddOperation();
//        DelimOperation delenie = new DelimOperation();
//        System.out.println(calc.calculate(slozhenie,1,2));
//        System.out.println(calc.calculate(slozhenie,1,2));

        Fraction drob1 = new Fraction(3,5);
        Fraction drob2 = new Fraction(49,12);
        Fraction drob3 = new Fraction(1,3);

        drob3.sum(5);
        //задание 7
        System.out.println("Результат первого сложения: " + calc.sumAll(2, drob1, 2.3));
        System.out.println("Результат второго сложения: " + calc.sumAll(3.6, drob2, 3, 3.0/2));
        System.out.println("Результат третьего сложения: " + calc.sumAll(drob3, 1));
    }


}
