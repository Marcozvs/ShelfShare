package views.Users;

import models.interfaces.IUser;

import javax.swing.*;
import java.awt.*;

public class UserListView extends JFrame {

    public UserListView(IUser[] userList) {
        initializeUI(userList);
    }

    private void initializeUI(IUser[] userList) {
        setTitle("Lista de Usuários");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());

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

            if (value instanceof IUser) {
                IUser user = (IUser) value;
                String displayText = String.format("%s - %d years old, %s", user.getName(), user.getAge(), user.getGender());
                return super.getListCellRendererComponent(list, displayText, index, isSelected, cellHasFocus);
            }

            return super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        }
    }
}
