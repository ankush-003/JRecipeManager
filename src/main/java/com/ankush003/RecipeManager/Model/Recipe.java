package com.ankush003.RecipeManager.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
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

    @Column(name="instructions")
    private String instructions;
    
    @Column(name="cooking_time")
    private Integer cookingTime;

    @Column(name="difficulty_level")
    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficultyLevel;

    @Column(name="rating")
    private Double rating;

    @Column(name="ingredients")
    private String ingredients;

    // relations
    @ManyToOne
    @JoinColumn(name="created_by")
    @JsonBackReference(value= "created_recipes")
    private User createdBy;

    @OneToMany(mappedBy = "recipe", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference(value = "recipe_reviews")
    private List<Review> reviews;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(
            name = "recipe_tags",
            joinColumns = @JoinColumn(name = "recipe_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    @JsonIgnoreProperties
    private List<User> favUsers;
}
