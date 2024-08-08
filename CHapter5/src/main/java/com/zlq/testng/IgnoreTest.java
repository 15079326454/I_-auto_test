package com.zlq.testng;

import org.testng.annotations.Test;

//忽略测试
public class IgnoreTest {
    @Test
    public void Ingore1() {
        System.out.println("Ingore1，执行了忽略测试1");
    }

    @Test(enabled = false)
    public void Ingore2() {
        System.out.println("Ingore2，执行了忽略测试2");
    }
    @Test(enabled = true)
    public void Ingore3() {
        System.out.println("Ingore3，执行了忽略测试3");
    }
}
