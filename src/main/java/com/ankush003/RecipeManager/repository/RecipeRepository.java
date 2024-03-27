package com.ankush003.RecipeManager.repository;

import com.ankush003.RecipeManager.Model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
