package com.zhangzhaoru.StaticProxy;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru.StaticProxy
 * @Author: ZhangZhaoru
 * @Date: 2021/4/26 5:26 下午
 * @Description:
 */
public class Proxy implements HelloWorld{
    private HelloWorld helloWorld;

    public Proxy(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    @Override
    public void print() {
        Before();
        helloWorld.print();
        After();
    }

    private void Before(){
        System.out.println("before");
    }

    private void After(){
        System.out.println("after");
    }
}
