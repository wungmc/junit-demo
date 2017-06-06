/**
 * Copyright (C), 2011-2017, 微贷网.
 */
package com.wung.junit;

/**
 * @author wungmc 2017/6/6.
 */
public class PrimeNumberChecker {
    public Boolean validate(final Integer inputNumber) {
        for (int i = 2; i < (inputNumber / 2); i++) {
            if (inputNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new PrimeNumberChecker().validate(16));
    }
}
