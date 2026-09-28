package com.example.tuan_07.Repository;

import com.example.tuan_07.Model.SanPham;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SanPhamRepository extends JpaRepository<SanPham, Integer> {
    List<SanPham> findByTenSPContainingIgnoreCase(String TenSP);
    SanPham findByMaSP(int MaSP);
    void deleteByMaSP(int MaSP);
}
