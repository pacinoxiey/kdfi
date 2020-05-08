package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author xiey
 * @version 2020/5/8
 * @description:
 */
public class Atomic {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(10);
        atomicInteger.addAndGet(1);
        atomicInteger.get();
    }
}
