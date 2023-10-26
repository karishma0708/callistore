package com.itvedant.spring_project.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.itvedant.spring_project.entities.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category,Integer>
{

}
