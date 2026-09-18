package com.example.tuan_05.DAO;

import com.example.tuan_05.Model.SinhVien;

import java.util.List;

public interface SinhVienDAO {
    void save(SinhVien sv);
    SinhVien findById(int id);

    List<SinhVien> findAll();
    List<SinhVien> search(String keyword);
    void update(SinhVien sv);
    void deleteById(int id);

}
