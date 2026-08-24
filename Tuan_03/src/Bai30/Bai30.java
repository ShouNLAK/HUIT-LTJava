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
public class Bai30 {
    public static void main(String[] args) {
        MonHoc[] lst_MH = nhapDS();
        XuatDS(lst_MH);
        
    }
    public static MonHoc[] nhapDS()
    {
        Scanner sc = new Scanner (System.in);
        int n;
        do
        {
            System.out.println("Nhập số lượng môn học : ");
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("Sai số lượng - Vui lòng nhập lại");
        }while (n <= 0); 
        MonHoc[] arr = new MonHoc[n];
        for (int i = 0; i < n ; i++)
        {
            int type;
            do{
                System.out.println("Nhập thông tin môn học thứ " + (i + 1) + " : ");
                System.out.println("1. Lý thuyết | 2. Thực hành | 3. Đồ án");
                type = sc.nextInt();
                switch(type)
                {
                    case 1:
                    {
                        LyThuyet mh = new LyThuyet();
                        mh.NhapMH();
                        arr[i] = mh;
                        break;
                    }
                    case 2:
                    {
                        ThucHanh mh = new ThucHanh();
                        mh.NhapMH();
                        arr[i] = mh;
                        break;
                    }
                    case 3:
                    {
                        DoAn mh = new DoAn();
                        mh.NhapMH();
                        arr[i] = mh;
                        break;
                    }
                    default:
                        System.out.println("Nhập sai định dạng, vui lòng thử lại");
                }
            } while (type < 1 || type > 3);
        }
        return arr;
    }
        public static void XuatDS(MonHoc[] obj)
    {
        System.out.println("Thông tin danh sách môn học : ");
        System.out.println("Mã môn học\t| Tên môn học\t | Số tín chỉ\t | Điểm trung bình\t | Ghi chú");
        for(MonHoc mh : obj)
            System.out.println(mh);
    }
}
