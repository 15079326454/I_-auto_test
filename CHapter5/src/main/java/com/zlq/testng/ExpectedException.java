package com.zlq.testng;

import org.testng.annotations.Test;

//异常测试:在我们期望结果为某一个异常的时候
//比如：我们传入了某些不合法的参数，程序抛出异常，是我们预期的这个异常
public class ExpectedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("这是一个失败的异常测试");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void renTimeExceptionSuccess() {
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }

}
