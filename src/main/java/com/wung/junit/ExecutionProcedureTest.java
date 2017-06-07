/**
 * Copyright (C), 2011-2017, 微贷网.
 */
package com.wung.junit;

import org.junit.*;

/**
 * 测试 @Before 等几个注解的执行顺序
 *
 * @author wungmc 2017/6/6.
 */
public class ExecutionProcedureTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }

    @Before
    public void before() {
        System.out.println("before");
    }


    @After
    public void after() {
        System.out.println("after");
    }

    @Test
    public void test1() {
        System.out.println("test 1");
    }


    @Test
    public void test2() {
        System.out.println("test 2");
    }

    /**
     * 方法运行超过 1000 ms，则失败
     * (死循环，该方法肯定超过 1000ms)
     */
    @Test(timeout = 1000)
    public void test3() {
        System.out.println("test 3");
        while (true);
    }

    @Test(expected = ArithmeticException.class)
    public void test4() {
        System.out.println("test 4");
        System.out.println(3/0);
    }

    /**
     * 单元测试时，该方法会被忽略
     */
    @Ignore
    public void test5() {
        System.out.println("test 5");
    }

}
