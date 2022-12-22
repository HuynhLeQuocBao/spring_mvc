package Springweb.controller;

import Springweb.*;
import Springweb.entity.Vegetable3;
import Springweb.repository.VegetableRepository;
import Springweb.entity.Category;
import Springweb.repository.CategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author caothanh
 */
@Controller
public class VegetableController {

    @Autowired
    private VegetableRepository vegtableRepository;
    // private CategoryRepository categoryRepository;

    @GetMapping("/")
    public String getAll(Model m) {
        Iterable<Vegetable3> list = vegtableRepository.findAll();
        m.addAttribute("data", list);
        // Iterable<Category> category = categoryRepository.findAll();
        // m.addAttribute("category", category);
        return "home";
    }

}
