package old.concurrency;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.concurrent.Executors;

/**
 * @author xiey
 * @version 2021/3/5 11:31
 * @desc:
 */
public class Main {

    public static void main(String[] args) {
        // 获取 Java 线程管理 MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 遍历线程信息，仅打印线程 ID 和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println("[" + threadInfo.getThreadId() + "] " + threadInfo.getThreadName());
        }

        ThreadLocal<Integer> integerThreadLocal = new ThreadLocal<>();
//        integerThreadLocal.get().

        new Thread();
    }


    private static void test2() {
//        Executor executor = ScheduledThreadPoolExecutor.

        Executors.newFixedThreadPool(4);
        Executors.newSingleThreadExecutor();

        Executors.newScheduledThreadPool(8);
    }
}
