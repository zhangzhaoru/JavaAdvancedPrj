package com.zhangzhaoru.Test;

import com.zhangzhaoru.comparator.Person;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru.Test
 * @Author: ZhangZhaoru
 * @Date: 2021/5/3 6:13 下午
 * @Description:
 */

public class CompareTest implements Collection {
    @Test
    public void test1(){
        try {
            String time1="2020-09-02";
            String time2="2019-09-02";
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date date1 = format.parse(time1);
            Date date2 = format.parse(time2);
            Person person1 = new Person("zhangsan", 1, date1);
            Person person2 = new Person("wangwu", 2, date2);
            new Comparator(){
                @Override
                public int compare(Object o1, Object o2) {
                    if(o1 instanceof Person && o2 instanceof Person){
                        Person p1 = (Person) o1;
                        Person p2 = (Person) o2;
                        return p1.getAge().compareTo(p2.getAge());
                    }else{
                        throw new RuntimeException("传入数据类型不一致");
                    }

                }
            };
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
