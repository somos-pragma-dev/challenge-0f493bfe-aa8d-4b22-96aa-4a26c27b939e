package com.example.transaction;

import com.example.transaction.adapter.TransactionController;
import com.example.transaction.domain.Transaction;
import com.example.transaction.domain.TransactionService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import reactor.core.publisher.Mono;

@WebFluxTest(TransactionController.class)
class TransactionControllerTest {
    @Autowired
    private WebTestClient webTestClient;

    @MockBean
    private TransactionService transactionService;

    @Test
    void createTransaction() {
        Transaction transaction = new Transaction();
        // Set transaction properties
        Mockito.when(transactionService.createTransaction(transaction))
               .thenReturn(Mono.just(transaction));
        webTestClient.post()
               .uri("/transactions")
               .bodyValue(transaction)
               .exchange()
               .expectStatus().isCreated()
               .expectBody(Transaction.class);
    }
}