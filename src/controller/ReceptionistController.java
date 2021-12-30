package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ReceptionistController {
    public AnchorPane receptionistContext;

    public void openAddGuestDetails(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AddGuestDetails.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) receptionistContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openCheckRoomAvailability(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/CheckRoomAvailability.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) receptionistContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openSelectMealPlan(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/SelectMealPlan.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) receptionistContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backToUser(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/UserForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) receptionistContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openMarkRoom(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MarkRoom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) receptionistContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
