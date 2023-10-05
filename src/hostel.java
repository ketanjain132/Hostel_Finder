
import org.apache.commons.dbutils.DbUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;




public class hostel extends JFrame{
    private JTextField txtName;
    private JTextField txtRent;
    private JTextField txtAddress;
    private JButton saveButton;
    private JTable table1;
    private JButton updateButton;
    private JButton deleteButton;
    private JButton searchButton;
    private JTextField txtId;
    private JPanel main;
    private JTextField txtType;
    private JTextField txtContact;

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


    public hostel() {
        connect();
        table_load();
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String hostelname,rent,address,type,contact;
                hostelname = txtName.getText();
                rent = txtRent.getText();
                address = txtAddress.getText();
                type = txtType.getText();
                contact = txtContact.getText();

                try {
                    pst = con.prepareStatement("insert into hostel(hostelname,rent,address,type,contact)values(?,?,?,?,?)");
                    pst.setString(1, hostelname);
                    pst.setString(2, rent);
                    pst.setString(3, address);
                    pst.setString(4, type);
                    pst.setString(5, contact);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Added");

                    txtName.setText("");
                    txtRent.setText("");
                    txtAddress.setText("");
                    txtType.setText("");
                    txtContact.setText("");
                    txtName.requestFocus();
                }

                catch (SQLException e1)
                {

                    e1.printStackTrace();
                }

            }




        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    String hostelid = txtId.getText();

                    pst = con.prepareStatement("select hostelname,rent,address,type,contact from hostel where hostelname = ?");
                    pst.setString(1, hostelid);
                    ResultSet rs = pst.executeQuery();

                    if(rs.next()==true)
                    {
                        String hostelname = rs.getString(1);
                        String emrent = rs.getString(2);
                        String emaddress = rs.getString(3);
                        String emtype = rs.getString(4);
                        String emcontact = rs.getString(5);

                        txtName.setText(hostelname);
                        txtRent.setText(emrent);
                        txtAddress.setText(emaddress);
                        txtType.setText(emtype);
                        txtContact.setText(emcontact);

                    }
                    else
                    {
                        txtName.setText("");
                        txtRent.setText("");
                        txtAddress.setText("");
                        txtType.setText("");
                        txtContact.setText("");
                        JOptionPane.showMessageDialog(null,"Invalid hostel No");

                    }
                }
                catch (SQLException ex)
                {
                    ex.printStackTrace();
                }

            }
        });
        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hostelid,hostelname,rent,address,type,contact;
                hostelname = txtName.getText();
                rent = txtRent.getText();
                address = txtAddress.getText();
                hostelid = txtId.getText();
                type = txtType.getText();
                contact = txtContact.getText();

                try {
                    pst = con.prepareStatement("update hostel set hostelname = ?,rent = ?,address = ? ,type = ?, contact = ? where hostelid = ?");
                    pst.setString(1, hostelname);
                    pst.setString(2, rent);
                    pst.setString(3, address);
                    pst.setString(4, hostelid);
                    pst.setString(5, contact);
                    pst.setString(6, hostelid);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Updated");
                    table_load();
                    txtName.setText("");
                    txtRent.setText("");
                    txtAddress.setText("");
                    txtType.setText("");
                    txtContact.setText("");
                    txtName.requestFocus();
                }

                catch (SQLException e1)
                {
                    e1.printStackTrace();
                }
            }

        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hostelid;
                hostelid = txtId.getText();

                try {
                    pst = con.prepareStatement("delete from hostel  where hostelid = ?");

                    pst.setString(1, hostelid);

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Record Deleted!!!!!");
                    table_load();
                    txtName.setText("");
                    txtRent.setText("");
                    txtAddress.setText("");
                    txtType.setText("");
                    txtContact.setText("");
                    txtName.requestFocus();
                }

                catch (SQLException e1)
                {

                    e1.printStackTrace();
                }
            }

        });
    }

    public static void main() {
        hostel e = new hostel();
        e.setContentPane(e.main);
        e.setTitle("hostel");
        e.setVisible(true);
        e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        e.setBounds(400,200,800,600);

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
