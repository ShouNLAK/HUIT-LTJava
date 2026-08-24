
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrator
 */
public class Diem2D {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Diem2D() {
    }
    
    public Diem2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void nhapDiem()
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tọa độ x - hoành độ : ");
        this.x = sc.nextInt();
        System.out.println("Nhập tọa độ y - tung độ : ");
        this.y = sc.nextInt();
    }
    public void hienThi()
    {
        System.out.println("Tọa độ : (" + x + "," + y + ") ");
    }
    public void doiDiem(int dx, int dy)
    {
        x += dx;
        y += dy;
    }
    public int giaTriX()
    {
        return getX();
    }
    public int giaTriY()
    {
        return getY();
    }
    public double khoangCach()
    {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }
    public double khoangCach(Diem2D d)
    {
        return Math.sqrt(Math.pow((d.x - x),2) + Math.pow((d.y - y),2));
    }
    
}
