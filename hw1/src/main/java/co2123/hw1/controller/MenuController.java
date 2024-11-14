package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MenuController {
    @RequestMapping("/menus")
    public String menu(Model model) {
        model.addAttribute("menus", Hw1Application.menus);
        return "menus/list";
    }

    @RequestMapping("/newMenu")
    public String newMenu(Model model){
        model.addAttribute("menu", new Menu());
        return "menus/form";

    }

    @RequestMapping("/addMenu")
    public String addMenu(@ModelAttribute Menu menu){
        Hw1Application.menus.add(menu);
        return "redirect:/menus";
    }


}
