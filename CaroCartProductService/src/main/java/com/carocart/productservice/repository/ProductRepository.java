package com.carocart.productservice.repository;

import com.carocart.productservice.entity.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findBySubCategoryId(Long subCategoryId);
    List<Product> findByAddedByRoleAndAddedById(String role, Long vendorId);

}