package com.itvedant.spring_project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.itvedant.spring_project.entities.User;

@Repository
public interface UserRepositories extends JpaRepository<User,Integer>
{
    
}
