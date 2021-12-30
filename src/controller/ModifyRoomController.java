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
import model.ModifyRoom;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class ModifyRoomController {
    public AnchorPane modifyRoomContext;
    public TableView tblModify;
    public TableColumn colNo;
    public TableColumn colType;
    public TableColumn colBeds;
    public JFXTextField txtRoomNo;
    public JFXTextField txtRoomType;
    public JFXTextField txtBeds;

    static ArrayList<ModifyRoom> roomList =new ArrayList<>();

    public void initialize(){
        loadModifyRoom();
        colNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        colType.setCellValueFactory(new PropertyValueFactory<>("roomType"));
        colBeds.setCellValueFactory(new PropertyValueFactory<>("typesOfBeds"));

    }

    private void loadModifyRoom() {
        ObservableList<Object> tmObservableList = FXCollections.observableArrayList();
        for (ModifyRoom temp : roomList) {
            //Button btn= new Button("ADD");
            tmObservableList.add(new ModifyRoom(temp.getRoomNo(),temp.getRoomType(),temp.getTypesOfBeds()));
        }
        tblModify.setItems(tmObservableList);
    }


    public void backToRooms(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Rooms.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) modifyRoomContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void modifyRooms(ActionEvent actionEvent) throws IOException {
        ModifyRoom modifyRoom = new ModifyRoom(txtRoomNo.getText(),txtRoomType.getText(),txtBeds.getText());
        if (roomList.add(modifyRoom)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
        URL resource = getClass().getResource("../view/ModifyRoom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) modifyRoomContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
