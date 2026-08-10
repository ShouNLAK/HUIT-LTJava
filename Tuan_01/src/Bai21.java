
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai21 {
    public static void main(String[] args) {
        int canh;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh : ");
        canh = sc.nextInt();
        for (int i = 1; i <= canh; i++)
        {
            for (int j = 1; j <= canh - i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++)
            {
                if (k == 1 || k == 2*i-1 || i == canh)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
