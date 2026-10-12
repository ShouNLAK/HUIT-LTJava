package Bai_4_1;

public class MyThread1 extends Thread{
    public MyThread1(){
        super();
    }
    public void run(){
        for(int i = 0; i<10; i++){
            System.out.println(i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
