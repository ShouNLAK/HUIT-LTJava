
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai10 {
    public static boolean nam_Nhuan (int Nam)
    {
        if (Nam % 400 == 0 || (Nam % 4 == 0 && Nam % 100 != 0))
        {
            return true;
        }
        return false;
    }
    public static int chk_Thang(int Thang, int Nam)
    {
        switch(Thang){
            case 1 : 
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                return 31;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                return 30;
            case 2 :
                if(nam_Nhuan(Nam) ) {return 29;}
                else {return 28;}
            default :
                return 0;
        }
    }
    
    public static void main(String[] args) {
        int ngay, thang, nam;
        boolean Valid = false;
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhập ngày : ");
        ngay = sc.nextInt();
        System.out.println("Nhập tháng : ");
        thang = sc.nextInt();
        System.out.println("Nhập năm : ");
        nam = sc.nextInt();
        if (nam > 0 && (thang >= 1 && thang <= 12))
        {
            int Max_Ngay = chk_Thang(thang, nam);
            if (ngay <= Max_Ngay)
                Valid = true;
        }
        if (Valid)
        {
            System.out.println("Ngày được nhập là hợp lệ");
        }
        else{
            System.out.println("Ngày được nhập không hợp lệ");
        }
            
    }
}
