package old.concurrency;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiey
 * @version 2020/5/8
 * @description:
 */
public class Atomic {

    public static void main(String[] args) {
        System.out.println(Timestamp.valueOf(LocalDateTime.now()).toString());
        AtomicInteger atomicInteger = new AtomicInteger(10);
        atomicInteger.addAndGet(1);
        atomicInteger.get();
    }
}
