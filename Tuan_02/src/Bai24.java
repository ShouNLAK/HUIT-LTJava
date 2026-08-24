/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Bai24 {
    public static void main(String[] args) {
        Diem2D a = new Diem2D(3,4);
        System.out.println("Tọa độ của A : ");
        a.hienThi();
        
        Diem2D b = new Diem2D();
        b.nhapDiem();
        b.hienThi();
        
        Diem2D c = new Diem2D(b.getY()*-1, b.getX()*-1);
        c.hienThi();
        
        System.out.println("Khoảng cách từ B đến gốc tọa độ = " + b.khoangCach());
        System.out.println("Khoảng cách từ A đến B = " + a.khoangCach(b));
    }
}
