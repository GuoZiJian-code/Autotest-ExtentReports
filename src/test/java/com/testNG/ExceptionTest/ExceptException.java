package com.testNG.ExceptionTest;

import org.testng.annotations.Test;

public class ExceptException {
    /*
    * 使用场景：在期望结果为某个异常的时候
    * 比如传入某些不合法参数的时候，程序抛出异常
    * 因此预期结果就是需要程序抛出为这个异常
    * */
//    测试结果为失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionFailed() {
        System.out.println("这是一个失败的异常测试");
    }
//    测试结果为成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runtimeExceptionSuccess() {
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException("抛出运行时异常");
    }
}