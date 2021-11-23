package web;

import metier.IMetierCatalogue;
import metier.MetierImpl;
import metier.Produit;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ControleurServlet")
public class ControleurServlet extends HttpServlet {

    private IMetierCatalogue metier;

    @Override
    public void init() throws ServletException {
        super.init();

        metier = new MetierImpl();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //lire donnees de la requete
        String mc=request.getParameter("motCle");
        //creer instance du model
        ProduitModel mod=new ProduitModel();
        //stoquer les données de la requete ds model
        mod.setMotCle(mc);
        //faire appela lacouche metier pr recuperer resultat
        List<Produit> prods = metier.getProduitsParMC(mc);
        //stoquer resultat ds model
        mod.setProduits(prods);
        //stoquer l objet dans modele
        request.setAttribute("modele",mod);

        request.getRequestDispatcher("/WEB-INF/ProduitView.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ProduitView.jsp").forward(request,response);
    }
}
