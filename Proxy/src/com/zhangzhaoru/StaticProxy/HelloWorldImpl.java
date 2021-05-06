package com.zhangzhaoru.StaticProxy;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru.StaticProxy
 * @Author: ZhangZhaoru
 * @Date: 2021/4/26 5:25 下午
 * @Description:
 */
public class HelloWorldImpl implements HelloWorld{

    @Override
    public void print() {
        System.out.println("Hello world");
    }
}
