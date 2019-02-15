package application;
 
import java.net.URL;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Date;
import java.util.ResourceBundle;
 
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
//import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
 
public class MyController implements Initializable {
 
    @FXML
    private TextField myTextField1;    
    
    @FXML
    private Text ans;
    
   @Override
   public void initialize(URL location, ResourceBundle resources) {
 
       // TODO (don't really need to do anything here).
      
   }
 
   // When user click on myButton
   // this method will be called.
   
  // public void showtheansewer(ActionEvent event) {
	   
  //      int a = Integer.valueOf(myTextField1.getText());    
        
   //     ans.setText(String.valueOf(Integer.toHexString(a)));
           
//		ans.setText(String.valueOf(Integer.toOctalString(a)));
 //   	}
   
   
   public void system16(ActionEvent event) {
	   
       int a = Integer.valueOf(myTextField1.getText());    
       
       ans.setText(String.valueOf(Integer.toHexString(a)));
          
	   	}
   
  public void system8(ActionEvent event) {
	   
       int b = Integer.valueOf(myTextField1.getText());    
       
       ans.setText(String.valueOf(Integer.toOctalString(b)));
          
	   	}   
   
   
  
}