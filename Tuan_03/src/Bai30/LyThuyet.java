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
public class LyThuyet extends MonHoc{
    private double tieuLuan;
    private double giuaKy;
    private double cuoiKy;

    public LyThuyet() {
    }

    public LyThuyet(double tieuLuan, double giuaKy, double cuoiKy, String maMonHoc, String tenMonHoc, int soTinChi) {
        super(maMonHoc, tenMonHoc, soTinChi);
        this.tieuLuan = tieuLuan;
        this.giuaKy = giuaKy;
        this.cuoiKy = cuoiKy;
    }

    public double getTieuLuan() {
        return tieuLuan;
    }

    public void setTieuLuan(double tieuLuan) {
        this.tieuLuan = tieuLuan;
    }

    public double getGiuaKy() {
        return giuaKy;
    }

    public void setGiuaKy(double giuaKy) {
        this.giuaKy = giuaKy;
    }

    public double getCuoiKy() {
        return cuoiKy;
    }

    public void setCuoiKy(double cuoiKy) {
        this.cuoiKy = cuoiKy;
    }
    
    @Override
    public void NhapMH()
    {
        super.NhapMH();
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("Nhập điểm tiểu luận : ");
            tieuLuan = sc.nextDouble();
            System.out.println("Nhập điểm giữa kỳ : ");
            giuaKy = sc.nextDouble();
            System.out.println("Nhập điểm cuối kỳ : ");
            cuoiKy = sc.nextDouble();
        } while(tieuLuan < 0 || giuaKy < 0 || cuoiKy < 0 || tieuLuan >10 || giuaKy > 10 || cuoiKy > 10);
    }

    @Override
    public String toString() {
        return super.toString() + "Tiểu luận : " + tieuLuan + "| Giữa kỳ : " + giuaKy + "| Cuối kỳ : " + cuoiKy;
    }
    
    @Override
    public double DTB()
    {
        return tieuLuan * 0.2 + giuaKy * 0.3 + cuoiKy * 0.5;
    }
    
}
