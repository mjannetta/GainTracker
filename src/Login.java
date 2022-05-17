import javax.swing.*;

public class Login extends JFrame{
    private JPanel loginPanel;
    private JTextField usernameText;
    private JPasswordField passwordText;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JButton button1;

    public Login(String title) {
        super(title);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(loginPanel);
        this.pack();
    }

    public static void main(String[] args) {
        JFrame frame = new Login("Gain Tracker");
        frame.setVisible(true);
    }
}
