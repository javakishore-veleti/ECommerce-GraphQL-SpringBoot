package com.jk.learnings.graphql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "customer_payment")
public class CustomerPayment extends BaseEntity {

    @Column(name = "payment_type", nullable = false, length = 50)
    private String paymentType; // e.g., CARD, CASH, ACH, FOREX, GIFTCARD, DISCOUNTED

    @Column(name = "currency", length = 10)
    private String currency; // e.g., USD, EUR

    @Column(name = "payment_reference", length = 100)
    private String paymentReference;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "discount_applied")
    private Double discountApplied;

    @PrePersist
    public void preCreate() {
        super.onCreate();
    }

    @PreUpdate
    public void preUpdate() {
        super.onUpdate();
    }
}
