package Springweb.controller;

import Springweb.*;
import Springweb.entity.Vegetable3;
import Springweb.repository.VegetableRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author caothanh
 */
@Controller
public class VegetableController {

    @Autowired
    private VegetableRepository vegtableRepository;

    @GetMapping("/")
    public String getAll(Model m) {
        Iterable<Vegetable3> list = vegtableRepository.findAll();
        m.addAttribute("data", list);
        return "home";
    }

    @GetMapping("/best-seller")
    public String getBestSeller(Model m) {
        Iterable<Vegetable3> list = vegtableRepository.findAll();
        m.addAttribute("data", list);
        return "bestseller";
    }

    @GetMapping("/product-of-category")
    public String getProductOfCat(Model m) {
        Iterable<Vegetable3> list = vegtableRepository.findAll();
        m.addAttribute("data", list);
        return "productofcategory";
    }

}
