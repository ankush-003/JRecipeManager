package com.ankush003.RecipeManager;

import com.ankush003.RecipeManager.Model.DifficultyLevel;
import com.ankush003.RecipeManager.Model.Recipe;
import com.ankush003.RecipeManager.Model.Review;
import com.ankush003.RecipeManager.Model.User;
import com.ankush003.RecipeManager.repository.RecipeRepository;
import com.ankush003.RecipeManager.repository.ReviewRepository;
import com.ankush003.RecipeManager.repository.UserRepository;
import jakarta.persistence.Lob;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Log
public class RecipeManagerApplication {

	private RecipeRepository recipeRepository;
	private ReviewRepository reviewRepository;
	private UserRepository userRepository;

	@Autowired
	RecipeManagerApplication(
			RecipeRepository recipeRepository,
			ReviewRepository reviewRepository,
			UserRepository userRepository
	) {
		this.recipeRepository = recipeRepository;
		this.reviewRepository = reviewRepository;
		this.userRepository = userRepository;
	}


	public static void main(String[] args) {
		SpringApplication.run(RecipeManagerApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
//			User user1 = User.builder().name("John Doe").email("john@example.com").password("password").build();
//			User user2 = User.builder().name("Jane Smith").email("jane@example.com").password("password").build();
//			User user3 = User.builder().name("Bob Johnson").email("bob@example.com").password("password").build();
//			List<User> users = new ArrayList<>(List.of(user1, user2, user3));
//			userRepository.saveAll(users);
//
//			// Create recipes
//			Recipe recipe1 = Recipe.builder().title("Pizza").instructions("Make the dough...").cookingTime(30).difficultyLevel(DifficultyLevel.EASY).rating(4.5).ingredients("Flour, yeast, ...").createdBy(user1).build();
//			Recipe recipe2 = Recipe.builder().title("Spaghetti").instructions("Boil the water...").cookingTime(20).difficultyLevel(DifficultyLevel.MODERATE).rating(4.0).ingredients("Pasta, tomatoes, ...").createdBy(user2).build();
//			Recipe recipe3 = Recipe.builder().title("Grilled Salmon").instructions("Marinate the salmon...").cookingTime(45).difficultyLevel(DifficultyLevel.HARD).rating(4.8).ingredients("Salmon, lemon, ...").createdBy(user3).build();
//			List<Recipe> recipes = new ArrayList<>(List.of(recipe1, recipe2, recipe3));
//			recipeRepository.saveAll(recipes);
//
//			// Create reviews
//			Review review1 = Review.builder().review("Excellent recipe!").recipe(recipe1).user(user2).build();
//			Review review2 = Review.builder().review("Could be better.").recipe(recipe2).user(user1).build();
//			Review review3 = Review.builder().review("Amazing flavor!").recipe(recipe3).user(user2).build();
//			List<Review> reviews = new ArrayList<>(List.of(review1, review2, review3));
//			reviewRepository.saveAll(reviews);
//
//			log.info("Data loaded successfully!");
			log.info("Application Started Successfully!");
		};
	}
}
