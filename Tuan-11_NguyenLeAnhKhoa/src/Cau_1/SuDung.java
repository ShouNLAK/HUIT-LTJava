package Cau_1;

import Models.ThanhVien;
import Models.ThanhVienRunnable;

public class SuDung {
    static void main() throws InterruptedException {
        ThanhVien Thread_1 = new ThanhVien("Bố");
        ThanhVien Thread_2 = new ThanhVien("Mẹ");
        Thread Thread_3 = new Thread(new ThanhVienRunnable(),"Con");

        Thread_1.start();
        Thread_2.start();
        Thread_3.start();

        Thread_1.join();
        Thread_2.join();
        Thread_3.join();
        System.out.println("Cả gia đình đã gửi xong");
    }
}
