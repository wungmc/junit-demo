/**
 * Copyright (C), 2011-2017, 微贷网.
 */
package com.wung.junit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * @author wungmc 2017/6/6.
 */
public class ExecutionProcedureTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ExecutionProcedureTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure);
        }
        System.out.println(result.wasSuccessful());
    }
}

/*
 * output result:
 *
    before class
     before
     test 1
     after
     before
     test 2
     after
     after class
     true
 *
 */
