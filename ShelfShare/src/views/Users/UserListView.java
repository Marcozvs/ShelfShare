package views.Users;

import utils.AuthenticationState;
import models.interfaces.IUser;

import javax.swing.*;
import java.awt.*;

public class UserListView extends JFrame {

    private JLabel loggedInUserLabel;

    public UserListView(IUser[] userList) {
        if (!AuthenticationState.isLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Usuário não autenticado. Faça login primeiro.");
            return;
        }

        initializeUI(userList);
    }

    private void initializeUI(IUser[] userList) {
        setTitle("Lista de Usuários");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(240, 240, 240));

        loggedInUserLabel = new JLabel("Usuário logado: " + AuthenticationState.getUsername());
        loggedInUserLabel.setFont(new Font("Arial", Font.BOLD, 16));
        loggedInUserLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(loggedInUserLabel, BorderLayout.NORTH);

        DefaultListModel<IUser> userListModel = new DefaultListModel<>();
        JList<IUser> userListJList = new JList<>(userListModel);
        JScrollPane scrollPane = new JScrollPane(userListJList);

        panel.add(scrollPane, BorderLayout.CENTER);

        for (IUser user : userList) {
            userListModel.addElement(user);
        }

        userListJList.setCellRenderer(new UserListCellRenderer());

        add(panel);
        setVisible(true);
    }

    private static class UserListCellRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(
                JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

            JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            if (value instanceof IUser) {
                IUser user = (IUser) value;
                String displayText = String.format("<html><b>%s</b> - %d anos, %s</html>", user.getName(), user.getAge(), user.getGender());
                renderer.setText(displayText);
            }

            return renderer;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UserListView(new IUser[0]));
    }
}
