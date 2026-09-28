package com.example.tuan_07.Controller;

import com.example.tuan_07.Model.DanhMuc;
import com.example.tuan_07.Model.SanPham;
import com.example.tuan_07.Repository.DanhMucRepository;
import com.example.tuan_07.Repository.SanPhamRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SanPhamController {
    private final SanPhamRepository sanPhamRepository;
    private DanhMucRepository danhMucRepository;

    public SanPhamController(SanPhamRepository sanPhamRepository, DanhMucRepository danhMucRepository) {
        this.sanPhamRepository = sanPhamRepository;
        this.danhMucRepository = danhMucRepository;
    }

    @GetMapping("")
    public String XuatDSSP(Model obj, @RequestParam(value = "keyword", required = false) String keyword)
    {
        List<SanPham> DS;
        if (keyword == null || keyword.trim().isEmpty()){
            DS = sanPhamRepository.findAll();
        }
        else
        {
            DS = sanPhamRepository.findByTenSPContainingIgnoreCase(keyword.trim());
            obj.addAttribute("keyword", keyword);
        }

        obj.addAttribute("DSSP", DS);
        return "Index";
    }

    @GetMapping("/Add")
    public String CreateSP(Model obj)
    {
        List<DanhMuc> DSDM = danhMucRepository.findAll();
        SanPham sp = new SanPham();
        obj.addAttribute("SP", sp);
        obj.addAttribute("DanhMuc", DSDM);
        return "Modify";
    }

    @GetMapping("/Update")
    public String UpdateSP(Model obj,@RequestParam(value = "maSP") int maSP)
    {
        List<DanhMuc> DSDM = danhMucRepository.findAll();
        SanPham sp = sanPhamRepository.findByMaSP(maSP);
        obj.addAttribute("SP", sp);
        obj.addAttribute("DanhMuc", DSDM);
        return "Modify";
    }

    @PostMapping("/Save")
    public String SaveSP(Model obj, @ModelAttribute(value = "SP") SanPham sp)
    {
        sanPhamRepository.save(sp);
        List<SanPham> DS = sanPhamRepository.findAll();
        obj.addAttribute("DSSP", DS);
        return "Index";
    }

    @GetMapping("/Delete")
    public String DeleteSP(Model obj, @RequestParam(value = "maSP") int maSP)
    {
        sanPhamRepository.deleteById(maSP);
        List<SanPham> DS = sanPhamRepository.findAll();
        obj.addAttribute("DSSP", DS);
        return "Index";
    }

    @GetMapping("/Detail")
    public String DetailSP (Model obj, @RequestParam(value = "maSP") int maSP)
    {
        SanPham sp = sanPhamRepository.findByMaSP(maSP);
        obj.addAttribute("SP", sp);
        return "Detail";
    }
}
