package com.ankush003.RecipeManager.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="reviews")
public class Review {
    @Id
    private Long id;

    @Lob
    @Column(name="review")
    private String review;

    // relationships
    @ManyToOne
    @JoinColumn(name="recipe_id")
    private Recipe recipe;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
