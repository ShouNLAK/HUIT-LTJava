package Bai_4_3;

import Bai_4_3.Model.TaiKhoan;

class LuongRutTien extends Thread {
    TaiKhoan taiKhoan;
    double soTien;

    public LuongRutTien(TaiKhoan taiKhoan, double soTien) {
        this.taiKhoan = taiKhoan;
        this.soTien = soTien;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            taiKhoan.rutTien(soTien);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class LuongChuyenTien extends Thread {
    TaiKhoan taiKhoanGui;
    TaiKhoan taiKhoanNhan;
    double soTien;

    public LuongChuyenTien(TaiKhoan taiKhoanGui, TaiKhoan taiKhoanNhan, double soTien) {
        this.taiKhoanGui = taiKhoanGui;
        this.taiKhoanNhan = taiKhoanNhan;
        this.soTien = soTien;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            taiKhoanGui.chuyenTien(taiKhoanNhan, soTien);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class SuDung {
    public static void main(String[] args) {
        TaiKhoan tk1 = new TaiKhoan("TK01", 10000000);
        TaiKhoan tk2 = new TaiKhoan("TK02", 2000000);

        LuongRutTien t1 = new LuongRutTien(tk1, 3000000);
        LuongChuyenTien t2 = new LuongChuyenTien(tk1, tk2, 4000000);

        t1.start();
        t2.start();
    }
}