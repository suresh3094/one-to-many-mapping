package com.sureshonetomany.jpa.repository;

import com.sureshonetomany.jpa.dto.OrderResponse;
import com.sureshonetomany.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    @Query("SELECT new com.sureshonetomany.jpa.dto.OrderResponse( c.name,p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();
}
