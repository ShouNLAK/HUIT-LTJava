/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai31;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public abstract class BatDongSan {
    protected String maSo;
    protected double chieuDai;
    protected double chieuRong;

    public BatDongSan() {
    }

    public BatDongSan(String maSo, double chieuDai, double chieuRong) {
        this.maSo = maSo;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Nhập mã bất động sản : ");
            maSo = sc.nextLine();
            System.out.println("Nhập chiều dài : ");
            chieuDai = sc.nextDouble();
            System.out.println("Nhập chiều rộng : ");
            chieuRong = sc.nextDouble();
            if (maSo == null || chieuDai < 0 || chieuRong < 0)
                System.out.println("Hãy nhập lại - Lỗi input sai");
        } while (maSo == null || chieuDai < 0 || chieuRong < 0);
    }

    @Override
    public String toString() {
        return maSo + "\t| " + chieuDai + "\t| " + chieuRong + "\t| " + tinhGiaTri() + "\t| ";
    }
    public abstract double tinhGiaTri();
}
