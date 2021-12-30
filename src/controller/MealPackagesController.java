package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MealPackagesController {
    public AnchorPane mealPackagesContext;

    public void openAddNewMealPackage(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddNewMealPackage.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealPackagesContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openModifyMealPackages(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ModifyMealPackages.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealPackagesContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openDeleteMealPackages(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DeleteMealPackages.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealPackagesContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backToAdmin(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Admin.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealPackagesContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
