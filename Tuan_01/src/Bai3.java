
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai3 {
    public static void main(String[] args) {
        int a, b,max, min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a : "); 
        a = sc.nextInt();
        System.out.println("Nhập số b : "); 
        b = sc.nextInt();
        max = a > b ? a : b;
        min = a < b ? a : b;
        System.out.println("Số lớn nhất :" + max + "Số nhỏ nhất : " + min);
    }
}
