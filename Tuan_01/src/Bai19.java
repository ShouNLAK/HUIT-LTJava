
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai19 {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số m : ");
        m = sc.nextInt();
        System.out.println("Nhập số n : ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= m; j++)
            {
                if ((i == 1 || i == n) || (j == 1 || j == m))
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
