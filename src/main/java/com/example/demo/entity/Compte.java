package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Compte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String ref;
    private long solde;

    public Compte() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public long getSolde() {
        return solde;
    }

    public void setSolde(long solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ref='" + ref + '\'' +
                ", solde=" + solde +
                '}';
    }
}
