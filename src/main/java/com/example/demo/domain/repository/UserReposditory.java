package com.example.demo.domain.repository;

import com.example.demo.domain.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposditory extends JpaRepository<User,Long> {
}
