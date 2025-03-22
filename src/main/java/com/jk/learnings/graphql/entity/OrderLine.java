package com.jk.learnings.graphql.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.ObjectUtils;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity(name = "order_line")
public class OrderLine extends BaseEntity {

    @ManyToOne(optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @Column(name = "customer_id", nullable = false, length = 36)
    private String customerId;

    @ManyToOne
    @JoinColumn(name = "shipment_address_id")
    private CustomerAddress shipmentAddress;

    @Column(name = "product_id", nullable = false, length = 36)
    private String productId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "unit_price")
    private Double unitPrice;

    @PrePersist
    public void preCreate() {
        super.onCreate();
    }

    @PreUpdate
    public void preUpdate() {
        super.onUpdate();
    }
}
