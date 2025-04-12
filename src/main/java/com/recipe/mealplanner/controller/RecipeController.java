package com.recipe.mealplanner.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.recipe.mealplanner.entity.Recipe;
import com.recipe.mealplanner.service.RecipeService;

@RestController
public class RecipeController {
	
	@Autowired
	RecipeService recipeService;
	
	@GetMapping("/recipes")
	public List<Recipe> getAllRecipes(){
		return recipeService.getAllRecipes();
	}
	
	@GetMapping("/recipe/{id}")
	public Optional<Recipe> getRecipeById(@PathVariable Long id){
		return recipeService.getRecipeById(id);
	}
	
	@PostMapping("/recipe")
	public Recipe createRecipe(@RequestBody Recipe recipe) {
		return recipeService.createRecipe(recipe);
	}
	
	@DeleteMapping("/recipe/{id}")
	public void deleteRecipe(@PathVariable Long id) {
		recipeService.deleteRecipe(id);
	}
}
