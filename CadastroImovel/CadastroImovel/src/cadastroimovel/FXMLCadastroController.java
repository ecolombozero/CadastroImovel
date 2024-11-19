package cadastroimovel;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLCadastroController implements Initializable {

    @FXML
    private Button btnAdicionar;
    @FXML
    private Button btnSalvar;
    @FXML
    private Button btnCancelar;
    @FXML
    private Button btnExcluir;
    @FXML
    private Button btnLimpar;  
    @FXML
    private Button btnVender;
    

    @FXML
    private TextField textField_id;  
    @FXML
    private TextField textField_Proprietario;  
    @FXML
    private TextField textField_Endereco; 
    @FXML
    private TextField textField_Numero;
    @FXML
    private TextField textField_Complemento;
    @FXML
    private TextField textField_Cidade;
    @FXML
    private TextField textField_UF;
    @FXML
    private TextField textField_CEP;
    
    private Stage stage;
    private String estadoFormulario = "inicial";

    @FXML
    public void initialize() {
           
    }

    @FXML
    private void handleAdicionar() {
        estadoFormulario = "editando";
        atualizarBotoes();
        // Lógica para preparar o formulário para adição
    }
    
    @FXML
    private void handleVender() throws IOException {
        stage = new Stage();
       Parent root = FXMLLoader.load(getClass().getResource("/cadastroimovel/FXMLVenda.fxml"));  
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleSalvar() {
        // Lógica para salvar os dados
        estadoFormulario = "adicionado";
        atualizarBotoes();
    }

    @FXML
    private void handleCancelar() {
        estadoFormulario = "inicial";
        atualizarBotoes();
        // Lógica para reverter alterações, se necessário
    }

    @FXML
    private void handleExcluir() {
        estadoFormulario = "excluindo";
        atualizarBotoes();
        // Lógica para excluir dados
    }

    @FXML
    private void clearFields() {
       
        textField_Proprietario.clear();
        textField_id.clear();
        textField_Endereco.clear();
        textField_Numero.clear();
        textField_Complemento.clear();
        textField_Cidade.clear();
        textField_UF.clear();
        textField_CEP.clear();
        
        
    }
    private void DesabilitarCampos(boolean flag) {
       
        textField_Proprietario.setDisable(flag);
        textField_id.setDisable(flag);
        textField_Endereco.setDisable(flag);
        textField_Numero.setDisable(flag);
        textField_Complemento.setDisable(flag);
        textField_Cidade.setDisable(flag);
        textField_UF.setDisable(flag);
        textField_CEP.setDisable(flag);
        
        
    }
    
    private void atualizarBotoes() {
        switch (estadoFormulario) {
            case "inicial":
                btnAdicionar.setDisable(false);
                btnSalvar.setDisable(true);
                btnCancelar.setDisable(true);
                btnExcluir.setDisable(false);
                DesabilitarCampos(false);
                break;
            case "editando":
                btnAdicionar.setDisable(true);
                btnSalvar.setDisable(false);
                btnCancelar.setDisable(false);
                btnExcluir.setDisable(true);
                DesabilitarCampos(false);
                break;
            case "adicionado":
                btnAdicionar.setDisable(false);
                btnSalvar.setDisable(true);
                btnCancelar.setDisable(true);
                btnExcluir.setDisable(false);
                DesabilitarCampos(true);
                break;
            case "excluindo":
                btnAdicionar.setDisable(true);
                btnSalvar.setDisable(true);
                btnCancelar.setDisable(false);
                btnExcluir.setDisable(true);
                DesabilitarCampos(true);
                break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         btnAdicionar.setDisable(false);
            btnSalvar.setDisable(true);
            btnCancelar.setDisable(true);
            btnExcluir.setDisable(true);
            DesabilitarCampos(true);
    }
}
