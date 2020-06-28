package com.testNG.MutiThreadTest;

import org.testng.annotations.Test;

public class MutiThreadOnXml2 {
    @Test
    public void test1() {
        System.out.println("MutiThreadOnXml2-test1的线程id："+Thread.currentThread().getId());
    }
    @Test
    public void test2() {
        System.out.println("MutiThreadOnXml2-test2的线程id："+Thread.currentThread().getId());
    }
    @Test
    public void test3() {
        System.out.println("MutiThreadOnXml2s-test3的线程id："+Thread.currentThread().getId());
    }
}