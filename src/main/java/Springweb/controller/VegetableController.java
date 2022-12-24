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
import org.springframework.web.bind.annotation.PathVariable;
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
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/")
    public String getAll(Model m) {
        //danh sách sản phẩm
        Iterable<Vegetable3> list = vegtableRepository.findAll();
        m.addAttribute("data", list);
        //danh sách danh mục
        Iterable<Category> category = categoryRepository.findAll();
        m.addAttribute("list", category);
        return "home";
    }

    @PostMapping("/search_vegetable")
    public String searchVegetable(Model m, @RequestParam(name="search_vegetable", required = false) String name){
        List <Vegetable3> list;
        if(name!=""){
            list = vegtableRepository.SearchByCategoryNameOrVegetableName( name, name);
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

    @GetMapping("/{cateId}")
    public String getAll(Model model, @PathVariable String cateId) {
        List <Vegetable3> list = vegtableRepository.findByCategory(cateId);
        model.addAttribute("data", list);
        return "home";

    }
}
