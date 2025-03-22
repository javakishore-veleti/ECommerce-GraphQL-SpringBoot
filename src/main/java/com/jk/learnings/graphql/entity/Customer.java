package com.jk.learnings.graphql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PreUpdate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "customer")
public class Customer extends BaseEntity {

    @Column(name = "name", length = 250)
    private String name;

    @Column(name = "customer_type", length = 25)
    private String customerType;

    @Column(name = "first_name", length = 100)
    private String firstName;

    @Column(name = "last_name", length = 100)
    private String lastName;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "phone", length = 25)
    private String phone;

    @Column(name = "mobile_phone", length = 25)
    private String mobilePhone;

    @Column(name = "contact_phone", length = 25)
    private String contactPhone;  // ✅ Fixed the typo here

    @Column(name = "comments", length = 5000)
    private String comments;

    @PreUpdate
    public void preUpdate() {
        super.onUpdate();
    }
}
