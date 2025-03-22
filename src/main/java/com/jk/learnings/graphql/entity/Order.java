package com.jk.learnings.graphql.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.ObjectUtils;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "order")
public class Order extends BaseEntity {

    @Column(name = "order_number", nullable = false, length = 100, unique = true)
    private String orderNumber;

    @Column(name = "order_date", nullable = false)
    private LocalDateTime orderDate;

    @Column(name = "cancel_date")
    private LocalDateTime cancelDate;

    @Column(name = "shipment_date")
    private LocalDateTime shipmentDate;

    @Column(name = "delivered_date")
    private LocalDateTime deliveredDate;

    @ManyToOne
    @JoinColumn(name = "payment_id")
    private CustomerPayment payment;


    @PrePersist
    public void prePersist() {
        super.onCreate();
        this.orderDate = ObjectUtils.defaultIfNull(this.orderDate, LocalDateTime.now());
    }

    @PreUpdate
    public void preUpdate() {
        super.onUpdate();
        this.orderDate = ObjectUtils.defaultIfNull(this.orderDate, LocalDateTime.now());
    }
}
