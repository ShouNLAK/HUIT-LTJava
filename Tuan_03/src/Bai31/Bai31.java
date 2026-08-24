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
public class Bai31 {
    public static void main(String[] args) {
        BatDongSan[] lst_bds = nhapDS();
        XuatDS(lst_bds);
        TongLuongDS(lst_bds);
    }
    public static BatDongSan[] nhapDS()
    {
        Scanner sc = new Scanner (System.in);
        int n;
        do
        {
            System.out.println("Nhập số lượng bất động sản : ");
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("Sai số lượng - Vui lòng nhập lại");
        }while (n <= 0); 
        BatDongSan[] arr = new BatDongSan[n];
        for (int i = 0; i < n ; i++)
        {
            int type;
            do{
                System.out.println("Nhập thông tin bất động sản thứ " + (i + 1) + " : ");
                System.out.println("1. Đất trống | 2. Nhà ở | 3. Khách sạn | 4. Biệt thự");
                type = sc.nextInt();
                switch(type)
                {
                    case 1:
                    {
                        DatTrong bds = new DatTrong();
                        bds.Nhap();
                        arr[i] = bds;
                        break;
                    }
                    case 2:
                    {
                        NhaLau bds = new NhaLau();
                        bds.Nhap();
                        arr[i] = bds;
                        break;
                    }
                    case 3:
                    {
                        KhachSan bds = new KhachSan();
                        bds.Nhap();
                        arr[i] = bds;
                        break;
                    }
                    case 4:
                    {
                        BietThu bds = new BietThu();
                        bds.Nhap();
                        arr[i] = bds;
                        break;
                    }
                    default:
                        System.out.println("Nhập sai định dạng, vui lòng thử lại");
                }
            } while (type < 1 || type > 4);
        }
        return arr;
    }
        public static void XuatDS(BatDongSan[] obj)
    {
        System.out.println("Thông tin danh sách bất động sản : ");
        System.out.println("Mã BĐS\t| Chiều dài\t | Chiều rộng\t | Tổng giá trị\t | Ghi chú");
        for(BatDongSan bds : obj)
            System.out.println(bds);
    }
        
        public static void TongLuongDS(BatDongSan[] obj)
    {
        double sum = 0;
        double[] sum_Loai = new double[4];
        for(BatDongSan bds : obj)
        {
            sum += bds.tinhGiaTri();
            if (bds instanceof DatTrong)
                sum_Loai[0] += bds.tinhGiaTri();
            else if (bds instanceof NhaLau)
                sum_Loai[1] += bds.tinhGiaTri();
            else if (bds instanceof KhachSan)
                sum_Loai[2] += bds.tinhGiaTri();
            else if (bds instanceof BietThu)
                sum_Loai[3] += bds.tinhGiaTri();
        }
        System.out.println("Tổng tiền trong danh sách : " + sum);
        System.out.println("Trong đó :\n - Đất trống : " + sum_Loai[0] + "\n - Nhà lầu : " + sum_Loai[1] + "\n - Khách sạn : " + sum_Loai[2] + "\n - Biệt thự : " + sum_Loai[3]);
    }
}
