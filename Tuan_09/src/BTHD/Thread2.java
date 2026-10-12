package BTHD;

public class Thread2 extends Thread{
    public Thread2(){
        super();
    }

    public void run(){
        System.out.println("Đây là Thread 2 đang chạy....");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 2 kết thúc.....");
    }
}
