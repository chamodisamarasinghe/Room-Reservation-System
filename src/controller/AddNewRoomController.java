package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.AddRoom;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class AddNewRoomController {
    public AnchorPane addNewRoom;
    public TableColumn colRoomNo;
    public TableColumn colRoomType;
    public JFXTextField txtRoomNo;
    public JFXTextField txtRoomType;
    public TableView tblRoom;

    static ArrayList<AddRoom> roomList =new ArrayList<>();

    public void initialize(){
        loadAddRoom();
        colRoomNo.setCellValueFactory(new PropertyValueFactory<>("roomNo"));
        colRoomType.setCellValueFactory(new PropertyValueFactory<>("roomType"));


    }

    private void loadAddRoom() {
        ObservableList<Object> tmObservableList = FXCollections.observableArrayList();
        for (AddRoom temp : roomList) {
            //Button btn= new Button("ADD");
            tmObservableList.add(new AddRoom(temp.getRoomNo(),temp.getRoomType()));
        }
      tblRoom.setItems(tmObservableList);
    }


    public void backToRooms(ActionEvent actionEvent) throws IOException {
       /* AddRoom addRoom = new AddRoom(txtRoomNo.getText(),txtRoomType.getText());
        if (roomList.add(addRoom)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }*/
        URL resource = getClass().getResource("../view/Rooms.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) addNewRoom.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void add(ActionEvent actionEvent) throws IOException {
        AddRoom addRoom = new AddRoom(txtRoomNo.getText(),txtRoomType.getText());
        if (roomList.add(addRoom)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
        URL resource = getClass().getResource("../view/AddNewRoom.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) addNewRoom.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    }

