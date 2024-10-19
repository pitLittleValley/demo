package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Entidad para la estructura S2
@Entity
@Table(name = "T2")
public class EntidadS2 {
    @Id
    private Long id;

    @Column(name = "A1")
    private String a1;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }
}
