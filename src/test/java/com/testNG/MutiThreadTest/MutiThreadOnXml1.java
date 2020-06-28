package com.testNG.MutiThreadTest;

import org.testng.annotations.Test;

public class MutiThreadOnXml1 {
    @Test
    public void test1() {
        System.out.println("MutiThreadOnXml1-test1当前线程：" + Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.println("MutiThreadOnXml1-test2当前线程：" + Thread.currentThread().getId());
    }

    @Test
    public void test3() {
        System.out.println("MutiThreadOnXml1-test3当前线程：" + Thread.currentThread().getId());
    }
}