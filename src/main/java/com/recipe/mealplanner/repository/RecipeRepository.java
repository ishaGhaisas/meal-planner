package com.recipe.mealplanner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.recipe.mealplanner.entity.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}
