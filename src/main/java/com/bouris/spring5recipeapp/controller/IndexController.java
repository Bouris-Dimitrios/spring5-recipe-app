package com.bouris.spring5recipeapp.controller;

import com.bouris.spring5recipeapp.domain.Category;
import com.bouris.spring5recipeapp.domain.UnitOfMeasure;
import com.bouris.spring5recipeapp.repositories.CategoryRepository;
import com.bouris.spring5recipeapp.repositories.UnitOfMeasureRepository;
import com.bouris.spring5recipeapp.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

//    private final CategoryRepository categoryRepository;
//    private final UnitOfMeasureRepository unitOfMeasureRepository
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
//       Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
//       Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
//
//        System.out.println("Cat id is " + categoryOptional.get().getId());
//        System.out.println("UOM id is" + unitOfMeasureOptional.get().getId());
          model.addAttribute("recipes",recipeService.getAllRecipes() );

        return "indexPage";
    }
}
