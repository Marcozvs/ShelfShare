package views.Authentication;

import javax.swing.*;

import controllers.UserController;
import models.entities.UserModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterView extends JFrame {

    private static final String[] USER_TYPES = {"Comum"};
    private static final String[] BOOKS_GENDER_TYPES = {"Romance", "Técnico", "Drama"};
    private static final String INVALID_AGE_MESSAGE = "Por favor, insira uma idade válida (número inteiro).";
    private static final String PASSWORD_MISMATCH_MESSAGE = "A senha e a confirmação de senha não correspondem.";
    private static final String REGISTRATION_SUCCESS_MESSAGE = "Registro bem-sucedido!";

    private JTextField username;
    private JPasswordField password;
    private JPasswordField confirmPassword;
    private JTextField name;
    private JTextField ageField;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private ButtonGroup genderButtonGroup;
    private JComboBox<String> bookGenderTypeComboBox;
    private JButton registerButton;

    public RegisterView() {
        initializeUI();
        setupEventHandlers();
    }

    private void initializeUI() {
        setTitle("ShelfShare");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        addFormField(panel, "Nome de Usuário:", username = new JTextField(20));
        addFormField(panel, "Seu nome:", name = new JTextField(20));
        addFormField(panel, "Nova Senha:", password = new JPasswordField(20));
        addFormField(panel, "Confirmar Senha:", confirmPassword = new JPasswordField(20));
        addGenderFields(panel);
        addFormField(panel, "Idade:", ageField = new JTextField(5));
        addFormField(panel, "Tipo de livro favorito:", bookGenderTypeComboBox = new JComboBox<>(BOOKS_GENDER_TYPES));

        gbc.gridx = 0;
        gbc.gridy = panel.getComponentCount();
        gbc.gridwidth = 2;
        panel.add(Box.createVerticalStrut(20), gbc);
        gbc.gridy++;
        registerButton = new JButton("Registrar");
        panel.add(registerButton, gbc);

        add(panel);
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

    private void addGenderFields(JPanel panel) {
        maleRadioButton = new JRadioButton("Masculino");
        femaleRadioButton = new JRadioButton("Feminino");
        genderButtonGroup = new ButtonGroup();
        genderButtonGroup.add(maleRadioButton);
        genderButtonGroup.add(femaleRadioButton);

        JPanel genderPanel = new JPanel();
        genderPanel.add(maleRadioButton);
        genderPanel.add(femaleRadioButton);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = panel.getComponentCount();
        gbc.gridwidth = 2;
        panel.add(new JLabel("Sexo:"), gbc);
        gbc.gridy++;
        panel.add(genderPanel, gbc);

        panel.add(Box.createRigidArea(new Dimension(5, 0)));
    }

    private void setupEventHandlers() {
        registerButton.addActionListener(new RegisterButtonHandler());
    }

    private class RegisterButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            processRegistration();
        }
    }

    private void processRegistration() {
        String newUsername = username.getText();
        String newPassword = new String(password.getPassword());
        String confirmedPassword = new String(confirmPassword.getPassword());
        String nameValue = name.getText();
        String selectedBookGenderType = (String) bookGenderTypeComboBox.getSelectedItem();
        int age;

        try {
            age = Integer.parseInt(ageField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, INVALID_AGE_MESSAGE);
            return;
        }

        if (!newPassword.equals(confirmedPassword)) {
            JOptionPane.showMessageDialog(this, PASSWORD_MISMATCH_MESSAGE);
            return;
        }

        String selectedGender = maleRadioButton.isSelected() ? "Masculino" : "Feminino";

        UserModel userModel = new UserModel(nameValue, age, selectedGender, newPassword, newUsername, selectedBookGenderType);

        UserController userController = new UserController();
        boolean registrationSuccess = userController.createUser(userModel);

        if (registrationSuccess) {
            JOptionPane.showMessageDialog(this, REGISTRATION_SUCCESS_MESSAGE);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Falha no registro. Por favor, tente novamente.");
        }

        JOptionPane.showMessageDialog(this, REGISTRATION_SUCCESS_MESSAGE);
        dispose();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RegisterView().setVisible(true);
        });
    }
}
