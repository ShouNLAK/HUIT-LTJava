package Models;

public class ThanhVien extends Thread{

    public ThanhVien(String ten) {
        super(ten);
    }

    public static void ThreadName (Thread t) throws InterruptedException {
        for (int i =0 ; i<3 ; i++){
            System.out.println(t.getName() + " gửi tiền lần " + i);
        }
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {Thread.currentThread().interrupt();}
    }

    public void run(){
        try {
            ThreadName(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
