package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.AddRoom;
import model.CheckRoom;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class CheckRoomAvailabilityController {
    public AnchorPane checkRoomAvailabilityContext;
    public TableView tblCheck;
    public TableColumn colRoomType;
    public TableColumn colAvailable;
    public JFXTextField txtRoomType;
    public JFXTextField txtYes;


    static ArrayList<CheckRoom> roomList =new ArrayList<>();

    public void initialize(){
        loadAvailableRoom();
        colRoomType.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colAvailable.setCellValueFactory(new PropertyValueFactory<>("yes"));


    }

    private void loadAvailableRoom() {
        ObservableList<Object> tmObservableList = FXCollections.observableArrayList();
        for (CheckRoom temp : roomList) {
            tmObservableList.add(new CheckRoom(temp.getRoomType(),temp.getYes()));
        }
        tblCheck.setItems(tmObservableList);
    }


    public void backToReceptionist(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Receptionist.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) checkRoomAvailabilityContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void check(ActionEvent actionEvent) throws IOException {
        CheckRoom checkRoom = new CheckRoom(txtRoomType.getText(),txtYes.getText());
        if (roomList.add(checkRoom)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
        URL resource = getClass().getResource("../view/CheckRoomAvailability.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) checkRoomAvailabilityContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
