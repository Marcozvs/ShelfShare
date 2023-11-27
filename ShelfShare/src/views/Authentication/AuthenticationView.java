package views.Authentication;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AuthenticationView extends JFrame {

    private JTextField username;
    private JPasswordField password;

    public AuthenticationView() {
        setTitle("ShelfShare");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        addFormField(panel, "Usuário:", username = new JTextField(20));
        addFormField(panel, "Senha:", password = new JPasswordField(20));

        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Registrar");

        gbc.gridx = 0;
        gbc.gridy = panel.getComponentCount();
        gbc.gridwidth = 2;
        panel.add(loginButton, gbc);

        gbc.gridy++;
        panel.add(registerButton, gbc);

        loginButton.addActionListener(new LoginButtonHandler());
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegisterScreen();
            }
        });

        add(panel);
        setVisible(true);
    }

    private void addFormField(JPanel panel, String label, JComponent component) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = panel.getComponentCount();
        gbc.gridwidth = 1;
        panel.add(new JLabel(label), gbc);

        gbc.gridx = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel.add(component, gbc);

        panel.add(Box.createRigidArea(new Dimension(5, 0)));
    }

    private void openRegisterScreen() {
        RegisterView registerView = new RegisterView();
        registerView.setVisible(true);
    }

    private class LoginButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String enteredUsername = username.getText();
            String enteredPassword = new String(password.getPassword());

            if (checkCredentials(enteredUsername, enteredPassword)) {
                JOptionPane.showMessageDialog(AuthenticationView.this, "Login bem-sucedido!");
            } else {
                JOptionPane.showMessageDialog(AuthenticationView.this, "Login falhou. Tente novamente.");
            }
        }
    }

    private boolean checkCredentials(String enteredUsername, String enteredPassword) {
        return false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new AuthenticationView();
        });
    }
}
