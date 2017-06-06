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

}
