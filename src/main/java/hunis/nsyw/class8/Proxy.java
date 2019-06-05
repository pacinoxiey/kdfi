package hunis.nsyw.class8;

/**
 * @author xiey
 * @date 2019/1/17 15:33
 * @description：
 */
public class Proxy implements Subject {

    private Subject target;

    public Proxy(Subject s) {
        target = s;
    }

    @Override
    public void request(int id) {
        System.out.println("Proxy log : " + id);
        target.request(id);
    }

    public void setTarget(Subject realSubject) {
        this.target = realSubject;
    }
}
