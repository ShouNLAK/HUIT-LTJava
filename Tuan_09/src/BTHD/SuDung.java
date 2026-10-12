package BTHD;

public class SuDung {
    static void main() {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        System.out.println("Đây là Thread trong BTHD.SuDung.java đang chạy.....");

        t1.start();

        t2.start();

        t3.start();

        System.out.println("Thread (BTHD.SuDung.java) kết thúc......");
    }
}
