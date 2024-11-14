package co2123.hw1;

import co2123.hw1.domain.Dish;
import co2123.hw1.domain.Menu;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Hw1Application implements CommandLineRunner {
    public static List<Menu> menus;

    public static void main(String[] args) {
        SpringApplication.run(Hw1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        menus = new ArrayList<>();

        Dish dish1 = new Dish();
        dish1.setName("Pizza");
        dish1.setDescription("Margherita pizza");
        dish1.setDietary("Vegetarian");
        dish1.setPrice(10);

        Dish dish2 = new Dish();
        dish2.setName("Pasta");
        dish2.setDescription("Macaroni cheese");
        dish2.setDietary("Vegetarian");
        dish2.setPrice(8);

        Menu menu = new Menu();
        menu.setId(1);
        menu.setType("Dinner");
        menu.setRestaurant("Bella Italia");
        menu.setDishes(Arrays.asList(dish1, dish2));

        menus.add(menu);


    }
}
