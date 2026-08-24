
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
public class Bai25 {
    public static void main(String[] args) {
        PhanSo a = new PhanSo(3, 7);
        a.xuatPS();
        PhanSo b = new PhanSo(4, 9);
        b.xuatPS();

        PhanSo x = new PhanSo();
        x.nhapPS();
        PhanSo y = new PhanSo();
        y.nhapPS();

        System.out.print("X + Y = ");
        (x.congPS(y)).xuatPS();

        int n = 0;
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        do {
            System.out.println("Nhập số lượng phân số muốn tạo : ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (n <= 0);

        PhanSo[] arr = new PhanSo[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new PhanSo(ran.nextInt(100) + 1, ran.nextInt(100) + 1);
        }

        sum_PS(arr);
        max_PS(arr);
        sort_PS(arr, n);
        xuat_DS(arr);
    }

    public static void xuat_DS(PhanSo[] obj) {
        for (PhanSo PS : obj) {
            PS.xuatPS();
        }
    }

    public static void sum_PS(PhanSo[] obj) {
        PhanSo KQ = new PhanSo(0, 1);
        for (PhanSo PS : obj) {
            KQ = KQ.congPS(PS);
        }
        System.out.println("Tổng các phân số : ");
        KQ.xuatPS();
    }

    public static void max_PS(PhanSo[] obj) {
        PhanSo max = obj[0];
        for (PhanSo PS : obj) {
            if (PS.lonHon(max)) {
                max = PS;
            }
        }
        System.out.print("Phân số lớn nhất : ");
        max.xuatPS();
    }

    public static void sort_PS(PhanSo[] obj, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (!obj[i].lonHon(obj[j])) {
                    PhanSo tmp = obj[i];
                    obj[i] = obj[j];
                    obj[j] = tmp;
                }
            }
        }
    }
}