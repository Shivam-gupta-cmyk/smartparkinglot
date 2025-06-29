package com.parking.smartparkinglot.repository;

import com.parking.smartparkinglot.entity.Gate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface GateRepository extends JpaRepository<Gate, UUID> {
}
