package com.zhangzhaoru.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru.DynamicProxy
 * @Author: ZhangZhaoru
 * @Date: 2021/4/26 5:40 下午
 * @Description:
 */
public class HelloWorldInvocationHandler implements InvocationHandler {
    private Object obj;

    // 使用Set方法而不使用有参构造
    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getInstance() {
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(obj, args);
        after();
        return result;
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}
