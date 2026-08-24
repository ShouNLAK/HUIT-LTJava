/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai30;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class DoAn extends MonHoc{
    private double GVHD;
    private double GVPB;

    public DoAn() {
    }

    public DoAn(double GVHD, double GVPB, String maMonHoc, String tenMonHoc, int soTinChi) {
        super(maMonHoc, tenMonHoc, soTinChi);
        this.GVHD = GVHD;
        this.GVPB = GVPB;
    }

    public double getGVHD() {
        return GVHD;
    }

    public void setGVHD(double GVHD) {
        this.GVHD = GVHD;
    }

    public double getGVPB() {
        return GVPB;
    }

    public void setGVPB(double GVPB) {
        this.GVPB = GVPB;
    }

    @Override
    public void NhapMH()
    {
        super.NhapMH();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Nhập điểm Giáo viên hướng dẫn : ");
            GVHD = sc.nextDouble();
            System.out.println("Nhập điện Giáo viên phản biện : ");
            GVPB = sc.nextDouble();
        } while (GVHD > 10 || GVHD < 0 || GVPB > 10 || GVPB < 0);
    }
    
    @Override
    public String toString() {
        return super.toString() + "GVHD : " + GVHD + "\t| GVPB : " + GVPB;
    }
    
    @Override
    public double DTB()
    {
        return (GVHD + GVPB) / 2;
    }
    
}
