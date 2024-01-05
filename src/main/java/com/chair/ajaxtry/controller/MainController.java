package com.chair.ajaxtry.controller;

import com.chair.ajaxtry.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String root(){return "index";}

    @GetMapping("/load")
    public String loadDemo(){
        return "ajax_load";
    }


}
