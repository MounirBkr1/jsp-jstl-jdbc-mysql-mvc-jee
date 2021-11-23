package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements IMetierCatalogue{
    @Override
    public List<Produit> getProduitsParMC(String mc) {
       List<Produit> prods= new ArrayList<Produit>();
        Connection conn= SingletonConection.getConnection();
        try {
            PreparedStatement ps= conn.prepareStatement
                    ("select*from produits where nom_produit like ?");
            //remplacer 1er ? par %mc%
            ps.setString(1,"%"+mc+"%");
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Produit p=new Produit();
                p.setIdProduit(rs.getLong("id_produit"));
                p.setNomProduit(rs.getString("nom_produit"));
                p.setPrix(rs.getDouble("prix"));
                prods.add(p);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prods;
    }

    @Override
    public void addProduit(Produit p) {

    }
}
