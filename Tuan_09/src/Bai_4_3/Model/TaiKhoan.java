package Bai_4_3.Model;

public class TaiKhoan {
    String soTaiKhoan;
    double soDu;

    public TaiKhoan(String soTaiKhoan, double soDu) {
        this.soTaiKhoan = soTaiKhoan;
        this.soDu = soDu;
    }

    public synchronized void rutTien(double soTien) {
        if (soDu >= soTien) {
            soDu -= soTien;
            System.out.println(soTaiKhoan + " rút tiền thành công: " + soTien + " | Số dư còn: " + soDu);
        } else {
            System.out.println(soTaiKhoan + " không đủ tiền để rút " + soTien + " | Số dư hiện tại: " + soDu);
        }
    }

    public synchronized void chuyenTien(TaiKhoan taiKhoanNhan, double soTien) {
        if (soDu >= soTien) {
            soDu -= soTien;
            System.out.println(soTaiKhoan + " chuyển " + soTien + " đến " + taiKhoanNhan.soTaiKhoan + " | số dư còn: " + soDu);
            taiKhoanNhan.nhanTien(soTien);
        } else {
            System.out.println(soTaiKhoan + " không đủ tiền để chuyển " + soTien + " | Số dư hiện tại: " + soDu);
        }
    }

    public synchronized void nhanTien(double soTien) {
        soDu += soTien;
        System.out.println("Số dư mới của "+this.soTaiKhoan + " : " + soDu);
    }

    public double getSoDu() {
        return soDu;
    }

    public String getSoTaiKhoan() {
        return soTaiKhoan;
    }
}