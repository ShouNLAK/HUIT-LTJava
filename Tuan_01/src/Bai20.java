
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai20 {
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
                for (int k = 1; k <= i; k++)
                {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }
}
