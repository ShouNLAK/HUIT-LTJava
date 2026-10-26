package Cau_4;

import Models.TaiKhoan;
import Models.TaiKhoanAnToan;

public class SuDung {
    public static class RutTienThuong implements Runnable {
        private final TaiKhoan tk;

        public RutTienThuong(TaiKhoan tk) {
            this.tk = tk;
        }

        @Override
        public void run() {
            if (tk.rutTien(700000)) {
                System.out.println(Thread.currentThread().getName() + " rút 700.000 : Thành công");
            } else {
                System.out.println(Thread.currentThread().getName() + " rút 700.000 : Không đủ tiền");
            }
        }
    }

    public static class RutTienAnToan implements Runnable {
        private final TaiKhoanAnToan tk;

        public RutTienAnToan(TaiKhoanAnToan tk) {
            this.tk = tk;
        }

        @Override
        public void run() {
            if (tk.rutTien(700000)) {
                System.out.println(Thread.currentThread().getName() + " rút 700.000 : Thành công");
            } else {
                System.out.println(Thread.currentThread().getName() + " rút 700.000 : Không đủ tiền");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TaiKhoan tk = new TaiKhoan(1000000);
        Thread t1 = new Thread(new RutTienThuong(tk), "Ba");
        Thread t2 = new Thread(new RutTienThuong(tk), "Mẹ");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Số dư cuối (TaiKhoan): " + tk.getSoDu() + "\n");

        TaiKhoanAnToan tkat = new TaiKhoanAnToan(1000000);
        Thread t3 = new Thread(new RutTienAnToan(tkat), "Ba");
        Thread t4 = new Thread(new RutTienAnToan(tkat), "Mẹ");
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        System.out.println("Số dư cuối (TaiKhoanAnToan): " + tkat.getSoDu());
    }
}