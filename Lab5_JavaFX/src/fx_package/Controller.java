/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fx_package;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextField;

/**
 *
 * @author DELL
 */
public class Controller {
    
    @FXML
    TextField txtName;
    
    @FXML
    TextField txtAge;    
    @FXML
    TextField txtEmail;
    
    public void submit(ActionEvent event){
       
           //   Boolean variable to check for null values
           //   Boolean checkNull = false;
                       
        String name = txtName.getText();
        String age = txtAge.getText();
        String email = txtEmail.getText();
      
//        if(name.isBlank() || age.isBlank() || email.isBlank() ){
//            checkNull = true;
//        } 
        
       
        if(name.isBlank() || age.isBlank() || email.isBlank() ){
                    //Create Pop up alert
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Blank");
            alert.setHeaderText("Blank Entry"); //+ "Age: " + age + "Email: "+email
            alert.setContentText("Null entries are not allowed!"); //
            alert.showAndWait();
        } else{
            System.out.println("Submitted clicked "+ name + " "+ age);

            //Create Pop up alert
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Submitted");
            alert.setHeaderText("Thank you!"); //+ "Age: " + age + "Email: "+email
            alert.setContentText("Submitted details: " + name + "\r\n"+ "Age: "+ age + "\r\n" + "Email: "+ email ); //
            alert.showAndWait();
        }            
    }
}
