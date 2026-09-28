package com.example.tuan_07.Controller;

import com.example.tuan_07.Model.DanhMuc;
import com.example.tuan_07.Repository.DanhMucRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DanhMucController {
    private final DanhMucRepository danhMucRepository;

    public DanhMucController(DanhMucRepository danhMucRepository) {
        this.danhMucRepository = danhMucRepository;
    }
}