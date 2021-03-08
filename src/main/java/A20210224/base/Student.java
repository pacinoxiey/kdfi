package A20210224.base;

/**
 * @author xiey
 * @version 2021/3/1 11:16
 * @desc:
 */
public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student() {

    }

    public int hashCode() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this.hashCode() == obj.hashCode()) {
            return true;
        }
        return false;
    }
}
