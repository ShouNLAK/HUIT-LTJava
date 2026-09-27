package com.example.tuan_06.DAO;

import com.example.tuan_06.Model.TaiKhoan;

import java.util.List;

public interface TaiKhoanDAO {
    void save(TaiKhoan tk);
    void update(TaiKhoan tk);
    void delete(TaiKhoan tk);
    List<TaiKhoan> findAll();

    TaiKhoan findById(int id);
    void deleteById(int id);
    List<TaiKhoan> search(String keyword);
}
