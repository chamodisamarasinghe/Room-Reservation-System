package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AdminController {
    public AnchorPane adminContext;

    public void openRooms(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Rooms.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openMealPackages(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPackages.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openIncomeReports(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/IncomeReports.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }



    public void backToUserForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/UserForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) adminContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
