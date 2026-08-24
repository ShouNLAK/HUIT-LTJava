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
public class ThucHanh extends MonHoc{
    private double[] kiemTra = new double[4];

    public double[] getKiemTra() {
        return kiemTra;
    }

    public void setKiemTra(double[] kiemTra) {
        this.kiemTra = kiemTra;
    }

    public ThucHanh() {
    }

    public ThucHanh(String maMonHoc, String tenMonHoc, int soTinChi, double[] kt) {
        super(maMonHoc, tenMonHoc, soTinChi);
        kiemTra = kt;
    }
    
    @Override
    public void NhapMH()
    {
        Scanner sc = new Scanner(System.in);
        super.NhapMH();
        boolean isValid;
        do
        {
            isValid = true;
            for(int i = 0; i < 4; i++)
            {
                System.out.println("Nhập điểm kiểm tra #" + (i+1) + " : ");
                kiemTra[i] = sc.nextDouble();
                if (kiemTra[i] > 10 && kiemTra[i] < 0) isValid = false;
            }
        } while (!isValid);
    }

    @Override
    public String toString() {
        return super.toString() + "Kiểm tra #1 : " + kiemTra[0] + "\t| Kiểm tra #2 : " + kiemTra[1]
                + "\t| Kiểm tra #3 : " +kiemTra[2] + "\t| Kiểm tra #4 : " + kiemTra[3];
    }
    
    @Override
    public double DTB()
    {
        double sum = 0;
        for(double diem : kiemTra)
            sum += diem;
        return sum / 4;
    }
}
