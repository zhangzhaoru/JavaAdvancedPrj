package com.zhangzhaoru.Create;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru
 * @Author: ZhangZhaoru
 * @Date: 2021/4/25 7:32 下午
 * @Description:
 */
public class CreateThreadI extends Thread{
    private int threadCount = 10;

    @Override
    public void run() {
        super.run();
        while(true){
            if(threadCount>0) {
                System.out.println(Thread.currentThread().getName() + ": " + threadCount);
                threadCount--;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                break;
            }
        }
    }
}
