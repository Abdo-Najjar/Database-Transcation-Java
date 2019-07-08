package domeclass;

import java.sql.*;
import java.util.Scanner;

public class Select {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost/sms";
        String uname = "root";
        String q = "Select * from Managers where name =  ?  ";
        String pw = "";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pw);
        Scanner src = new Scanner(System.in);
        String name =src.nextLine();
        PreparedStatement st = con.prepareCall("Select * from managers");
        ResultSet rs = st.executeQuery();
        while (rs.next()) {
            String namee = rs.getString("name");
            int id = rs.getInt("password");
            System.out.println("name "+namee+" id:"+id);
        }
//        
//          while (rs.next()) {
//            int name = rs.getInt(1);
//            int id = rs.getInt(2);
//            System.out.println("name "+name+" id:"+id);
//        }
        st.close();
        con.close();
    }
}
