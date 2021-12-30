package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class FacilitiesController {
    public AnchorPane facilitiesContext;

    public void backToHome(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ContactForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) facilitiesContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

   /* public void openUser(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/UserForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) facilitiesContext.getScene().getWindow();
        window.setScene(new Scene(load));*/
    }

