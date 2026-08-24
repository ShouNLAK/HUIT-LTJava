package Bai29;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class NV_QuanLy extends NhanVien{
    private double heSoChucVu;
    private double tienThuong;

    public NV_QuanLy() {
    }

    public NV_QuanLy(double heSoChucVu, double tienThuong, String hoTen, int namVaoLam) {
        super(hoTen, namVaoLam);
        this.heSoChucVu = heSoChucVu;
        this.tienThuong = tienThuong;
    }

    public double getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(double heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }
    
        @Override
    public void Nhap()
    {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số chức vụ : ");
        heSoChucVu = sc.nextDouble();
        System.out.println("Nhập tiền thưởng : ");
        tienThuong = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString()+ "\t| " + heSoChucVu + "\t| " + tienThuong;
    }
    
    
    
    @Override
    public double TinhLuong()
    {
        return super.TinhLuong() * heSoChucVu + tienThuong;
    }
}
