package com.ankush003.RecipeManager.repository;

import com.ankush003.RecipeManager.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
