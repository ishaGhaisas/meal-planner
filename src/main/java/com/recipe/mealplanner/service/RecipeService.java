package com.recipe.mealplanner.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recipe.mealplanner.entity.Recipe;
import com.recipe.mealplanner.repository.RecipeRepository;

@Service
public class RecipeService {
	
	@Autowired
	public RecipeRepository recipeRepo;
	
	public List<Recipe> getAllRecipes(){
		return recipeRepo.findAll();
	}
	
	public Optional<Recipe> getRecipeById(Long id) {
		return recipeRepo.findById(id);
	}
	
	public Recipe createRecipe(Recipe recipe) {
		return recipeRepo.save(recipe);
	}
	
	public void deleteRecipe(Long id) {
		recipeRepo.deleteById(id);
	}
}
