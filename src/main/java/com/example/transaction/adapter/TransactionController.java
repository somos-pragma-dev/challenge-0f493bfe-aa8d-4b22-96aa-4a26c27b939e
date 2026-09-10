package com.example.transaction.adapter;

import com.example.transaction.domain.Transaction;
import com.example.transaction.domain.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @PostMapping
    public Mono<Transaction> createTransaction(@RequestBody Transaction transaction) {
        return transactionService.createTransaction(transaction);
    }

    @GetMapping("/{id}")
    public Mono<Transaction> getTransaction(@PathVariable Long id) {
        return transactionService.getTransaction(id);
    }

    @PutMapping
    public Mono<Transaction> updateTransaction(@RequestBody Transaction transaction) {
        return transactionService.updateTransaction(transaction);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteTransaction(@PathVariable Long id) {
        return transactionService.deleteTransaction(id);
    }
}