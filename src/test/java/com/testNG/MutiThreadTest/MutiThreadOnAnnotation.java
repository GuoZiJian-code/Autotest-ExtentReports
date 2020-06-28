package com.testNG.MutiThreadTest;

import org.testng.annotations.Test;

public class MutiThreadOnAnnotation {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test() {
        for (int i = 0; i < 10; i++) {
            System.out.println("当前线程："+Thread.currentThread().getId());
            System.out.println(i);
        }
    }
}