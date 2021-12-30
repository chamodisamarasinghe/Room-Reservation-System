package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class SelectMealPlanController {
    public AnchorPane selectMealPlanContext;

    public void backToReceptionist(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Receptionist.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) selectMealPlanContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
