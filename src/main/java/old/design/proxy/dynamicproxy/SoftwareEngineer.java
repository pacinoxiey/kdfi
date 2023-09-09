package old.design.proxy.dynamicproxy;

/**
 * @author xiey
 * @version 2020/4/16
 * @description: 具体实现类，被代理的类
 */
public class SoftwareEngineer implements Person {

    public SoftwareEngineer(String name) {
        this.name = name;
    }

    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void goWorking(String name, String dst) {
        System.out.println("name =" + name + " ， 去 " + dst + " 工作");
    }
}
