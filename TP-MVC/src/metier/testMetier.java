package metier;

import sun.applet.Main;

import java.util.List;

public class testMetier {
        public static void main(String[] args){
            MetierImpl metier= new MetierImpl();
            List<Produit> prods= metier.getProduitsParMC("h");
            for(Produit p:prods){
                System.out.println(p.getNomProduit());
            }


        }
}
