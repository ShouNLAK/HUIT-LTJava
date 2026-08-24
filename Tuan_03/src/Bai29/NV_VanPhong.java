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
public class NV_VanPhong extends NhanVien{
    private int soNgayLam;
    private double troCap;

    public NV_VanPhong() {
    }

    public NV_VanPhong(int soNgayLam, double troCap, String hoTen, int namVaoLam) {
        super(hoTen, namVaoLam);
        this.soNgayLam = soNgayLam;
        this.troCap = troCap;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public double getTroCap() {
        return troCap;
    }

    public void setTroCap(double troCap) {
        this.troCap = troCap;
    }
    
    @Override
    public void Nhap()
    {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số ngày làm việc : ");
        soNgayLam = sc.nextInt();
        System.out.println("Nhập trợ cấp : ");
        troCap = sc.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + "\t| " + soNgayLam + "\t| " + troCap;
    }
    
    
    @Override
    public double TinhLuong()
    {
        return super.TinhLuong() + soNgayLam * 100000 + troCap;
    }
    
}
