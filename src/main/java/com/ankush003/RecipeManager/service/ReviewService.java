package com.ankush003.RecipeManager.service;

//import com.ankush003.RecipeManager.Model.Recipe;
import com.ankush003.RecipeManager.Model.Review;
import com.ankush003.RecipeManager.repository.RecipeRepository;
import com.ankush003.RecipeManager.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    private ReviewRepository reviewRepository;
    @Autowired
    ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }
}
