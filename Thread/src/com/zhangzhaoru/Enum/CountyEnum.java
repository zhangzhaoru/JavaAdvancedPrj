package com.zhangzhaoru.Enum;

/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: com.zhangzhaoru.Enum
 * @Author: ZhangZhaoru
 * @Date: 2021/5/6 6:07 下午
 * @Description:
 */

public enum CountyEnum {
    ONE(1,"齐"),
    TWO(2,"楚"),
    THREE(3,"燕"),
    FOUR(4,"赵"),
    FIVE(5,"魏"),
    SIX(6,"韩");

    private int id;
    private String coutyName;

    public int getId() {
        return id;
    }

    public String getCoutyName() {
        return coutyName;
    }

    CountyEnum(int id, String coutyName) {
        this.id = id;
        this.coutyName = coutyName;
    }

    public static CountyEnum getCount(int index){
        CountyEnum[] arr = CountyEnum.values();
        for (CountyEnum countyEnum : arr) {
            if(countyEnum.getId()==index){
                return countyEnum;
            }
        }
        return null;
    }
}
