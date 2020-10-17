package com.sureshonetomany.jpa.dto;

import com.sureshonetomany.jpa.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {


    private Customer customer;

}
