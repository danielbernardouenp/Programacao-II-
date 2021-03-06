
package sylosbytes.sylosbytte;
/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */
import java.io.IOException;
import javafx.fxml.FXML;


public class MenuPrincipalController {
    
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void novoAluguel() throws IOException{
        App.setRoot("novoAluguel");
    }
    
    @FXML
    private void novoProdutor() throws IOException{
        App.setRoot("novoProdutor");
    }
    
    @FXML
    private void pagamento() throws IOException{
        App.setRoot("pagamento");
    }
    
    @FXML
    private void armazenamento() throws IOException{
        App.setRoot("armazenamento");
    }
}





/**/