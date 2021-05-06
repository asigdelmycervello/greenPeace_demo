package greenPeace.src;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class gp_controller {

    public static void main(String[] args) {
        //String dbUrl = "jdbc:postgresql://localhost:5432/d2mdlts44v8f2d";
        String dbUrl = "jdbc:postgresql://ec2-34-200-94-86.compute-1.amazonaws.com:5432/d2mdlts44v8f2d";
        String username = "dkeffbbfkxdwmz";
        String password = "7c26f4b08fa1a6aa7fb3ca3d53eda92a7d27d380f8fef1d5272b1577a31279e7";
        try {
            Connection connection = DriverManager.getConnection(dbUrl, username, password);
            System.out.println("connected");

            String sql = "UPDATE salesforce.account SET website = 'www.gmail.com' WHERE type = 'Prospect'";
            Statement stm = connection.createStatement();
            int rows = stm.executeUpdate(sql);
            System.out.println("number of rows affected: "+rows);
            connection.close();
        } catch (SQLException e) {
            //TODO: handle exception
            System.out.println("Error");
            e.printStackTrace();
        }

    }
    
}
