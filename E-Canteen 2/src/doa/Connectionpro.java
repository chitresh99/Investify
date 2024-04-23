package doa;
import java.sql.*;

public class Connectionpro {
    public static Connection getCon(){
     Connection con=null;

            String host ="dpg-cjv1phd175es73cett1g-a.singapore-postgres.render.com";
            String port ="5432";
            String database="ecanteen"; 
            String url= "jdbc:postgresql://"+host+":"+port+"/"+database;
            String user ="ecanteen_user";
            String password ="AjrLn8wOPOxgetUu9M1E4WHhqXsLDnB8";  
        
        try
        {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection(url,user,password);
            if(con!=null){
                System.out.println("Connection OK");
            }
            else{
                System.out.println("Connection failed");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
}

    public PreparedStatement prepareStatement(String insertQuery) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
