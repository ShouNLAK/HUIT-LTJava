package com.example.tuan_06.Repository;

import com.example.tuan_06.Model.TaiKhoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TaiKhoanRepository extends JpaRepository<TaiKhoan, Integer> {
    List<TaiKhoan> findByFirstNameContainingOrEmailContaining(String firstName, String email);
}
