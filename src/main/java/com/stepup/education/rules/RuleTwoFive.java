package com.stepup.education.rules;

public class RuleTwoFive implements Rule{

    @Override
    public boolean check(int x) {
        return x>=2&&x<=5;
    }
}
