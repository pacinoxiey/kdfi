package test;

/**
 * @author xiey
 * @version  2019/2/18 14:17
 */
public class B {

    private String bb;

    public B(String bb, String cc) {
        this.bb = bb;
        this.cc = cc;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    private String cc;

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }
}
