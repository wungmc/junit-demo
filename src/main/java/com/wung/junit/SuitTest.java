/**
 * Copyright (C), 2011-2017, 微贷网.
 */
package com.wung.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 使用 @RunWith 和 @Suite 注释来运行套件测试，
 * 即一次可以运行多个单元测试类
 *
 * @author wungmc 2017/6/7.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        ExecutionProcedureTest.class,
        PrimeNumberCheckerTest.class
})
public class SuitTest {

}
