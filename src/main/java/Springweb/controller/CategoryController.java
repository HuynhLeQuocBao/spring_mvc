
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
    VegetableRepository vegtableRepository;

    @GetMapping(value = "/category")
    public String getAll(Model model) {
        Iterable<Category> list = categoryRepository.findAll();
        model.addAttribute("list", list);
        return "home";

    }

    @PostMapping("/search_category")
    public String searchVegetable(Model m, @RequestParam(name="search_category", required = false) String name){
        List <Vegetable3> list;
        if(name!=""){
            System.out.println(name);
            list = categoryRepository.searchCategoryByName(name);
        } else{
            list= (List<Vegetable3>) vegtableRepository.findAll();
        }
        m.addAttribute("data", list);
        return "home";
    }
}
