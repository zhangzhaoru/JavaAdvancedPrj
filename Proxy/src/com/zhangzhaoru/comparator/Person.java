package com.zhangzhaoru.comparator;

import java.util.Date;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru.comparator
 * @Author: ZhangZhaoru
 * @Date: 2021/5/3 5:41 下午
 * @Description:
 */
public class Person implements Comparable{
    private String name;
    private int id;
    private Date age;



    public Person() {
    }

    public Person(String name, int id, Date age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getAge() {
        return age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person = (Person) o;
            return person.age.compareTo(this.age);
        }else{
            throw new RuntimeException("传入数据类型不一致");
        }
    }
}
