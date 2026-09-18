package com.example.tuan_05;

import com.example.tuan_05.DAO.SinhVienDAO;
import com.example.tuan_05.Model.SinhVien;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tuan05Application {

    @Bean
    public CommandLineRunner commandLineRunner(SinhVienDAO sinhVienDAO)
    {
        return runner -> {
            readSinhVien(sinhVienDAO);
        };
    }

    private void readSinhVien(SinhVienDAO sinhVienDAO)
    {
        System.out.println("Đang tạo mới 1 thực thể sinh viên...");
        SinhVien sinhVien = new SinhVien("Daffy","Duck","daffy@luv2code.com");

        System.out.println("Đang lưu sinh viên");
        sinhVienDAO.save(sinhVien);

        System.out.println("\nĐã lưu sinh viên với ID : " + sinhVien.getId());

        System.out.println("Đang lấy thông tin sinh viên từ ID : " + sinhVien.getId());

        SinhVien found = sinhVienDAO.findById(sinhVien.getId());

        System.out.println("Đã tìm thấy sinh viên : " + found);
    }

    public static void main(String[] args) {
        SpringApplication.run(Tuan05Application.class, args);
    }



}
