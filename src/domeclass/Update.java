package domeclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

    public static void main(String[] args) throws SQLException {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String url = "jdbc:mysql://localhost:3306/jdb";
        String update = "update std set name = ?  where id = 55";
        Connection con = DriverManager.getConnection(url, "root", "");
        PreparedStatement pStat = con.prepareStatement(update);
        pStat.setInt(1, x);
        pStat.executeUpdate();
    }
}
