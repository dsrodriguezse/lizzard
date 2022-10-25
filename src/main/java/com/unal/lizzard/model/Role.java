package com.unal.lizzard.model;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    public Role() {

    }

    public Role(String name) {
        super();
        this.name = name;
    }

    public long getId() {
        return id;
    }

}
