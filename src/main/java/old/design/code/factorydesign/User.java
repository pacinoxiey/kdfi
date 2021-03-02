package old.design.code.factorydesign;

/**
 * @author xiey
 * @date 2019/7/11 15:05
 * @description：实体类
 */
public class User {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
