package Models;

public class ThanhVienRunnable implements Runnable{

    public ThanhVienRunnable() {
        super();
    }

    public static synchronized void ThreadName () throws InterruptedException {
        for (int i =0 ; i<3 ; i++){
            System.out.println(Thread.currentThread().getName() + " gửi tiền lần " + i);
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {Thread.currentThread().interrupt();}
    }

    public void run(){
        try {
            ThreadName();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
