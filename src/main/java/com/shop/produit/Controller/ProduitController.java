package com.shop.produit.Controller;


import com.shop.produit.Models.Produit;
import com.shop.produit.Services.ProduitServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Produit")
@CrossOrigin(origins = "")
public class ProduitController {

    @Autowired
    private ProduitServices produitServices ;

    @RequestMapping(value = "/produit/all",method = RequestMethod.GET)
    public List<Produit> getAllArticles(){
        return produitServices.getProduits();
    }

    @RequestMapping(value = "/produit/{id}", method = RequestMethod.GET)
    public  Produit getOneArticle(@PathVariable int id){
        return  produitServices.getProduitById(id);

    }

    @RequestMapping(value = "/produit/add",method = RequestMethod.POST)
    public  Produit addArticle(@RequestBody Produit produit){

        return  produitServices.CreateProduit(produit);
    }




}
