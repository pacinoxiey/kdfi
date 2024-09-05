package A20230224.exam;

import java.io.*;

/**
 * @author xiey
 * @version 2021/3/8 17:53
 * @desc: 有3个线程，一个线程负责输出A，一个线程输出B，一个线程C，请设计一个代码，
 * 向一个文件中写入AABBCCCAABBCCC循环下次
 */
public class Main2 {

    public static volatile StringBuilder output = new StringBuilder();

    public static void main(String[] args) throws IOException, InterruptedException {

        FileWriter fileWriter = new FileWriter(new File("").getAbsoluteFile() +
                "/src/main/java/A20210224/exam/test.txt");

        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));


        MyThread a = new MyThread("a", 2);
        MyThread b = new MyThread("b", 2);
        MyThread c = new MyThread("c", 3);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {

            Thread threadA = new Thread(a);
            Thread threadB = new Thread(b);
            Thread threadC = new Thread(c);
            threadA.start();
            threadA.join();
            sb.append(output);
            threadB.start();
            threadB.join();
            sb.append(output);
            threadC.start();
            threadC.join();
            sb.append(output);
            System.out.println(sb.toString());
//            System.err.println(s);
//            fileWriter.write(s);
//            fileWriter.flush();
        }
//        fileWriter.close();
    }
}
