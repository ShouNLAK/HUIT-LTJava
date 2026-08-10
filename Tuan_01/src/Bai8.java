
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai8 {
    public static void main(String[] args) {
        double diem;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Nhập điểm : "); 
        diem = sc.nextInt();
        System.out.print("Đánh giá : ");
        if (diem >= 8.5){
            System.out.println("A");
        }
        else if (diem >= 7){
            System.out.println("B");
        }
        else if (diem >= 5.5){
            System.out.println("C");
        }
        else if (diem >= 4){
            System.out.println("D");
        }
        else if (diem >= 0){
            System.out.println("F");
        }
    }
}
