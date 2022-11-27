package com.shop.produit.Models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@Table(name="Produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;

    @Column(name="code")
    private String code;

    @Column(name = "libelle")
    private String libelle;

    @Column(name="qte")
    private int qte;

    @Column(name = "description")
    private String description;
}
