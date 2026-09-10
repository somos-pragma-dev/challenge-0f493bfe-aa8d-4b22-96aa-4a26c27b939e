package com.example.transaction;

import com.example.transaction.domain.Transaction;
import com.example.transaction.domain.TransactionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
class TransactionServiceTest {
    @Autowired
    private TransactionService transactionService;

    @Test
    void createTransaction() {
        Transaction transaction = new Transaction();
        // Set transaction properties
        Mono<Transaction> result = transactionService.createTransaction(transaction);
        StepVerifier.create(result)
               .expectNextMatches(t -> t.getId()!= null)
               .verifyComplete();
    }
}