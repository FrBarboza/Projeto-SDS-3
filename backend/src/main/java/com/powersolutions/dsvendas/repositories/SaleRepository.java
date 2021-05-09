package com.powersolutions.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.powersolutions.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
