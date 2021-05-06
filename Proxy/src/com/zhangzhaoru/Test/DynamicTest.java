package com.zhangzhaoru.Test;

import com.zhangzhaoru.DynamicProxy.HelloWorldInvocationHandler;
import com.zhangzhaoru.StaticProxy.HelloWorld;
import com.zhangzhaoru.StaticProxy.HelloWorldImpl;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru.Test
 * @Author: ZhangZhaoru
 * @Date: 2021/4/26 5:43 下午
 * @Description:
 */
public class DynamicTest {
//    @Test
//    public void test1() {
//        HelloWorld helloWorld = new HelloWorldImpl();
//        HelloWorldInvocationHandler handler = new HelloWorldInvocationHandler(helloWorld);
//        HelloWorld instance = (HelloWorld) Proxy.newProxyInstance(helloWorld.getClass().getClassLoader(), helloWorld.getClass().getInterfaces(), handler);
//        instance.print();
//    }

    @Test
    public void test2(){
        HelloWorld helloWorld = new HelloWorldImpl();
        HelloWorldInvocationHandler handler = new HelloWorldInvocationHandler();
        handler.setObj(helloWorld);
        HelloWorld newInstance = (HelloWorld) handler.getInstance();
        newInstance.print();
    }
}
