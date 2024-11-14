package co2123.hw1.controller;

import co2123.hw1.Hw1Application;
import co2123.hw1.domain.Dish;
import co2123.hw1.domain.Menu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DishController {


    @GetMapping("/dishes")
    public String dishes(@RequestParam("menu") int menuId, Model model) {
        Menu targetMenu = null;


        for (Menu menu : Hw1Application.menus) {
            if (menu.getId() == menuId) {
                targetMenu = menu;
                break;
            }
        }

        if (targetMenu != null) {
            model.addAttribute("dishes", targetMenu.getDishes());
            model.addAttribute("menu", targetMenu);
        }

        return "dishes/list";
    }


    @GetMapping("/newDish")
    public String newDish(@RequestParam("menu") int menuId, Model model) {
        Menu targetMenu = null;


        for (Menu menu : Hw1Application.menus) {
            if (menu.getId() == menuId) {
                targetMenu = menu;
                break;
            }
        }

        if (targetMenu != null) {
            model.addAttribute("dish", new Dish());
            model.addAttribute("menu", targetMenu);
        }

        return "dishes/form";
    }


    @PostMapping("/addDish")
    public String addDish(@ModelAttribute("dish") Dish dish, @RequestParam("menu") int menuId, Model model) {
        Menu targetMenu = null;


        for (Menu menu : Hw1Application.menus) {
            if (menu.getId() == menuId) {
                targetMenu = menu;
                break;
            }
        }


        if (targetMenu != null) {
            targetMenu.getDishes().add(dish);
        }

        return "redirect:/menus";
    }
}
