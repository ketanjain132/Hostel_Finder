import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class login extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton btnNewButton;
    private JButton btnNewButton2;
    private JLabel label;
    private JPanel contentPane;
    Color c = new Color(232, 251, 255);


    public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login frame = new login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public login() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 100, 1014, 597);
        Color c1 = new Color(192,218,229);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(c1);
        contentPane.setLayout(null);

        JComboBox usertype = new JComboBox();
        usertype.addItem("User");
        usertype.addItem("Owner");
        usertype.setFont(new Font("Times New Roman", Font.PLAIN, 32));
        usertype.setBounds(481, 65, 250, 60);
        usertype.setBackground(c);
        contentPane.add(usertype);

        JLabel lblU1 = new JLabel("");
        lblU1.setIcon(new ImageIcon(getClass().getResource("img_12.png")));
        lblU1.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblU1.setBounds(400, 65, 80, 72);
        contentPane.add(lblU1);

        JLabel lblNewLabel = new JLabel("Login As");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));
        lblNewLabel.setBounds(250, 54, 273, 93);
        contentPane.add(lblNewLabel);



        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        textField.setToolTipText("Username");
        textField.setBounds(481, 170, 281, 68);
        textField.setBackground(c);
        contentPane.add(textField);
        textField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setToolTipText("Password");
        passwordField.setBounds(481, 286, 281, 68);
        passwordField.setBackground(c);
        contentPane.add(passwordField);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setBackground(Color.BLACK);
        lblUsername.setForeground(Color.BLACK);
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblUsername.setBounds(250, 166, 193, 52);
        contentPane.add(lblUsername);

        JLabel lblU = new JLabel("");
        lblU.setIcon(new ImageIcon(getClass().getResource("img_8.png")));
        lblU.setBounds(425, 170, 80, 52);
        contentPane.add(lblU);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setForeground(Color.BLACK);
        lblPassword.setBackground(Color.CYAN);
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblPassword.setBounds(250, 286, 193, 52);
        contentPane.add(lblPassword);

        JLabel lblP = new JLabel("");
        lblP.setIcon(new ImageIcon(getClass().getResource("img_9.png")));
        lblP.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lblP.setBounds(420, 286, 193, 52);
        contentPane.add(lblP);

        JLabel lbll = new JLabel("");
        lbll.setIcon(new ImageIcon(getClass().getResource("img_10.png")));
        lbll.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lbll.setBounds(470, 400, 193, 52);
        contentPane.add(lbll);

        JLabel lblln = new JLabel("");
        lblln.setIcon(new ImageIcon(getClass().getResource("img_11.png")));
        lblln.setBounds(470, 490, 193, 52);
        contentPane.add(lblln);

        JLabel Register = new JLabel("Don't have an account?");
        Register.setForeground(Color.BLACK);
        Register.setBackground(Color.CYAN);
        Register.setFont(new Font("Tahoma", Font.PLAIN, 20));
        Register.setBounds(200, 480, 300, 73);
        contentPane.add(Register);

        btnNewButton2 = new JButton("Register");
        btnNewButton2.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton2.setBounds(545, 480, 162, 73);

        btnNewButton2.setBackground(c);

        btnNewButton2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                registerPage registerframe = new registerPage();
                registerframe.setVisible(true);
            }
        });

        btnNewButton = new JButton("Login");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
        btnNewButton.setBounds(545, 392, 162, 73);
        btnNewButton.setBackground(c);

        btnNewButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String userName = textField.getText();
                String password = passwordField.getText();
                try {
                    Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank",
                            "root", "007sj007");

                    PreparedStatement st = (PreparedStatement) connection
                            .prepareStatement("Select email, passwords from loginDetails where email=? and passwords=?");

                    st.setString(1, userName);
                    st.setString(2, password);
                    ResultSet rs = st.executeQuery();
                    if (rs.next()) {
                        dispose();
                        JOptionPane.showMessageDialog(btnNewButton, "You have successfully logged in");
                        home.main();
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton, "Wrong Username & Password");
                    }
                } catch (SQLException sqlException) {
                    sqlException.printStackTrace();
                }
            }
        });


        JLabel lbl1 = new JLabel("");
        lbl1.setForeground(Color.BLACK);
        lbl1.setBackground(Color.CYAN);
        lbl1.setIcon(new ImageIcon(getClass().getResource("img_7.png")));
        lbl1.setFont(new Font("Tahoma", Font.PLAIN, 31));
        lbl1.setBounds(0, 0, 200, 100);
        contentPane.add(lbl1);

        contentPane.add(btnNewButton);
        contentPane.add(btnNewButton2);

        label = new JLabel("");
        label.setBounds(0, 0, 1008, 562);
        contentPane.add(label);
    }
}