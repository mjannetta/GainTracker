import javax.swing.*;

public class Login extends JFrame {
    private JPanel loginPanel;
    private JTextField usernameText;
    private JPasswordField passwordText;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JButton loginButton;

    public Login(String title) {
        super(title);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(loginPanel);
        this.setResizable(false);
        this.setBounds(10,10,300,200);
    }
}
