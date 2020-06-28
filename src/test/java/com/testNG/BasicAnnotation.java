package com.testNG;

import org.testng.annotations.*;

public class BasicAnnotation {
    /*
    * 执行顺序
    * 方法method -> 类Class -> 测试套件Suit -> 测试用例Case
    * */
//    最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1() {
        System.out.println("BasicAnnotation-test1当前线程：" + Thread.currentThread().getId());
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("BasicAnnotation-test2当前线程：" + Thread.currentThread().getId());
        System.out.println("这是测试用例2");
    }
//    在每个测试方法运行之前都会运行
    @BeforeMethod
    public void beforeMethodCase() {
        System.out.println("这是在测试方法运行之前运行的");
    }

//    在每个测试方法之后都会运行
    @AfterMethod
    public void afterMethodCase() {
        System.out.println("这是在测试方法之后运行的");
    }
//    这是在类运行之前运行的
    @BeforeClass
    public void BeforeClass() {
        System.out.println("这是在类运行之前运行的");
    }
//    这是在类运行之后运行的
    @AfterClass
    public void AfterClass() {
        System.out.println("这是在类运行之后运行的");
    }

    @BeforeSuite
    public void BeforeSuit() {
        System.out.println("BeforeSuit测试套件");
    }

    @AfterSuite
    public void AfterSuit() {
        System.out.println("AfterSuit测试套件");
    }

}