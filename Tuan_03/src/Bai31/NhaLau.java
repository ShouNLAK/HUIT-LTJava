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
public class NhaLau extends BatDongSan{
    private int soLau;

    public NhaLau() {
    }

    public NhaLau(int soLau, String maSo, double chieuDai, double chieuRong) {
        super(maSo, chieuDai, chieuRong);
        this.soLau = soLau;
    }

    public int getSoLau() {
        return soLau;
    }

    public void setSoLau(int soLau) {
        this.soLau = soLau;
    }
    
    @Override
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        do
        {
            System.out.println("Nhập số lầu : ");
            soLau = sc.nextInt();
            if(soLau < 0)
                System.out.println("Nhập sai số lầu - Vui lòng nhập lại");
        } while (soLau < 0);
    }

    @Override
    public String toString() {
        return super.toString() + "Số lầu : " + soLau;
    }
    
    @Override
    public double tinhGiaTri()
    {
        return (chieuDai * chieuRong) * 10000 + soLau * 100000;
    }
}
