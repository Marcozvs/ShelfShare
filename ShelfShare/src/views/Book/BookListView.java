package views.Book;

import utils.AuthenticationState;
import models.interfaces.ILivro;
import services.LivroService;

import javax.swing.*;
import java.awt.*;

public class BookListView extends JFrame {

    private JLabel loggedInbookLabel;

    public BookListView(ILivro[] bookList) {
        if (!AuthenticationState.isLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Usuário não autenticado. Faça login primeiro.");
            // return;
        }

        initializeUI(bookList);
    }

    private void initializeUI(ILivro[] bookList) {
        setTitle("Lista de Livros");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(240, 240, 240));

        loggedInbookLabel = new JLabel("Usuário logado: " + AuthenticationState.getUsername());
        loggedInbookLabel.setFont(new Font("Arial", Font.BOLD, 16));
        loggedInbookLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.add(loggedInbookLabel, BorderLayout.NORTH);

        DefaultListModel<ILivro> bookListModel = new DefaultListModel<>();

        JList<ILivro> bookListJList = new JList<>(bookListModel);

        LivroService livroService = new LivroService();

        var bookListLivro = livroService.getAllLivrosOrdenados();

        // bookListJList.setModel(bookListModel);

        JScrollPane scrollPane = new JScrollPane(bookListJList);

        panel.add(scrollPane, BorderLayout.CENTER);

        for (ILivro book : bookList) {
            bookListModel.addElement(book);
        }

        bookListJList.setCellRenderer(new bookListCellRenderer());

        add(panel);
        setVisible(true);
    }

    private static class bookListCellRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(
                JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

            JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            if (value instanceof ILivro) {
                ILivro book = (ILivro) value;
                String displayText = String.format("<html><b>%s</b>. Autor: %d.Nota Média: %s</html>", book.getTitulo(),
                        book.getAutor(), book.getNotaMedia());
                renderer.setText(displayText);
            }

            return renderer;
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new BookListView(new ILivro[0]));
    }
}
