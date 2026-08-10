
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai6 {
    public static void main(String[] args) {
        int nam;
        Scanner sc = new Scanner(System.in);   
        System.out.println("Nhập năm : "); 
        nam = sc.nextInt();
        if (nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0))
        {
            System.out.println("Đây là năm nhuận");
        }
        else
        {
            System.out.println("Đây khong phải là năm nhuận");
        }
    }
}
