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
@Entity
@Builder
@Table(name="ingredients")
public class Ingredient {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name="name")
    private String name;

    @ManyToMany(mappedBy = "ingredients")
    private List<Recipe> recipes;
}
