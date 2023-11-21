// import javafx.application.Application;
// import javafx.geometry.Rectangle2D;
// import javafx.scene.Scene;
// import javafx.scene.control.*;
// import javafx.scene.layout.*;
// import javafx.stage.Screen;
// import javafx.stage.Stage;

// public class CadastroUsuarios extends Application {
//     private TextField nomeField, idadeField, livro1Field, livro2Field;
//     private RadioButton masculinoRadioButton, femininoRadioButton;
//     private Button cadastrarButton, salvarButton;

//     public static void main(String[] args) {
//         launch(args);
//     }

//     @Override
//     public void start(Stage stage) {
//         // Configuração da janela
//         stage.setTitle("Cadastro de Usuários");

//         // Obtém as dimensões da tela principal
//         Screen screen = Screen.getPrimary();
//         Rectangle2D bounds = screen.getVisualBounds();

//         // Configura a cena com as dimensões da tela
//         Scene scene = new Scene(createContent(), bounds.getWidth(), bounds.getHeight());
//         stage.setScene(scene);

//         stage.show();
//     }

//     private VBox createContent() {
//         Label nomeLabel = new Label("Nome:");
//         nomeField = new TextField();

//         Label sexoLabel = new Label("Sexo:");
//         masculinoRadioButton = new RadioButton("Masculino");
//         femininoRadioButton = new RadioButton("Feminino");
//         ToggleGroup sexoToggleGroup = new ToggleGroup();
//         masculinoRadioButton.setToggleGroup(sexoToggleGroup);
//         femininoRadioButton.setToggleGroup(sexoToggleGroup);

//         Label idadeLabel = new Label("Idade:");
//         idadeField = new TextField();

//         Label livro1Label = new Label("Livro Favorito 1:");
//         livro1Field = new TextField();

//         Label livro2Label = new Label("Livro Favorito 2:");
//         livro2Field = new TextField();

//         cadastrarButton = new Button("Cadastrar");
//         cadastrarButton.setOnAction(e -> cadastrarUsuario());

//         salvarButton = new Button("Salvar");
//         salvarButton.setDisable(true);
//         salvarButton.setOnAction(e -> salvarUsuario());

//         VBox layout = new VBox(10);
//         layout.getChildren().addAll(
//                 nomeLabel, nomeField,
//                 sexoLabel, masculinoRadioButton, femininoRadioButton,
//                 idadeLabel, idadeField,
//                 livro1Label, livro1Field,
//                 livro2Label, livro2Field,
//                 cadastrarButton,
//                 salvarButton
//         );

//         return layout;
//     }

//     private void cadastrarUsuario() {
//         // Implementação do cadastro de usuário
//         // ...
//         salvarButton.setDisable(false); // Habilita o botão "Salvar" após o cadastro
//     }

//     private void salvarUsuario() {
//         // Implementação do salvamento de usuário
//         // ...
//         salvarButton.setDisable(true); // Desabilita o botão "Salvar" após salvar o usuário
//     }
// }
