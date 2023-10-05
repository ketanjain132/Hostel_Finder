import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends JFrame{
    private JButton viewHostelsButton;
    private JPanel homepage;
    private JButton addHostelButton;
    private JButton logoutButton;
    private JButton profileButton;

    public home() {
        viewHostelsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                hostelList.main();
            }
        });
        addHostelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                hostel.main();
            }
        });
    }

    public static void main() {
        home h = new home();
        h.setContentPane(h.homepage);
        h.setTitle("home");
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        h.setBounds(400,200,800,600);
    }


}
