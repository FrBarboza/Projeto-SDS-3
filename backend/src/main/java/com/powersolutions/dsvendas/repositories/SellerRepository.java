package com.powersolutions.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.powersolutions.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
