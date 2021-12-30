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

public class UserFormController {
    public AnchorPane userFormContext;
    public JFXTextField txtUserName;
    public JFXTextField txtUser;
    public JFXTextField txtPassWord;
    public JFXTextField txtPass;

    public void openAdmin(ActionEvent actionEvent) throws IOException {
        if (txtUser.getText().equalsIgnoreCase("ADMIN")&txtPassWord.getText().equalsIgnoreCase("4560")){
            Stage window = (Stage) userFormContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Admin.fxml"))));
        }else {
            Stage window = (Stage) userFormContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomePageForm.fxml"))));
        }


       /* URL resource = getClass().getResource("../view/Admin.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) userFormContext.getScene().getWindow();
        window.setScene(new Scene(load));*/
    }

    public void openReceptionist(ActionEvent actionEvent) throws IOException {
        if (txtUserName.getText().equalsIgnoreCase("RECEPTION")&txtPass.getText().equalsIgnoreCase("1932")){
            Stage window = (Stage) userFormContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/Receptionist.fxml"))));
        }else {
            Stage window = (Stage) userFormContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/HomePageForm.fxml"))));
        }

       /* URL resource = getClass().getResource("../view/Receptionist.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) userFormContext.getScene().getWindow();
        window.setScene(new Scene(load));*/
    }

    public void backToHomePageForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) userFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
