package com.zhangzhaoru.Test;

import com.zhangzhaoru.StaticProxy.HelloWorldImpl;
import com.zhangzhaoru.StaticProxy.Proxy;
import org.junit.Test;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru.Test
 * @Author: ZhangZhaoru
 * @Date: 2021/4/26 5:31 下午
 * @Description:
 */
public class StaticTest {
    @Test
    public void test1(){
        Proxy proxy = new Proxy(new HelloWorldImpl());
        proxy.print();
    }
}
