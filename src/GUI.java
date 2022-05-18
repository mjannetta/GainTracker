import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    private JFrame frame;
    private JPanel panel;
    public GUI() {
        frame = new JFrame();
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Gain Tracker");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String args[]) {
        JFrame login = new Login("Gain Tracker - Login");
        login.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
