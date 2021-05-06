package com.zhangzhaoru.Test;

import com.zhangzhaoru.Create.CreateThreadI;
import org.junit.Test;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru.Test
 * @Author: ZhangZhaoru
 * @Date: 2021/4/25 7:37 下午
 * @Description:
 */
public class CreateTest {
    @Test
    public void test1(){
        CreateThreadI thread1 = new CreateThreadI();
        CreateThreadI thread2 = new CreateThreadI();
        thread1.start();
        thread2.start();

    }

}
