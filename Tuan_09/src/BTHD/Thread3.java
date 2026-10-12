package BTHD;

public class Thread3 extends Thread{
    public Thread3(){
        super();
    }

    public void run(){
        System.out.println("Đây là Thread 3 đang chạy....");
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread 3 kết thúc.....");
    }
}
