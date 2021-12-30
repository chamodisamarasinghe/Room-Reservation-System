package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HomePageFormController {
   // public AnchorPane homePageContext;
    public AnchorPane homePageFormContext;

    public void openContactForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ContactForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openSignForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/SignForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openFacilities(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Facilities.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openUserForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/UserForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageFormContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
