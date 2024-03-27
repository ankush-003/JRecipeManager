package com.ankush003.RecipeManager.repository;

import com.ankush003.RecipeManager.Model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
}
