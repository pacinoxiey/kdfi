package hunis.nsyw.class8;


/**
 * @author xiey
 * @date 2019/1/17 15:32
 * @description：
 */
public class Client {
    public static void main(String args[]) {
        Subject s = new Proxy(new RealSubject());
        s.request(3);
    }
}
