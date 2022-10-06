package com.bouris.spring5recipeapp.services;

import com.bouris.spring5recipeapp.domain.Recipe;
import com.bouris.spring5recipeapp.repositories.RecipeRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeServiceImpl implements  RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public List<Recipe> getAllRecipes() {
        return Streamable.of(recipeRepository.findAll()).toList();
    }
}
