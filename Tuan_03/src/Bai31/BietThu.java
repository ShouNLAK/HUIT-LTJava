/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai31;

/**
 *
 * @author Administrator
 */
public class BietThu extends BatDongSan implements phiKinhDoanh{

    public BietThu() {
    }

    @Override
    public void Nhap()
    {
        super.Nhap();
    }
    
    @Override
    public double tinhGiaTri()
    {
        return (chieuDai*chieuRong) * 400000 + tinhPhiKinhDoanh();
    }
    
    @Override
    public double tinhPhiKinhDoanh()
    {
        return (chieuDai*chieuRong) * 1000;
    }

    @Override
    public String toString() {
        return super.toString() + "Tính phí kinh doanh : " + tinhPhiKinhDoanh();
    }
    
    
}
