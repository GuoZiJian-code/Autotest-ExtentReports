package com.testNG.DependTest;

import org.testng.annotations.Test;

/*
* 使用场景，依赖方法必须要进行某步的前置操作，例如购物前一定要登录
* */
public class DependTest {
    @Test(expectedExceptions = RuntimeException.class)
    public void LoginTest() {
        System.out.println("登录方法");
        throw new RuntimeException("登录失败");
    }
    @Test(dependsOnMethods = {"LoginTest"})
    public void ShopTest() {
        System.out.println("登录成功后才可以进行购物");
    }
}