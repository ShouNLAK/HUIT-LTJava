
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai4 {
    public static void main(String[] args) {
        int a, b, c, max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a : "); 
        a = sc.nextInt();
        System.out.println("Nhập số b : "); 
        b = sc.nextInt();
        System.out.println("Nhập số c : "); 
        c = sc.nextInt();
        max = (a > b && a > c) ? a : (b > c ? b : c);
        min = (a < b && a < c) ? a : (b < c ? b : c);
        System.out.println("Số lớn nhất :" + max + " Số nhỏ nhất : " + min);
    }
}
