
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai7 {
    public static void main(String[] args) {
        int thang;
        Scanner sc = new Scanner(System.in);   
        System.out.println("Nhập thang : "); 
        thang = sc.nextInt();
        switch(thang){
            case 1 : 
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                System.out.println("Tháng " + thang + " có 30 ngày");
                break;
            case 2 :
                System.out.println("Tháng " + thang + " có 28 (hoặc 29 nếu là năm nhuận) ngày");
                break;
            default :
                System.out.println("Tháng không hợp lệ");
                break;
        }
    }
}
