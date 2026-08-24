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
public class KhachSan extends BatDongSan implements phiKinhDoanh{
    private double soSao;

    public KhachSan() {
    }

    public KhachSan(double soSao, String maSo, double chieuDai, double chieuRong) {
        super(maSo, chieuDai, chieuRong);
        this.soSao = soSao;
    }

    public double getSoSao() {
        return soSao;
    }

    public void setSoSao(double soSao) {
        this.soSao = soSao;
    }

    @Override
    public void Nhap()
    {
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        do
        {
            System.out.println("Nhập số sao của khách sạn : ");
            soSao = sc.nextDouble();
            if (soSao < 0)
                System.out.println("Nhập sai số sao - Vui lòng nhập lại");
        } while (soSao < 0);
    }
    
    @Override
    public String toString() {
        return super.toString() + "Số sao : " + soSao + "\t| Tính phí kinh doanh : " + tinhPhiKinhDoanh();
    }
    
    @Override
    public double tinhGiaTri()
    {
        return 100000 + soSao * 50000 + tinhPhiKinhDoanh();
    }
    
    @Override
    public double tinhPhiKinhDoanh()
    {
        return chieuRong*5000;
    }
    
}
