package Cau_3;

import Models.TaiKhoan;
import Models.TaiKhoanAnToan;

public class SuDung {

    public static class LuongThuong extends Thread {
        private final TaiKhoan tk;

        public LuongThuong(TaiKhoan tk) {
            this.tk = tk;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                tk.napTien(1000);
            }
        }
    }

    public static class LuongAnToan extends Thread {
        private final TaiKhoanAnToan tk;

        public LuongAnToan(TaiKhoanAnToan tk) {
            this.tk = tk;
        }
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                tk.napTien(1000);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        TaiKhoan tkThuong = new TaiKhoan(0);
        TaiKhoanAnToan tkAnToan = new TaiKhoanAnToan(0);

        LuongThuong t1 = new LuongThuong(tkThuong);
        LuongThuong t2 = new LuongThuong(tkThuong);
        LuongThuong t3 = new LuongThuong(tkThuong);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        LuongAnToan a1 = new LuongAnToan(tkAnToan);
        LuongAnToan a2 = new LuongAnToan(tkAnToan);
        LuongAnToan a3 = new LuongAnToan(tkAnToan);
        a1.start();
        a2.start();
        a3.start();
        a1.join();
        a2.join();
        a3.join();

        System.out.println("Không đồng bộ:      " + tkThuong.getSoDu());
        System.out.println("Đồng bộ:  " + tkAnToan.getSoDu());
    }
}