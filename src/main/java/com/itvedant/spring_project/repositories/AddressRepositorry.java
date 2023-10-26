package com.itvedant.spring_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.itvedant.spring_project.entities.Address;

public interface AddressRepositorry extends JpaRepository<Address,Integer>
{

}
