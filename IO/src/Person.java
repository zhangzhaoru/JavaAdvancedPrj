/**
 * @BelongsProject: JavaAdvancedPrj
 * @BelongsPackage: PACKAGE_NAME
 * @Author: ZhangZhaoru
 * @Date: 2021/5/6 11:11 上午
 * @Description:
 */
public class Person {

    /**
     * 本实例
     */
    private static volatile Person instance;

    /**
     * 私有的构造方法
     */
    private Person() {
    }

    /**
     * 单例的实例
     *
     * @return this
     */
    public static Person getInstance() {
        if (instance == null) {
            synchronized (Person.class) {
                if (instance == null) {
                    instance = new Person();
                }
            }
        }
        return instance;
    }

}
