package com.ankush003.RecipeManager.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name="users")
public class User {
    @Id
    @GeneratedValue
    private Long id;//Long->wrapper class

    @Column(name="name")
    private String name;

    @Column(name="email", unique = true)
    private String email;

    @Column(name="password")
    private String password;

    // relationships
    @OneToMany(mappedBy = "createdBy", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonManagedReference(value = "created_recipes")
    private List<Recipe> createdRecipes;

    @ManyToMany(mappedBy = "favUsers", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Recipe> favRecipes;
}
