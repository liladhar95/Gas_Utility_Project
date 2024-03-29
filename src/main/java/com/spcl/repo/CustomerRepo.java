package com.spcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spcl.entity.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Long> {

}
