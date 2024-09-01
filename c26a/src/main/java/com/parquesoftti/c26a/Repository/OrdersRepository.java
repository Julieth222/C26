package com.parquesoftti.c26a.Repository;

import com.parquesoftti.c26a.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
    Optional<Orders> findByQuantity(String quantity);
}
