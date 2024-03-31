package com.ankush003.RecipeManager.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="reviews")
public class Review {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="review")
    private String review;

    // relationships
    @ManyToOne
    @JoinColumn(name="recipe_id")
    @JsonBackReference(value = "recipe_reviews")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
