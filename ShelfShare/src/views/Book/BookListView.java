package views.Book;

import utils.AuthenticationState;
import models.interfaces.ILivro;
import services.LivroService;

import javax.swing.*;
import java.awt.*;

public class BookListView extends JFrame {

    private JLabel loggedInbookLabel;

    public BookListView() {
        if (!AuthenticationState.isLoggedIn()) {
            JOptionPane.showMessageDialog(this, "Usuário não autenticado. Faça login primeiro.");
            // return;
        }

        initializeUI();
    }

    private void initializeUI() {
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

        JScrollPane scrollPane = new JScrollPane(bookListJList);

        panel.add(scrollPane, BorderLayout.CENTER);

        for (ILivro book : bookListLivro) {
            bookListModel.addElement(book);
        }

        bookListJList.setCellRenderer(new BookListCellRenderer());

        add(panel);
        setVisible(true);
    }

    private static class BookListCellRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(
                JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

            JLabel renderer = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

            renderer.setText("<html><h2>Todos os livros cadastrados do sistema.</h2></html>");

            if (value instanceof ILivro) {
                ILivro book = (ILivro) value;
                String displayText = String.format("<html><b>Livro: %s</b>. Autor: %s. Nota Média: %.2f</html>",
                        book.getTitulo(), book.getAutor(), book.getNotaMedia());
                renderer.setText(displayText);
            }

            return renderer;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BookListView());
    }
}