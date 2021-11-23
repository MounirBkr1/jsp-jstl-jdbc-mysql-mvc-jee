package web;

import metier.Produit;

import java.util.ArrayList;
import java.util.List;

//objet ds lequel on va stoquer les données saisie et les resultats a afficher
public class ProduitModel {
    //saisir comme donnee
    private  String motCle;
    //afficher comme resultat list produits
    private List<Produit> produits=new ArrayList<>();

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
