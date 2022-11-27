package com.shop.produit.Services;


import com.shop.produit.Models.Produit;
import com.shop.produit.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServices {

    @Autowired
    private ProduitRepository produitRepository;

    public List<Produit> getProduits(){
        return produitRepository.findAll();
    }

    public  Produit CreateProduit(Produit produit){

        return (Produit) produitRepository.save(produit);
    }

    public Produit getProduitById(int id){
        return (Produit) produitRepository.findById(id).orElse(null);

    }

    public ResponseEntity<Produit> updateProduit(Produit produit,int id){
        Produit existingProduit = (Produit) produitRepository.findById(id).orElse(null);
        existingProduit.setCode(produit.getCode());
        existingProduit.setQte(produit.getQte());
        existingProduit.setLibelle(produit.getLibelle());
        existingProduit.setDescription(produit.getDescription());

        produitRepository.save(existingProduit);
        return ResponseEntity.ok().body(existingProduit);
    }

    public  String deleteProduit(int id){
        produitRepository.deleteById(id);
        return "produit supprimer";
    }

//    public Produit findProduit      f

}
