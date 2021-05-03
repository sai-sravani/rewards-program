package com.mycompany.service.rewards.rewards;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mycompany.service.rewards.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
