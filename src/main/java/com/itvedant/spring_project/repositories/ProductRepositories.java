package com.itvedant.spring_project.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import com.itvedant.spring_project.entities.Product;
import java.util.List;


@Repository
public interface ProductRepositories extends JpaRepository<Product,Integer>
{
    @RestResource(path ="namecontain")
    List<Product> findByNameContaining(String pattern);
}
