package com.zhangzhaoru.Create;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru.Create
 * @Author: ZhangZhaoru
 * @Date: 2021/4/25 7:42 下午
 * @Description:
 */
public class CreateThreadII implements Runnable{
    private int threadCnt = 10;
    @Override
    public void run() {
        while (true) {
            if (threadCnt > 0) {
                System.out.println(Thread.currentThread().getName() + " 剩余个数 " + threadCnt);
                threadCnt--;
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                break;
            }
        }
    }
}
