package com.mrunalini.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mrunalini.crm.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
