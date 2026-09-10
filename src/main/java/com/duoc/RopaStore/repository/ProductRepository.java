package com.duoc.RopaStore.repository;

import com.duoc.RopaStore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
