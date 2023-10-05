import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Main{
    public static void main(String[] args) {
        getConnected();

        hostelList.main();
        //hostel.main();
      viewHostel.main();
     //login.main();

    }


    public static Connection getConnected(){
        try{
            String driver="com.mysql.cj.jdbc.Driver";
            String databaseurl="jdbc:mysql://localhost:3306/bank";
            String username="root";
            String password="007sj007";
            Class.forName(driver);
            Connection conn= DriverManager.getConnection(databaseurl, username, password);
            System.out.println("Database connected");
            return conn;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}