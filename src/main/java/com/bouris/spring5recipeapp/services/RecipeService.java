package com.bouris.spring5recipeapp.services;

import com.bouris.spring5recipeapp.domain.Recipe;

import java.util.List;

public interface RecipeService {

    List<Recipe> getAllRecipes();

}
