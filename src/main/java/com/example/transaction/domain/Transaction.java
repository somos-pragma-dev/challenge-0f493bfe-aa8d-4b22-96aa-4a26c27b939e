package com.example.transaction.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {
    private Long id;
    private LocalDateTime date;
    private BigDecimal amount;
    private String type;
    private String status;

    // Getters and setters
}