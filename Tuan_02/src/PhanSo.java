
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class PhanSo {
    private int tu;
    private int mau;

    public PhanSo() {
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        this.rutGon();
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }

    public void nhapPS() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập tử số : ");
            this.tu = sc.nextInt();
            System.out.println("Nhập mẫu số : ");
            this.mau = sc.nextInt();
            if (this.mau == 0) {
                System.out.println("Mẫu số không thể bằng 0");
            }
        } while (this.mau == 0);
        this.rutGon();
    }

    public void xuatPS() {
        if (this.tu == 0) {
            System.out.println("0");
        } else {
            if (this.mau == 1) {
                System.out.println(this.tu);
            } else {
                System.out.println(this.tu + " / " + this.mau);
            }
        }
    }

    public void nghichDao() {
        int tmp = this.tu;
        this.tu = this.mau;
        this.mau = tmp;
    }

    public PhanSo giaTriNghichDao() {
        return new PhanSo(this.mau, this.tu);
    }

    public double giaTriThuc() {
        return (double) this.tu / this.mau;
    }

    public boolean lonHon(PhanSo obj) {
        return this.giaTriThuc() > obj.giaTriThuc();
    }

    private long UCLN(long a, long b) {
        if (b == 0) {
            return a;
        }
        return UCLN(b, (a % b));
    }

    public void rutGon() {
        long ucln = Math.abs(UCLN(this.tu, this.mau));
        if (ucln != 0) {
            this.tu /= ucln;
            this.mau /= ucln;
        }
        if (this.mau < 0) {
            this.tu = -this.tu;
            this.mau = -this.mau;
        }
    }

    public PhanSo congPS(PhanSo obj) {
        PhanSo KQ = new PhanSo();
        long tuMoi = (long) this.tu * obj.mau + (long) obj.tu * this.mau;
        long mauMoi = (long) this.mau * obj.mau;
        
        long ucln = Math.abs(UCLN(tuMoi, mauMoi));
        if (ucln != 0) {
            tuMoi /= ucln;
            mauMoi /= ucln;
        }
        
        KQ.tu = (int) tuMoi;
        KQ.mau = (int) mauMoi;
        KQ.rutGon();
        return KQ;
    }

    public PhanSo congPS(int n) {
        return congPS(new PhanSo(n, 1));
    }

    public PhanSo truPS(PhanSo obj) {
        PhanSo KQ = new PhanSo();
        long tuMoi = (long) this.tu * obj.mau - (long) obj.tu * this.mau;
        long mauMoi = (long) this.mau * obj.mau;
        
        long ucln = Math.abs(UCLN(tuMoi, mauMoi));
        if (ucln != 0) {
            tuMoi /= ucln;
            mauMoi /= ucln;
        }
        
        KQ.tu = (int) tuMoi;
        KQ.mau = (int) mauMoi;
        KQ.rutGon();
        return KQ;
    }

    public PhanSo truPS(int n) {
        return truPS(new PhanSo(n, 1));
    }

    public PhanSo nhanPS(PhanSo obj) {
        PhanSo KQ = new PhanSo();
        long tuMoi = (long) this.tu * obj.tu;
        long mauMoi = (long) this.mau * obj.mau;
        
        long ucln = Math.abs(UCLN(tuMoi, mauMoi));
        if (ucln != 0) {
            tuMoi /= ucln;
            mauMoi /= ucln;
        }
        
        KQ.tu = (int) tuMoi;
        KQ.mau = (int) mauMoi;
        KQ.rutGon();
        return KQ;
    }

    public PhanSo nhanPS(int n) {
        return nhanPS(new PhanSo(n, 1));
    }

    public PhanSo chiaPS(PhanSo obj) {
        if (obj.tu == 0) {
            return new PhanSo(0, 1);
        }
        PhanSo nghich = new PhanSo(obj.mau, obj.tu);
        return this.nhanPS(nghich);
    }

    public PhanSo chiaPS(int n) {
        if (n == 0) {
            return new PhanSo(0, 1);
        }
        return chiaPS(new PhanSo(n, 1));
    }
}