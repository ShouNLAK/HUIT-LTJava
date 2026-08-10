
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai17 {
        public static void main(String[] args) {
        int n, Chan = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n : ");
        n = sc.nextInt();
        while (n != 0)
        {
            int num = n % 10;
            if (num % 2 == 0)
                Chan += 1;
            n /= 10;
        }
        System.out.println("Số lượng chữ số chẵn = " + Chan);
    }
}
