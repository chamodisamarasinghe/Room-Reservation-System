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
import model.AddMeal;
import model.AddRoom;
import model.ModifyMeal;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class ModifyMealPackagesController {
    public AnchorPane modifyMealPackagesContext;
    public TableView tblModifyMeals;
    public TableColumn colLocal;
    public TableColumn colChinese;
    public TableColumn colFrench;
    public JFXTextField txtLocal;
    public JFXTextField txtChinese;
    public JFXTextField txtFrench;


    static ArrayList<ModifyMeal> mealList =new ArrayList<>();

    public void initialize(){
        loadModifyMeal();
        colLocal.setCellValueFactory(new PropertyValueFactory<>("local"));
        colChinese.setCellValueFactory(new PropertyValueFactory<>("chinese"));
        colFrench.setCellValueFactory(new PropertyValueFactory<>("french"));

    }

    private void loadModifyMeal() {
        ObservableList<Object> tmObservableList = FXCollections.observableArrayList();
        for (ModifyMeal temp : mealList) {
            //Button btn= new Button("ADD");
            tmObservableList.add(new ModifyMeal(temp.getLocal(),temp.getChinese(),temp.getFrench()));
        }
        tblModifyMeals.setItems(tmObservableList);
    }




    public void backToMealPackages(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPackages.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) modifyMealPackagesContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void modify(ActionEvent actionEvent) throws IOException {
        ModifyMeal modifyMeal = new ModifyMeal(txtLocal.getText(),txtChinese.getText(),txtFrench.getText());
        if (mealList.add(modifyMeal)) {
            new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
        } else {
            new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
        }
        URL resource = getClass().getResource("../view/ModifyMealPackages.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) modifyMealPackagesContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
