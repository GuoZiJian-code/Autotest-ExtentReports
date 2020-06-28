package com.testNG.TimeoutTest;

import org.testng.annotations.Test;

public class TestTimeout {
    @Test(timeOut = 3000)
    public void testSuccess() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
    }

    @Test(timeOut = 2000)
    public void testFailed() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

        }
    }
}