import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class viewHostel extends JFrame {

    private static final long serialVersionUID = 1L;

    private JButton btnNewButton;
    private JButton btnNewButton2;
    private JLabel label;
    private JPanel contentPane;



    ImageIcon image;


    public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    viewHostel frame = new viewHostel();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }



    public viewHostel() {
        Color c1 = new Color(192,218,229);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 100, 1014, 597);
        setResizable(true);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setBackground(c1);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Hostel details");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 10, 273, 93);
        contentPane.add(lblNewLabel);

        JLabel lblHname = new JLabel("Hostel_name");
        lblHname.setBackground(Color.BLACK);
        lblHname.setForeground(Color.BLACK);
        lblHname.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblHname.setBounds(50, 100, 193, 52);
        contentPane.add(lblHname);

        JLabel lblAddress = new JLabel("Hostel_address");
        lblAddress.setBackground(Color.BLACK);
        lblAddress.setForeground(Color.BLACK);
        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblAddress.setBounds(50, 150, 193, 52);
        contentPane.add(lblAddress);

        JLabel lblRent = new JLabel("Rent");
        lblRent.setBackground(Color.BLACK);
        lblRent.setForeground(Color.BLACK);
        lblRent.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblRent.setBounds(400, 100, 193, 52);
        contentPane.add(lblRent);

        JLabel lblArea = new JLabel("Area");
        lblArea.setBackground(Color.BLACK);
        lblArea.setForeground(Color.BLACK);
        lblArea.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblArea.setBounds(600, 100, 193, 52);
        contentPane.add(lblArea);

        JLabel lblDeposit = new JLabel("Deposit");
        lblDeposit.setBackground(Color.BLACK);
        lblDeposit.setForeground(Color.BLACK);
        lblDeposit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblDeposit.setBounds(800, 100, 193, 52);
        contentPane.add(lblDeposit);

        JLabel lblbr = new JLabel("1 Bedroom");
        lblbr.setBackground(Color.BLACK);
        lblbr.setForeground(Color.BLACK);
        lblbr.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblbr.setBounds(600, 200, 193, 52);
        contentPane.add(lblbr);

        JLabel lblNoBR = new JLabel("No. of Bedrooms");
        lblNoBR.setBackground(Color.BLACK);
        lblNoBR.setForeground(Color.BLACK);
        lblNoBR.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNoBR.setBounds(600, 225, 193, 52);
        contentPane.add(lblNoBR);


        JLabel lblPtype = new JLabel("Property Type");
        lblPtype.setBackground(Color.BLACK);
        lblPtype.setForeground(Color.BLACK);
        lblPtype.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPtype.setBounds(800, 225, 193, 52);
        contentPane.add(lblPtype);

        JLabel lblPtype1 = new JLabel("Flat");
        lblPtype1.setBackground(Color.BLACK);
        lblPtype1.setForeground(Color.BLACK);
        lblPtype1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPtype1.setBounds(800, 200, 193, 52);
        contentPane.add(lblPtype1);

        JLabel lblPt = new JLabel();
        lblPt.setBounds(935, 320, 180, 52);
        lblPt.setIcon(new ImageIcon(getClass().getResource("img_13.png")));
        contentPane.add(lblPt);

        JLabel lblF = new JLabel();
        lblF.setBounds(927, 405, 100, 72);
        lblF.setIcon(new ImageIcon(getClass().getResource("img_14.png")));
        contentPane.add(lblF);

        JLabel lblPt1 = new JLabel();
        lblPt1.setBounds(925, 210, 193, 52);
        lblPt1.setIcon(new ImageIcon(getClass().getResource("img_1.png")));
        contentPane.add(lblPt1);

        JLabel lblParking = new JLabel("Bike");
        lblParking.setBackground(Color.BLACK);
        lblParking.setForeground(Color.BLACK);
        lblParking.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblParking.setBounds(600, 300, 193, 52);
        contentPane.add(lblParking);

        JLabel lblParking1 = new JLabel("Parking");
        lblParking1.setBackground(Color.BLACK);
        lblParking1.setForeground(Color.BLACK);
        lblParking1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblParking1.setBounds(600, 325, 193, 52);
        contentPane.add(lblParking1);

        JLabel lblHage = new JLabel("2 yrs");
        lblHage.setBackground(Color.BLACK);
        lblHage.setForeground(Color.BLACK);
        lblHage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblHage.setBounds(800, 300, 193, 52);
        contentPane.add(lblHage);

        JLabel lblf1 = new JLabel("Furnishing status");
        lblf1.setBackground(Color.BLACK);
        lblf1.setForeground(Color.BLACK);
        lblf1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblf1.setBounds(780, 425, 193, 52);
        contentPane.add(lblf1);

        JLabel lblf = new JLabel("semi");
        lblf.setBackground(Color.BLACK);
        lblf.setForeground(Color.BLACK);
        lblf.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblf.setBounds(780, 400, 193, 52);
        contentPane.add(lblf);

        JLabel lblHage1 = new JLabel("Age of building");
        lblHage1.setBackground(Color.BLACK);
        lblHage1.setForeground(Color.BLACK);
        lblHage1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblHage1.setBounds(800, 325, 193, 52);
        contentPane.add(lblHage1);

        JLabel lblbal = new JLabel("Yes");
        lblbal.setBackground(Color.BLACK);
        lblbal.setForeground(Color.BLACK);
        lblbal.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblbal.setBounds(600, 400, 193, 52);
        contentPane.add(lblbal);

        JLabel lblbal1 = new JLabel("Balcony");
        lblbal1.setBackground(Color.BLACK);
        lblbal1.setForeground(Color.BLACK);
        lblbal1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblbal1.setBounds(600, 425, 193, 52);
        contentPane.add(lblbal1);


        JLabel lblT = new JLabel("");
        lblT.setIcon(new ImageIcon(getClass().getResource("img.png")));
        lblT.setBounds(0, 0, 200, 100);
        contentPane.add(lblT);

        JLabel lblb = new JLabel("");
        lblb.setIcon(new ImageIcon(getClass().getResource("img_2.png")));
        lblb.setBounds(500, 200, 80, 80);
        contentPane.add(lblb);

        JLabel lblb1 = new JLabel("");
        lblb1.setIcon(new ImageIcon(getClass().getResource("img_4.png")));
        lblb1.setBounds(500, 300, 80, 80);
        contentPane.add(lblb1);

        JLabel lblb2 = new JLabel("");
        lblb2.setIcon(new ImageIcon(getClass().getResource("img_5.png")));
        lblb2.setBounds(500, 400, 80, 80);
        contentPane.add(lblb2);

        JLabel lblb3 = new JLabel("");
        lblb3.setIcon(new ImageIcon(getClass().getResource("img_6.png")));
        lblb3.setBounds(50, 200, 400, 400);
        contentPane.add(lblb3);










        label = new JLabel("");
        label.setBounds(0, 0, 1008, 562);
        contentPane.add(label);
    }
}