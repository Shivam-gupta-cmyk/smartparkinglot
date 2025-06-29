package com.parking.smartparkinglot.entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Entity
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne
    private Ticket ticket;
    private LocalDateTime exitTime;
    private double totalFees;
    @ManyToOne
    private Gate exitGate;

}
