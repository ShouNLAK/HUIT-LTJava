
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai14 {
    public static void main(String[] args) {
        int n;
        boolean Valid = true;
        Scanner sc= new Scanner (System.in);
        System.out.println("Nhập số n : ");
        n = sc.nextInt();
        for(int i = 2; i < n; i++)
        {
            if (n % i == 0)
            {
                Valid = false;
            }
        }
        if (Valid){
            System.out.println(n + " là số nguyên tố");
        }
        else
        {
            System.out.println(n + " không là số nguyên tố");
        }
    }
}
