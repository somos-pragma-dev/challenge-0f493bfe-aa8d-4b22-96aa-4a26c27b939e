package com.example.transaction.domain;

import reactor.core.publisher.Mono;

public interface TransactionService {
    Mono<Transaction> createTransaction(Transaction transaction);
    Mono<Transaction> getTransaction(Long id);
    Mono<Transaction> updateTransaction(Transaction transaction);
    Mono<Void> deleteTransaction(Long id);
}