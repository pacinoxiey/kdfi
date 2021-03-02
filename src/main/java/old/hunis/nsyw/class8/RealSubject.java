package old.hunis.nsyw.class8;

/**
 * @author xiey
 * @date 2019/1/17 15:33
 * @description：
 */
public class RealSubject implements Subject {
    @Override
    public void request(int id) {
        System.out.println("RealSubject.request : " + id);
    }
}
