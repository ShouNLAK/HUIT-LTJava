package com.example.tuan_07.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "SanPham")
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MaSP")
    int maSP;

    @Column(name = "TenSP")
    String tenSP;

    @Column(name = "DonGia")
    double donGia;

    @Column(name = "SoLuong")
    int soLuong;

    @Column(name = "moTa")
    String moTa;

    @ManyToOne
    @JoinColumn(name = "maDM")
    DanhMuc maDM;

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public DanhMuc getMaDM() {
        return maDM;
    }

    public void setMaDM(DanhMuc maDM) {
        this.maDM = maDM;
    }

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, double donGia, int soLuong, String moTa, DanhMuc maDM) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.moTa = moTa;
        this.maDM = maDM;
    }
}
