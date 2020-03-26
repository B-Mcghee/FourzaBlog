package com.bm.fourzablog.ops;

import com.bm.fourzablog.dao.BlogDaoImpl;
import com.bm.fourzablog.dto.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    BlogDaoImpl dao;

    @GetMapping({"/home", "/", "/main", ""})
    public List<Category> mainPage(Model model) {
        return dao.getAllCategories();

//        model.addAttribute("categories", categories);
//        return "index";
    }
}
