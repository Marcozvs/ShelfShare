package views.Book;

import javax.swing.*;

import models.entities.LivroModelo;
import models.enums.TipoLivroEnum;
import services.BookService;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroLivrosView extends JFrame {

    private JTextField textFieldTitulo;
    private JTextField textFieldAutor;
    private JTextField textFieldNota;
    private JComboBox<TipoLivroEnum> comboBoxTipo;
    private JButton btnCadastrar;

    public CadastroLivrosView() {
        initialize();
    }

    private void initialize() {
        setTitle("ShelfShare - Cadastro de Livros");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(5, 2, 10, 10));

        JLabel lblTitulo = new JLabel("Título:");
        getContentPane().add(lblTitulo);

        textFieldTitulo = new JTextField();
        getContentPane().add(textFieldTitulo);
        textFieldTitulo.setColumns(10);

        JLabel lblAutor = new JLabel("Autor:");
        getContentPane().add(lblAutor);

        textFieldAutor = new JTextField();
        getContentPane().add(textFieldAutor);
        textFieldAutor.setColumns(10);

        JLabel lblNota = new JLabel("Nota:");
        getContentPane().add(lblNota);

        textFieldNota = new JTextField();
        getContentPane().add(textFieldNota);
        textFieldNota.setColumns(10);

        JLabel lblTipo = new JLabel("Tipo:");
        getContentPane().add(lblTipo);

        comboBoxTipo = new JComboBox<>(TipoLivroEnum.values());
        getContentPane().add(comboBoxTipo);

        btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarLivro();
            }
        });
        getContentPane().add(btnCadastrar);

        setVisible(true);
    }

    private void cadastrarLivro() {
        String titulo = textFieldTitulo.getText();
        String autor = textFieldAutor.getText();
        String notaTexto = textFieldNota.getText();
        TipoLivroEnum tipo = (TipoLivroEnum) comboBoxTipo.getSelectedItem();

        if (titulo.isEmpty() || autor.isEmpty() || notaTexto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.", "Erro de Validação",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            float nota = Float.parseFloat(notaTexto);

            LivroModelo livroModelo = new LivroModelo();
            livroModelo.setAutor(autor);
            livroModelo.setNotaMedia(nota);
            livroModelo.setTitulo(titulo);
            livroModelo.setTipo(tipo);

            BookService livroService = new BookService();
            if (livroService.cadastrarLivro(livroModelo) != null) {

                JOptionPane.showMessageDialog(this, "Livro cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao criar livro!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, insira uma nota válida.", "Erro de Validação",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroLivrosView();
            }
        });
    }
}
