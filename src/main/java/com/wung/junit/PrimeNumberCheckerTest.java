/**
 * Copyright (C), 2011-2017, 微贷网.
 */
package com.wung.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * 使用 @RunWith(Parameterized.class) 和  @Parameterized.Parameters
 * 可以设置一组数据，junit 会为每一组数据调用一次测试方法
 *
 * @author wungmc 2017/6/6.
 */
@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {

    private Integer inputNumber;
    private Boolean result;
    private PrimeNumberChecker primeNumberChecker;

    @Before
    public void init() {
        primeNumberChecker = new PrimeNumberChecker();
    }

    public PrimeNumberCheckerTest(Integer inputNumber, Boolean result) {
        this.inputNumber = inputNumber;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection printNumber() {
        return Arrays.asList(new Object[][]{
                {2, true},
                {3, true},
                {16, false},
                {18, false}
        });
    }

    @Test
    public void test() {
        System.out.println("inputNumber is : " + inputNumber);
        Assert.assertEquals(result, primeNumberChecker.validate(inputNumber));
    }

}
