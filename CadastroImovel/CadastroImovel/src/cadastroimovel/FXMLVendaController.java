package cadastroimovel;



import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dougl
 */
public class FXMLVendaController implements Initializable {

    @FXML
    private Button btnCalcular;
    @FXML
    private Button btnVoltar;
    @FXML
    private Button btnLimpar;
    @FXML 
    private Button btnFinalizar;
    
 
    
    @FXML
    private TextField textField_Valor;
    @FXML
    private TextField textField_id;
    @FXML 
    private TextField textField_Indice;
    @FXML
    private TextField textField_ValorFinal;
    
    
    
    private String estadoFormulario = "inicial";
    
    @FXML
    public void initialize() {
        atualizarBotoes();
    }
    
    @FXML
    private void handleCalcular() {
        estadoFormulario = "calculando";
        atualizarBotoes();
    }
 
    @FXML
    private void handleVoltar() {
        estadoFormulario = "retornando";
        atualizarBotoes();
    }

    private void atualizarBotoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @FXML
    private void clearFields() {
       
        textField_Valor.clear();
        textField_id.clear();
        textField_Indice.clear();
        textField_ValorFinal.clear();

    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

   
        


    
        

}


        

        
        
        
        
        
    
        
    
        
        
        
    
            
    
    
    
    
    
    
    
