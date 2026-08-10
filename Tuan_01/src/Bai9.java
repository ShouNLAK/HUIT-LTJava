
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai9 {
    public static void main(String[] args) {
        int soDienC, soDienM, soDien, tienDien = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện cũ : ");
        soDienC = sc.nextInt();
        System.out.println("Nhập số điện mới : ");
        soDienM = sc.nextInt();
        soDien = soDienM - soDienC;
        if (soDien > 50){
            soDien -= 50;
            if (soDien > 50){
                soDien -= 50;
                if (soDien > 100){
                    soDien -= 100;
                    if (soDien > 100) {
                        soDien -= 100;
                        if (soDien > 0){
                            tienDien += 205*soDien;
                        }
                    }
                    else { tienDien += 2242 * soDien;}
                }
                else { tienDien += 1786 *soDien ;}
            }
            else { tienDien += 1533 * soDien ; }
        }
        else { tienDien += 1480 * soDien ;}
        System.out.println("Tiền điện = " + tienDien + " VND");
    }
}
