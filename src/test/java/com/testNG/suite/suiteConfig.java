package com.testNG.suite;


import org.testng.annotations.*;

/*
编写共有的方法
*/
public class suiteConfig {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("before suite 运行");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("after suite 运行");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("before   Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("after   Test");
    }
}