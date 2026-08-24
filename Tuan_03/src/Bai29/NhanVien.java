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
public class NhanVien {
    protected String hoTen;
    protected int namVaoLam;
    public static double luongCB = 1490000;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int namVaoLam) {
        this.hoTen = hoTen;
        this.namVaoLam = namVaoLam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }
    
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ và tên : ");
        hoTen = sc.nextLine();
        System.out.println("Nhập năm vào làm : ");
        namVaoLam = sc.nextInt();
    }

    @Override
    public String toString() {
        return hoTen + "\t| " + namVaoLam + "\t| " + TinhLuong();
    }
    
    public double TinhLuong()
    {
        return luongCB;
    }
    
}
