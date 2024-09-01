package com.parquesoftti.c26a.Repository;

import com.parquesoftti.c26a.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ProductRepository  extends JpaRepository <Product, Long>{
}
