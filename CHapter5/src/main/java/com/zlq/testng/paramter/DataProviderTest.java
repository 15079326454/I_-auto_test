package com.zlq.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name:" + name + ",age:" + age);
    }

    @DataProvider(name = "data")
    public Object[][] provideData() {
        Object[][] o = new Object[][]{
                {"张三", 11},
                {"李四", 14},
                {"王五", 19}

        };
        return o;
    }
}
