
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai15 {
    public static void main(String[] args) {
        float tong = 0;
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            float n;
            System.out.println("Nhập số (Lớn hơn 0) để tính tổng ( 0 - để dừng ) :");
            n = sc.nextFloat();
            if (n < 0){
                System.out.println("Phải lớn hơn 0. Nhập lại");
                System.out.println("Tổng : " + tong);
            }
            else if ( n == 0) {break;}
            else
            {
                tong += n;
                System.out.println("Hiện tại : " + tong);
            }
        }
    }
}
