package metier;

import java.util.List;

//INTERFACE POR DEFINIR LES METHODE A IMPLEMENTER PAR CLASS METIER
public interface IMetierCatalogue {

    public List<Produit> getProduitsParMC(String mc);
    public  void addProduit(Produit p);
}
