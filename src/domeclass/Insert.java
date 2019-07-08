package domeclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Scanner x = new Scanner(System.in);
        System.out.println("First number");
        int x1 = x.nextInt();
        System.out.println("Secound number");
        int x2 = x.nextInt();
        String url = "jdbc:mysql://localhost:3306/dpproject";
        String uname = "root";
        String q = "insert into Managers (name , password) values (?,?)";
        String pw = "";
        Connection con = DriverManager.getConnection(url,uname,pw);
        PreparedStatement statement = con.prepareStatement(q);
        statement.setInt(1, x1 );
        statement.setInt(2,x2 );
        statement.executeUpdate();
    }
}
