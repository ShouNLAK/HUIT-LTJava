package com.example.tuan_07.Repository;

import com.example.tuan_07.Model.DanhMuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DanhMucRepository extends JpaRepository<DanhMuc, Integer> {
}
