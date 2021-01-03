package com.ksptooi.jmp33.entities;

import javax.persistence.*;

@Entity
@Table(name = "dom_category")
public class DomCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = null;

    @Column
    private String name = null;

    @Override
    public String toString() {
        return "DomCategory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
