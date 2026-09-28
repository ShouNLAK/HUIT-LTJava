package com.example.tuan_07.Model;

import jakarta.persistence.*;

@Entity
@Table(name="DanhMuc")
public class DanhMuc {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "maDM")
    int maDM;

    @Column(name = "TenDM")
    String tenDM;

    @Column(name = "moTa")
    String moTa;

    public int getMaDM() {
        return maDM;
    }

    public void setMaDM(int maDM) {
        this.maDM = maDM;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTenDM() {
        return tenDM;
    }

    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }

    public DanhMuc() {
    }

    public DanhMuc(int maDM, String tenDM, String moTa) {
        this.maDM = maDM;
        this.tenDM = tenDM;
        this.moTa = moTa;
    }
}
