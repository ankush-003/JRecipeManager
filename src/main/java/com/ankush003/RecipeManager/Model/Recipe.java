package com.ankush003.RecipeManager.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="Recipes")
public class Recipe {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="title")
    private String title;

    @Lob
    @Column(name="instructions")
    private String instructions;
    
    @Column(name="cooking_time")
    private Integer cookingTime;


    @Column(name="difficulty_level", columnDefinition = "ENUM('EASY', 'MEDIUM', 'HARD')")
    @Enumerated(EnumType.STRING)
    private String difficultyLevel;

    @Column(name="rating")
    private Double rating;

    // relations
    @ManyToOne
    @JoinColumn(name="created_by")
    private User createdBy;

    @OneToMany(mappedBy = "recipe")
    private List<Review> reviews;

    @ManyToMany
    @JoinTable(
            name = "recipe_ingredients",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "ingredient_id")
    )
    private List<Ingredient> ingredients;
}
