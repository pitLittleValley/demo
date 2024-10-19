package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// Entidad para la estructura S1
@Entity
@Table(name = "T1")
public class EntidadS1 {
   @Id
    private Long id;

    @Column(name = "A1")
    private String a1;

    // Otros campos y métodos...

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



