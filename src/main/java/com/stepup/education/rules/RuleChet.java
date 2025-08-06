package com.stepup.education.rules;

public class RuleChet implements Rule{

    @Override
    public boolean check(int x) {
        return (x%2==0)&&(x>1&&x<=100000);
    }
}
