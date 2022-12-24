
package Springweb.controller;

import Springweb.entity.Category;
import Springweb.entity.Vegetable3;
import Springweb.repository.CategoryRepository;
import Springweb.repository.VegetableRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository; //
    @Autowired
    VegetableRepository vegtableRepository;

    // @GetMapping(value = "/category")
    // public String getAll(Model model) {
    //     Iterable<Category> list = categoryRepository.findAll();
    //     model.addAttribute("list", list);
    //     return "home";

    // }

}
