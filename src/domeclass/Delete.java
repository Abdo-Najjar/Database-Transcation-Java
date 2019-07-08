package domeclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) throws SQLException {
        Scanner x = new Scanner(System.in);
        System.out.println("the id that you wanna to ");
        int x1 = x.nextInt();
        String url = "jdbc:mysql://localhost:3306/jdb";
        String uname = "root";
        String q = "delete FROM std where id = ? ";
        String pw = "";
        Connection con = DriverManager.getConnection(url,uname,pw);
        PreparedStatement statement = con.prepareStatement(q);
        statement.setInt(1, x1 );
        statement.executeUpdate();
        
        
        
//        
//        String q = "delete FROM std where id = "+x1;
//        Statement state = con.createStatement();    //using statment
//        state.executeUpdate(q);
    }
}
