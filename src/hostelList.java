
import org.apache.commons.dbutils.DbUtils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.sql.*;

public class hostelList extends JFrame{
    private JPanel list;
    private JButton btn1;
    private JTextField txt1;
    private JList list1;
    private JComboBox comboBox1;
    private JTextField txtName;
    private JButton btnClick;
    private JSlider slider1;
    private JTextField txtId;
    private JButton searchbtn;
    private JTable table1;
    private JButton backButton;

    void table_load(){
        try
        {
            pst = con.prepareStatement("select * from hostel");
            ResultSet rs = pst.executeQuery();
            table1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }







    public hostelList() {
        connect();
        table_load();


        searchbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String hostelname = txtId.getText();

                    pst = con.prepareStatement("select hostelname,rent,address,type,contact from hostel where hostelname = ?");
                    pst.setString(1, hostelname);
                    ResultSet rs = pst.executeQuery();
                    table1.setModel(DbUtils.resultSetToTableModel(rs));


                } catch (SQLException ex) {
                    ex.printStackTrace();
                }


            }
        });


        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (comboBox1.getSelectedItem().toString().equals("1RK"))
                    try {
                        String hostelname = txtId.getText();

                        pst = con.prepareStatement("select hostelname,rent,address,type,contact from hostel where type = ?");
                        pst.setString(1, comboBox1.getSelectedItem().toString());
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));


                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                else if (comboBox1.getSelectedItem().toString().equals("1BHK")) {
                    try {
                        String hostelname = txtId.getText();

                        pst = con.prepareStatement("select hostelname,rent,address,type,contact from hostel where type = ?");
                        pst.setString(1, comboBox1.getSelectedItem().toString());
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));


                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                } else if (comboBox1.getSelectedItem().toString().equals("2BHK")) {
                    try {
                        String hostelname = txtId.getText();

                        pst = con.prepareStatement("select hostelname,rent,address,type,contact from hostel where type = ?");
                        pst.setString(1, comboBox1.getSelectedItem().toString());
                        ResultSet rs = pst.executeQuery();
                        table1.setModel(DbUtils.resultSetToTableModel(rs));


                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }

                }
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                home.main();
            }
        });
    }

    public static void main() {
        hostelList d=new hostelList();
        d.setContentPane(d.list);
        d.setTitle("Hostel List");
        d.setVisible(true);
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d.setBounds(600,200,800,600);
    }

    Connection con;
    PreparedStatement pst;
    public void connect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root","007sj007");
            System.out.println("Successs");
        }
        catch (ClassNotFoundException ex)
        {
            ex.printStackTrace();

        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }



}
