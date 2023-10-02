import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginForm extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginForm() {
        // Configurações da janela
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel para organizar os componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Componentes
        JLabel usernameLabel = new JLabel("Usuário:");
        JLabel passwordLabel = new JLabel("Senha:");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        JButton loginButton = new JButton("Login");

        // Adiciona os componentes ao painel
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel()); // Espaço em branco
        panel.add(loginButton);

        // Define a ação do botão de login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                // Verifica as credenciais no banco de dados
                if (checkCredentials(username, password)) {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login bem-sucedido!");
                } else {
                    JOptionPane.showMessageDialog(LoginForm.this, "Login falhou. Tente novamente.");
                }
            }
        });

        // Adiciona o painel à janela
        add(panel);

        // Exibe a janela
        setVisible(true);
    }

    private boolean checkCredentials(String username, String password) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/mydb?useSSL=false";
        String dbUser = "seuUsuario";
        String dbPassword = "suaSenha";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword)) {
            String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm();
            }
        });
    }
}
