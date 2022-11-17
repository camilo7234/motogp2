package com.umanizales.motogp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity(name = "user_bikeraces")
@Data
@AllArgsConstructor

public class User {
    @Id
    @Column(name = "email", nullable = false)
    private String email;

    @Basic
    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @ManyToOne
    @JoinColumn(name = "rol_id", referencedColumnName = "id", nullable = false)
    private Rol rol;
    private Long id;

    public User() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}