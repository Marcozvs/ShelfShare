package views.Authentication;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AuthenticationView extends JFrame {

    private JTextField username;
    private JPasswordField password;

    public void AuthenticationView() {
        setTitle("ShelfShare");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Usuário:");
        username = new JTextField(20);
        JLabel passwordLabel = new JLabel("Senha:");
        password = new JPasswordField(20);
        JButton loginButton = new JButton("Login");
        JButton registerButton = new JButton("Registrar");

        panel.add(usernameLabel);
        panel.add(username);
        panel.add(passwordLabel);
        panel.add(password);
        panel.add(new JLabel());
        panel.add(loginButton);
        panel.add(registerButton);

        loginButton.addActionListener(new ActionListener() {
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
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openRegisterScreen();
            }
        });

        add(panel);
        setVisible(true);
    }

    private void openRegisterScreen() {
        RegisterView registerView = new RegisterView();
        registerView.setVisible(true);
    }

    private boolean checkCredentials(String enteredUsername, String enteredPassword) {

        if ("teste".equals(enteredUsername) && "123".equals(enteredPassword)) {
            System.out.println(enteredUsername);
            System.out.println(enteredPassword);
            return true;
        } else {
            System.out.println(enteredUsername);
            System.out.println(enteredPassword);
           return false;
        }
        
        // String jdbcUrl = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
        // String dbUser = "seuUsuario";
        // String dbPassword = "suaSenha";

        // try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword)) {
        //     String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
        //     try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
        //         preparedStatement.setString(1, enteredUsername);
        //         preparedStatement.setString(2, enteredPassword);
        //         try (ResultSet resultSet = preparedStatement.executeQuery()) {
        //             return resultSet.next();
        //         }
        //     }
        // } catch (SQLException e) {
        //     e.printStackTrace();
        //     return false;
        // }
    }
}
