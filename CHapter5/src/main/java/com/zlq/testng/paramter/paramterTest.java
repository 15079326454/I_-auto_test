package com.zlq.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paramterTest {
    @Test
    @Parameters({"name","age"})
    public void paraterTest1(String name, int age) {
        System.out.println("name:" + name + ",age:" + age);
    }
}
