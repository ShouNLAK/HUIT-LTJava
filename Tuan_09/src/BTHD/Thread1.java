package BTHD;

public class Thread1 extends Thread{

    public Thread1(){
        super();
    }

    public void run(){
        System.out.println("Đây là Thread 1 đang chạy....");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 1 kết thúc....");
    }
}
