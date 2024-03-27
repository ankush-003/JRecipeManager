package com.ankush003.RecipeManager.repository;

import com.ankush003.RecipeManager.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
