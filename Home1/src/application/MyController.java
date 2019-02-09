package application;
 
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
 
public class MyController implements Initializable {
 
	@FXML
	private TextField myTextField1;
	
	@FXML
	private TextField myTextField2;
	
	@FXML
	private TextField myTextField3;
	
	
	
	@FXML
	private Text resa;
	
	@FXML
	private Text resb;
	
	@FXML
	private Text no;
	
	
	
	
   @Override
   public void initialize(URL location, ResourceBundle resources) {
 
       // TODO (don't really need to do anything here).
      
   }
 
   // When user click on myButton
   // this method will be called.
   public void showtheansewer(ActionEvent event) {
    
        
        
        int a = Integer.valueOf(myTextField1.getText());
        int b = Integer.valueOf(myTextField2.getText());
        int c = Integer.valueOf(myTextField3.getText());
        
        double x1=0;
        double x2=0;
        
        
       
        if ((b*b)-(4*a*c) > 0) {
        	
            x1=(-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
            x2=(-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
            System.out.print(x1);
            System.out.println(x2);
            resa.setText(String.valueOf(x1));
            resb.setText(String.valueOf(x2));
            no.setText("");
        }
        
        if ((b*b)-(4*a*c) == 0) {
            x1=(-b)/(2*a);
            x2=(-b)/(2*a);
            resa.setText(String.valueOf(x1));
            resb.setText(String.valueOf(x2));
            no.setText("");
        }
        if ((b*b)-(4*a*c) < 0) {
        	resa.setText(" ");
            resb.setText(" ");
            no.setText("No resaults");
        }
        
        
            
        }
      
   }
  

 
 