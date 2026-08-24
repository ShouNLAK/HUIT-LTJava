package Bai30;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public abstract class MonHoc {
    protected String maMonHoc;
    protected String tenMonHoc;
    protected int soTinChi;

    public MonHoc() {
    }

    public MonHoc(String maMonHoc, String tenMonHoc, int soTinChi) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTinChi = soTinChi;
    }

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
    
    public void NhapMH()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã môn học : ");
        maMonHoc = sc. nextLine();
        System.out.println("Nhập tên môn học : ");
        tenMonHoc = sc.nextLine();
        System.out.println("Số tín chỉ : ");
        soTinChi = sc.nextInt();
    }

    @Override
    public String toString() {
        return maMonHoc + "\t| " + tenMonHoc + "\t|" + soTinChi + "\t|" + DTB() + "\t| ";
    }
    
    public abstract double DTB();
}
