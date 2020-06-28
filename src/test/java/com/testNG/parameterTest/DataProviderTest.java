package com.testNG.parameterTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/*
*   使用对象传数据给测试方法
* */
public class DataProviderTest {
    @Test(dataProvider = "providerData")
    public void testDataProvider(String name,int age) {
        System.out.println("name:"+name+"，age:"+age );
    }

    @DataProvider(name = "providerData")
    public Object[][] providerData() {
        Object[][] providerData = new Object[][] {
                {"张三",15},
                {"李四",16},
                {"王五",17}
        };
        return providerData;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name,int age) {
        System.out.println("test1方法 name："+name+"，age:"+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name,int age) {
        System.out.println("test2方法 name："+name+"，age:"+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if(method.getName().equals("test1")) {
            result = new Object[][] {
                    {"test1张三",15},
                    {"test1李四",16}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"test2王五",17},
                    {"test2赵六",18}
            };
        }
        return result;
    }
}