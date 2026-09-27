package com.example.tuan_06.Controller;

import com.example.tuan_06.DAO.TaiKhoanDAO;
import com.example.tuan_06.Model.TaiKhoan;
import com.example.tuan_06.Repository.TaiKhoanRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TaiKhoanController {
    private final TaiKhoanRepository repository;

    public TaiKhoanController(TaiKhoanRepository repository) {
        this.repository = repository;
    }

    @GetMapping("")
    public String XuatDSTK(Model obj, @RequestParam(value = "keyword", required = false) String keyword) {
        List<TaiKhoan> dstk;
        if (keyword != null && !keyword.isEmpty()) {
            dstk = repository.findByFirstNameContainingOrEmailContaining(keyword, keyword);
            obj.addAttribute("keyword", keyword);
        } else {
            dstk = repository.findAll();
        }
        obj.addAttribute("DSTK", dstk);
        return "XuatDSTK";
    }

    @GetMapping("/Them")
    public String showFormForAdd(Model theModel) {
        TaiKhoan tk = new TaiKhoan();
        theModel.addAttribute("taiKhoan", tk);
        return "TK-Form";
    }

    @GetMapping("/Cap-Nhat")
    public String showFormForUpdate(@RequestParam("taiKhoanID") int theId, Model theModel) {
        TaiKhoan tk = (TaiKhoan) repository.findById(theId).orElse(null);
        theModel.addAttribute("taiKhoan", tk);
        return "TK-Form";
    }

    @PostMapping("/Luu")
    public String saveTaiKhoan(@ModelAttribute("taiKhoan") TaiKhoan tk, Model obj) {
        repository.save(tk);

        List<TaiKhoan> dstk = repository.findAll();
        obj.addAttribute("DSTK", dstk);

        return "XuatDSTK";
    }

    @GetMapping("/Xoa")
    public String delete(@RequestParam("taiKhoanID") int theId, Model obj) {
        repository.deleteById(theId);

        List<TaiKhoan> tk = repository.findAll();
        obj.addAttribute("DSTK", tk);
        return "XuatDSTK";
    }
}