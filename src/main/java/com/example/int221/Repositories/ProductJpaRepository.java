package com.example.int221.Repositories;

import com.example.int221.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductJpaRepository extends JpaRepository<Products, String> {

}
