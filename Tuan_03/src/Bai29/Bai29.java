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
public class Bai29 {
    public static void main(String[] args) {
        NhanVien[] arr = nhapDS();
        XuatDS(arr);
        TongLuongDS(arr);
        
    }
    public static NhanVien[] nhapDS()
    {
        Scanner sc = new Scanner (System.in);
        int n;
        do
        {
            System.out.println("Nhập số lượng nhân viên : ");
            n = sc.nextInt();
            if (n <= 0)
                System.out.println("Sai số lượng - Vui lòng nhập lại");
        }while (n <= 0); 
        NhanVien[] arr = new NhanVien[n];
        for (int i = 0; i < n ; i++)
        {
            int type;
            do{
                System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + " : ");
                System.out.println("1. NV Văn phòng | 2. NV Sản xuất | 3. NV Quản lý");
                type = sc.nextInt();
                switch(type)
                {
                    case 1:
                    {
                        NV_VanPhong nv = new NV_VanPhong();
                        nv.Nhap();
                        arr[i] = nv;
                        break;
                    }
                    case 2:
                    {
                        NV_SanXuat nv = new NV_SanXuat();
                        nv.Nhap();
                        arr[i] = nv;
                        break;
                    }
                    case 3:
                    {
                        NV_QuanLy nv = new NV_QuanLy();
                        nv.Nhap();
                        arr[i] = nv;
                        break;
                    }
                    default:
                        System.out.println("Nhập sai định dạng, vui lòng thử lại");
                }
            } while (type < 1 || type > 3);
        }
        return arr;
    }
    
    public static void XuatDS(NhanVien[] obj)
    {
        System.out.println("Thông tin danh sách nhân viên : ");
        System.out.println("Họ và tên\t| Năm vào làm\t | Tổng lương\t | Ghi chú");
        for(NhanVien nv : obj)
            System.out.println(nv);
    }
    
    public static void TongLuongDS(NhanVien[] obj)
    {
        double sum = 0;
        double[] sum_Loai = new double[3];
        for(NhanVien nv : obj)
        {
            sum += nv.TinhLuong();
            if (nv instanceof NV_VanPhong)
                sum_Loai[0] += nv.TinhLuong();
            else if (nv instanceof NV_SanXuat)
                sum_Loai[1] += nv.TinhLuong();
            else if (nv instanceof NV_QuanLy)
                sum_Loai[2] += nv.TinhLuong();
        }
        System.out.println("Tổng tiền trong danh sách : " + sum);
        System.out.println("Trong đó :\n - Văn phòng : " + sum_Loai[0] + "\n - Sản xuất : " + sum_Loai[1] + "\n - Quản lý : " + sum_Loai[2]);
    }
}
