package Springweb.controller;

import Springweb.*;
import Springweb.entity.Vegetable3;
import Springweb.repository.VegetableRepository;
import Springweb.entity.Category;
import Springweb.repository.CategoryRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @PostMapping("/search_vegetable")
    public String searchVegetable(Model m, @RequestParam(name="search_vegetable", required = false) String name){
        List <Vegetable3> list;
        if(name!=""){
            list = vegtableRepository.SearchVegetableByCategogyIdOrName( name);
            System.out.println("test"+list);
        } else{
            list= (List<Vegetable3>) vegtableRepository.findAll();
        }
        m.addAttribute("data", list);
        return "home";
    }

    @GetMapping("/best-seller")
    public String getBestSeller(Model m) {
        List<Vegetable3> list = vegtableRepository.getBestSeller();
        m.addAttribute("data", list);
        return "home";
    }
}
