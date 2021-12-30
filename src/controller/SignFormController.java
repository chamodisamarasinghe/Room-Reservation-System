package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class SignFormController {
    public JFXTextField txtUserName;
    public JFXTextField txtPassWord;
    public JFXTextField txtMail;
    public AnchorPane signFormContext;


    public void backToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) signFormContext.getScene().getWindow();
        window.setScene(new Scene(load));

    }

    public void openUserForm(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().equalsIgnoreCase("USER")&txtPassWord.getText().equalsIgnoreCase("1234")&txtMail.getText().equalsIgnoreCase("blueocean@gmail.com")){
            Stage window = (Stage) signFormContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/UserForm.fxml"))));
        }else {
            Stage window = (Stage) signFormContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomePageForm.fxml"))));
        }


        /*URL resource = getClass().getResource("../view/UserForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) signFormContext.getScene().getWindow();
        window.setScene(new Scene(load));*/
    }
}

