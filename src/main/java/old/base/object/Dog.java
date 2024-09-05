package old.base.object;

public class Dog {

    static {
        System.err.println("static code");
    }

    //非静态代码块，在对象初始化后执行
    {
        System.err.println("unstatic code");
    }
    public static void method(){
        System.err.println("static method");
    }
    static int a;
    public Dog(){
        a = 1;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String color;
    private String name;
    private String type;

    public void eat(){
        //...
    }
    public void run(){
        //...
    }
    public void sleep(){
        //...
    }
}
