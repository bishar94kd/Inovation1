package com.Roleaceses.demo.Repo;

import com.Roleaceses.demo.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User ,Integer> {
}
