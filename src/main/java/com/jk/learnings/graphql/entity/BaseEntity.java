package com.jk.learnings.graphql.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.ObjectUtils;

import java.time.LocalDateTime;

@MappedSuperclass
@Getter
@Setter
public class BaseEntity {
    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "updated_date")
    private LocalDateTime updatedDate;

    @Column(name = "created_by", length = 100)
    private String createdBy;

    @Column(name = "updated_by", length = 100)
    private String updatedBy;

    @Column(name = "status", length = 50, nullable = false)
    private String status = "IN_ACTIVE"; // Default status

    @Column(name = "deleted", nullable = false)
    private boolean deleted = false; // Default to false

    protected void onCreate() {
        this.createdDate = ObjectUtils.defaultIfNull(this.createdDate, LocalDateTime.now());
        this.status = ObjectUtils.defaultIfNull(this.status, "IN_ACTIVE");
        this.deleted = ObjectUtils.defaultIfNull(this.deleted, false);
    }

    protected void onUpdate() {
        this.updatedDate = LocalDateTime.now();
    }
}
