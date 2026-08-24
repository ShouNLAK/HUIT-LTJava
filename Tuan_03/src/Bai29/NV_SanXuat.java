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
public class NV_SanXuat extends NhanVien{
    private int soSanPham;

    public NV_SanXuat() {
    }

    public NV_SanXuat(int soSanPham, String hoTen, int namVaoLam) {
        super(hoTen, namVaoLam);
        this.soSanPham = soSanPham;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }
    
        @Override
    public void Nhap()
    {
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số sản phẩm : ");
        soSanPham = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "\t| " + soSanPham;
    }
    
    
    
    @Override
    public double TinhLuong()
    {
        return super.TinhLuong() + soSanPham * 2000;
    }
}
