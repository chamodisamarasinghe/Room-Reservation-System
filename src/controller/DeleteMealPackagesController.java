package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class DeleteMealPackagesController {
    public AnchorPane deleteMealPackagesContext;

    public void backToMealPackages(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPackages.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) deleteMealPackagesContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
