package com.stepup.mains;

import com.stepup.calculator.basic.Calculator;
import com.stepup.calculator.operations.AddOperation;
import com.stepup.calculator.operations.DelimOperation;

public class MainCalculator {
    public static void main(String[] args){
        Calculator calc = new Calculator();
        AddOperation slozhenie = new AddOperation();

        DelimOperation delenie = new DelimOperation();

        System.out.println(calc.calculate(slozhenie,1,2));
        System.out.println(calc.calculate(slozhenie,1,2));
    }
}
