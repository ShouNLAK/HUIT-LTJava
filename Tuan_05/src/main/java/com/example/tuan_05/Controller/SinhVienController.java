package com.example.tuan_05.Controller;

import com.example.tuan_05.DAO.SinhVienDAO;
import com.example.tuan_05.Model.SinhVien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SinhVienController {

    private final SinhVienDAO sinhVien;

    public SinhVienController(SinhVienDAO sinhVien) {
        this.sinhVien = sinhVien;
    }

    @GetMapping("")
    public String XuatDSSV(Model obj, @RequestParam(value = "keyword", required = false) String keyword) {
        List<SinhVien> sv;
        if (keyword != null && !keyword.isEmpty()) {
            sv = sinhVien.search(keyword);
            obj.addAttribute("keyword", keyword);
        } else {
            sv = sinhVien.findAll();
        }
        obj.addAttribute("DS",sv);
        return "XuatDSSV";
    }

    @GetMapping("/Them")
    public String showFormForAdd(Model theModel) {
        SinhVien theSinhVien = new SinhVien();
        theModel.addAttribute("sinhVien", theSinhVien);
        return "SinhVienForm";
    }

    @GetMapping("/Cap-Nhat")
    public String showFormForUpdate(@RequestParam("sinhVienId") int theId, Model theModel) {
        SinhVien theSinhVien = sinhVien.findById(theId);
        theModel.addAttribute("sinhVien", theSinhVien);
        return "SinhVienForm";
    }

    @PostMapping("/Luu")
    public String saveSinhVien(@ModelAttribute("sinhVien") SinhVien theSinhVien, Model obj) {
        if (theSinhVien.getId() == 0) {
            sinhVien.save(theSinhVien);
        } else {
            sinhVien.update(theSinhVien);
        }
        
        // Lấy lại danh sách sinh viên sau khi lưu
        List<SinhVien> sv = sinhVien.findAll();
        obj.addAttribute("DS", sv);
        
        return "XuatDSSV";
    }

    @GetMapping("/Xoa")
    public String delete(@RequestParam("sinhVienId") int theId, Model obj) {
        sinhVien.deleteById(theId);
        
        // Lấy lại danh sách sinh viên sau khi xóa
        List<SinhVien> sv = sinhVien.findAll();
        obj.addAttribute("DS", sv);
        
        return "XuatDSSV";
    }
}
