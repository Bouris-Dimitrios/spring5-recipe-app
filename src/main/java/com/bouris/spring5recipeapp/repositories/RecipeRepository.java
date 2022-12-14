package com.bouris.spring5recipeapp.repositories;

import com.bouris.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
    Optional<Recipe> findByDescription(String description);
}
