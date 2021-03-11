
package sylosbytes.sylosbytte;
/**
 *
 * @author DANIEL BERNARDO ROCHA (DBR79)
 */
import sylosbytes.sylosbytte.modelo.Aluguel;
import sylosbytes.sylosbytte.util.ArquivoAluguel;
import java.io.IOException;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class PagamentoController {
    @FXML
    private TextField inputID;

    @FXML
    private DatePicker dateExit;

    @FXML
    private Label outDays;

    @FXML
    private Label outPrice;
    
    @FXML
    private Label txt;
    
    @FXML
    private void calcular(){
        ArrayList<Aluguel> lista = ArquivoAluguel.listar();
        int id = Integer.parseInt(inputID.getText());
        
        int index = -1;
        
        for(Aluguel a : lista){
            
            if(id == a.getId()){
                index = lista.indexOf(a);
            }
            
        }
        Aluguel a = lista.get(index);
        long dias = DAYS.between(a.getDataInicial(), dateExit.getValue());
        
        double price = dias * 20 * a.getQtd();
        
        String days = Long.toString(dias);
        String priceTotal = Double.toString(price);
        outDays.setText(days);
        outPrice.setText(priceTotal);
    }
    
    
    
    
    @FXML
    private void sair(){
        System.exit(0);
    }
    
    @FXML
    private void voltarMenu() throws IOException{
        App.setRoot("menuPrincipal");
    }
}



/**/
