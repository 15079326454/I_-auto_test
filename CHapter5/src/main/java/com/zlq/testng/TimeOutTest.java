package com.zlq.testng;


import org.testng.annotations.Test;

public class TimeOutTest {
    @Test(timeOut = 3000)
    public void test() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
