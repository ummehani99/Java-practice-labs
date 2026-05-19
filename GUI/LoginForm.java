import javax.swing.*; 
import java.awt.*; 
 
public class LoginForm extends JFrame { 
    JLabel  lblTitle, lblUser, lblPass; 
    JTextField tfUser; 
    JPasswordField pfPass; 
    JButton btnLogin, btnClear; 
 
    public LoginForm() { 
        setTitle("Login"); 
        setSize(350, 280); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setLayout(null); 
        getContentPane().setBackground(new Color(240, 248, 255)); 
 
        lblTitle = new JLabel("USER LOGIN"); 
        lblTitle.setBounds(120, 20, 200, 30); 
        lblTitle.setFont(new Font("Arial", Font.BOLD, 16)); 
        add(lblTitle); 
 
        lblUser = new JLabel("Username:"); 
        lblUser.setBounds(40, 70, 100, 25); 
        add(lblUser); 
 
        tfUser = new JTextField(); 
        tfUser.setBounds(150, 70, 150, 25); 
        add(tfUser); 
 
        lblPass = new JLabel("Password:"); 
        lblPass.setBounds(40, 110, 100, 25); 
        add(lblPass); 
 
        pfPass = new JPasswordField(); 
        pfPass.setBounds(150, 110, 150, 25); 
        add(pfPass); 
 
        btnLogin = new JButton("Login"); 
        btnLogin.setBounds(70, 170, 90, 35); 
        btnLogin.setBackground(new Color(37, 99, 168)); 
        btnLogin.setForeground(Color.WHITE); 
        add(btnLogin); 
         btnClear = new JButton("Clear"); 
        btnClear.setBounds(185, 170, 90, 35); 
        add(btnClear); 
 
        // Button actions: 
        btnLogin.addActionListener(e -> { 
            String user = tfUser.getText(); 
            String pass = new String(pfPass.getPassword()); 
            if (user.equals("admin") && pass.equals("1234")) { 
                JOptionPane.showMessageDialog(this, "Login Successful!"); 
            } else { 
                JOptionPane.showMessageDialog(this, "Invalid credentials!"); 
            } 
        }); 
 
        btnClear.addActionListener(e -> { 
            tfUser.setText(""); 
            pfPass.setText(""); 
        }); 
 
        setVisible(true); 
    } 
 
    public static void main(String[] args) { 
        new LoginForm(); 
    } 
} 