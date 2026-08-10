
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai5 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a : "); 
        a = sc.nextInt();
        System.out.println("Nhập số b : "); 
        b = sc.nextInt();
        System.out.println("Nhập số c : "); 
        c = sc.nextInt();
        if (a != 0)
        {
            double delta = b*b - 4*a*c;
            if (delta == 0) 
            {
                System.out.println("Nghiệm duy nhất = " + (-b / 2*a));
            }
            else if (delta > 0)
            {
                System.out.println("Nghiệm thứ nhất = " + ((-b - Math.sqrt(delta))/ 2*a));
                System.out.println("Nghiệm thứ nhất = " + ((-b + Math.sqrt(delta))/ 2*a));
            }
            else
            {
                System.out.println("Phương trình vô nghiệm");
            }
        }
        else
        {
            System.out.println("Không phải phương trình bậc 2");
        }
    }
}
