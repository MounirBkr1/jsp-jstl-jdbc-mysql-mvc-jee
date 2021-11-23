package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//connection to db
public class SingletonConection {
    private  static Connection connection;
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mvc_cat","root","Mounir15429");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        return connection;
    }
}
