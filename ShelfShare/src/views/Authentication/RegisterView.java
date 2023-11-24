package views.Authentication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterView extends JFrame {

    private JTextField username;
    private JPasswordField password;
    private JButton registerButton;

    public RegisterView() {
        setTitle("ShelfShare");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Novo Usuário:");
        username = new JTextField(20);
        JLabel passwordLabel = new JLabel("Nova Senha:");
        password = new JPasswordField(20);
        registerButton = new JButton("Registrar");

        panel.add(usernameLabel);
        panel.add(username);
        panel.add(passwordLabel);
        panel.add(password);
        panel.add(registerButton);

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processRegistration();
            }
        });

        add(panel);
    }

    private void processRegistration() {
        String newUsername = username.getText();
        String newPassword = new String(password.getPassword());

        System.out.println(newUsername);
            System.out.println(newPassword);
        JOptionPane.showMessageDialog(RegisterView.this, "Registro bem-sucedido!");
        dispose();
    }
    
}
