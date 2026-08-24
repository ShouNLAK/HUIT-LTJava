
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai22 {
    public static void main(String[] args) {
        int n = 0, phimChon = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhập số lượng phần tử (1 - 500): ");
            n = sc.nextInt();
            if (n <= 0 || n > 500)
                System.out.println("Sai số lượng. Vui lòng nhập lại");
        }while (n <= 0 || n > 500);
        int[] arr = new int[n];
        do{
            HienThi();
            phimChon = sc.nextInt();
            switch(phimChon)
            {
                case 1:
                    NhapMang(arr, n);
                    break;
                case 2 :
                    NhapMang_Random(arr, n);
                    break;
                case 3 :
                    XuatMang(arr);
                    break;
                case 4:
                    giaTriAm_Mang(arr, n);
                    break;
                case 5:
                    soNguyenTo_Mang(arr, n);
                    break;
                case 6:
                {
                    int a, b;
                    do{
                        System.out.println("Nhập giá trị a :");
                        a = sc.nextInt();
                        System.out.println("Nhập giá trị b :");
                        b = sc.nextInt();
                        if (a > b)
                            System.out.println("Nhập sai kiểu phạm vi - Vui lòng nhập lại");
                    }while (a > b);
                    giaTriPhamVi_Mang(arr, n, a, b);
                    break;
                }
                case 7:
                    tongSoNguyenTo_Mang(arr, n);
                    break;
                case 8:
                    tbcongSoDuong_Mang(arr, n);
                    break;
                case 9:
                {
                    int x;
                    System.out.println("Nhập giá trị x :");
                    x = sc.nextInt();
                    demSoPTLonHonX_Mang(arr, n, x);
                    break;
                }
                case 10:
                    demSoNguyenTo_Mang(arr, n);
                    break;
                case 11:
                    isAllPrime(arr, n);
                    break;
                case 12:
                    isAscending(arr, n);
                    break;
                case 13:
                    maxGT_Mang(arr, n);
                    break;
                case 14:
                    minGT_Mang(arr, n);
                    break;
                case 15 :
                    minGTAm_Mang(arr, n);
                    break;
                case 16 :
                    daoNguocMang(arr, n);
                    break;
                default :
                    System.out.println("Nhập sai chương trình - Vui lòng nhập lại");
                    break;
                case 0 :
                    System.out.println("Thoát chương trình");
                    break;
            }
        }while (phimChon != 0);
        
    }
    public static void HienThi()
    {
        System.out.println("");
        System.out.println("--- Menu    ---");
        System.out.println("1. Nhập giá trị thủ công trong mảng");
        System.out.println("2. Tự động chèn giá trị ngẫu nhiên trong mảng");
        System.out.println("3. Xuất mảng");
        System.out.println("4. Liệt kê các giá trị âm");
        System.out.println("5. Liệt kê các số nguyên tố");
        System.out.println("6. Liệt kê các phần tử thuộc [a,b]");
        System.out.println("7. Tính tổng các phần tử là số nguyên tố");
        System.out.println("8. Trung bình cộng phần tử dương");
        System.out.println("9. Đếm số phần tử lớn hơn x");
        System.out.println("10. Đếm giá trị nguyên tố trong mảng");
        System.out.println("11. Kiểm tra mảng số nguyên tố");
        System.out.println("12. Kiểm tra mảng tăng dần");
        System.out.println("13. Giá trị lớn nhất trong mảng");
        System.out.println("14. Giá trị nhỏ nhất trong mảng");
        System.out.println("15. Số âm lớn nhất trong mảng");
        System.out.println("16. Đảo ngược mảng");
        System.out.println("---------------");
        System.out.println("0. Thoát chương trình");
        System.out.println("---------------");
        System.out.println("Vui nhập nhập lựa chọn : ");
    }
    public static void NhapMang(int a[], int n)
    {
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < n ; i++)
        {
            System.out.println("Nhập phần tử a["+ i + "] : ");
            a[i] = sc.nextInt();
        }
    }
    public static void NhapMang_Random(int a[], int n)
    {
        Random ran = new Random();
        for (int i = 0; i < n ; i++)
        {
            a[i] = ran.nextInt(-199,199);
        }
    }
    public static void XuatMang(int a[])
    {
        System.out.println("Các phần tử trong mảng bao gồm : ");
        for (int so : a)
        {
            System.out.print(so + " ");
        }
    }
    public static void giaTriAm_Mang(int a[], int n)
    {
        System.out.println("Các giá trị âm trong mảng : ");
        for (int i = 0; i < n; i++)
        {
            if(a[i] < 0)
                System.out.print(a[i]);
        }
    }
    public static boolean isPrime (int n)
    {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++)
            if (n % i ==0)
                return false;
        return true;
    }
    public static void soNguyenTo_Mang(int a[], int n)
    {
        System.out.println("Các số nguyên tố trong mảng : ");
        for (int i = 0; i < n; i++)
        {
            if(isPrime(a[i]))
                System.out.print(a[i] + " ");
        }
    }
    public static void giaTriPhamVi_Mang(int a[], int n, int x, int y)
    {
        System.out.println("Các số trong phạm vi ["+x+","+y+"] : ");
        for (int i = 0; i < n; i++)
        {
            if(a[i] >= x && a[i] <= y)
                System.out.print(a[i]+ " ");
        }
    }
    public static void tongSoNguyenTo_Mang(int a[], int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            if(isPrime(a[i]))
                sum += a[i];
        }
        System.out.println("Tổng : " + sum);
    }
    public static void tbcongSoDuong_Mang(int a[], int n)
    {
        int sum = 0, dem = 0;
        for (int i = 0; i < n; i++)
        {
            if(a[i] > 0)
            {
                sum += a[i];
                dem ++;
            }
        }
        if (dem == 0)
            System.out.println("Không có số dương");
        else
            System.out.println("Trung bình cộng = " + (sum / dem));
    }
    public static void demSoPTLonHonX_Mang(int a[], int n, int x)
    {
        int dem = 0;
        for (int i = 0; i < n; i++)
        {
            if(a[i] > x)
                dem++;
        }
        System.out.println("Có " + dem + " phần tử lớn hơn " + x);
    }
    public static void demSoNguyenTo_Mang (int a[], int n)
    {
        int dem = 0;
        for (int i = 0; i < n; i++)
        {
            if(isPrime(a[i]))
                dem++;
        }
        System.out.println("Có " + dem + " số nguyên tố trong mảng");
    }
    public static void isAllPrime(int a[], int n)
    {
        boolean is = true;
        for (int i = 0; i < n; i++)
        {
            if(!isPrime(a[i]))
                is = false;
        }
        if (is)
            System.out.println("Toàn bộ giá trị là số nguyên tố");
        else
            System.out.println("Không toàn bộ giá trị là số nguyên tố");
    }
    public static void isAscending(int a[], int n)
    {
        boolean is = true;
        for (int i = 0; i < n - 1; i++)
        {
            if(a[i] > a[i+1])
                is = false;
        }
        if (is)
            System.out.println("Mảng tăng dần");
        else
            System.out.println("Mảng không tăng dần");
    }
    public static void maxGT_Mang(int a[], int n)
    {
        int max = a[0];
        for (int i = 0; i < n; i++)
        {
            if(max < a[i])
                max = a[i];
        }
        System.out.println("Giá trị lớn nhất : " + max);
    }
    public static void minGT_Mang(int a[], int n)
    {
        int min = a[0];
        for (int i = 0; i < n; i++)
        {
            if(min > a[i])
                min = a[i];
        }
        System.out.println("Giá trị nhỏ nhất : " + min);
    }
    public static void minGTAm_Mang(int a[], int n)
    {
        int min = 0;
        for (int i = 0; i < n; i++)
        {
            if(a[i] < 0)
            {
                if(min > a[i])
                    min = a[i];
            }
        }
        if (min == 0)
            System.out.println("Không tồn tại số âm trong mảng");
        else System.out.println("Giá trị nhỏ nhất : " + min);
    }
    public static void daoNguocMang(int a[], int n)
    {
        System.out.println("Trước : ");
        XuatMang(a);
        for (int i = 0 ; i < (n - 1) / 2; i ++)
        {
            int tmp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = tmp;
        }
        System.out.println("\nSau : ");
        XuatMang(a);
    }
}
