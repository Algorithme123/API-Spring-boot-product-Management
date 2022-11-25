package com.shop.produit.Repository;

import com.shop.produit.Models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProduitRepository extends JpaRepository <Produit ,Integer> {
}
