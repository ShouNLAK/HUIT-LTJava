
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai12 {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner (System.in);
        System.out.println("Nhập số n : ");
        n = sc.nextInt();
        System.out.println("Bội số của " + n + " = ");
        for(int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
