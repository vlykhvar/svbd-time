package com.svbd.svbd.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Embeddable
public abstract class CreatedAtRemovedAt {

    @Column(name = "CREATE_AT")
    private LocalDateTime createAt;

    @Column(name = "REMOVED_AT")
    private LocalDateTime removedAt;


    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getRemovedAt() {
        return removedAt;
    }

    public void setRemovedAt(LocalDateTime removedAt) {
        this.removedAt = removedAt;
    }
}