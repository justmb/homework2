package com.example.homework2.service;

import com.example.homework2.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CompanyService {
    Page<Product> findByCode(String productCode, Pageable pageable);

    Page<Product> findAll(Pageable pageable);
}
