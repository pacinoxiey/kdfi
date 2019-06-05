package base.thread;

public class Main {
	public static void main(String[] args) {
		//2.创建Runnable的接口实现类的实例
        RunThread s1=new RunThread();
        RunThread s2=new RunThread();
        
        //2.用Runnable的接口实现类的实例作为Thread的target，创建Thread对象
        Thread t1=new Thread(s1);
        Thread t2=new Thread(s2,"Higgin");  //创建Thread对象的同时可以为之命名
        
        //启动线程
        t1.start();
        t2.start();
        
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"===="+i);
        }
	}
}
