package com.zhangzhaoru.Enum;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru.Enum
 * @Author: ZhangZhaoru
 * @Date: 2021/5/6 6:16 下午
 * @Description:
 */
public class enumTest {
    @Test
    public void test1() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 1; i <= 6; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName()+"国被灭");
                countDownLatch.countDown();
                // 线程执行方法语句
            }, CountyEnum.getCount(i).getCoutyName()).start();
        }
        countDownLatch.await();
        System.out.println("天下一统");
    }
}
