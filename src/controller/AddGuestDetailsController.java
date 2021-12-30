package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import com.sun.deploy.net.MessageHeader;
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
import model.Customer;
import view.tm.CustomerTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

public class AddGuestDetailsController {
    public AnchorPane addGuestDetailsContext;
    public JFXTextField txtName;
    public JFXTextField txtNIC;
    public JFXTextField txtEmail;
    public JFXTextField txtContactNo;
    public JFXTextField txtAddress;
    public TableView<CustomerTM> tblCustomer;
    public TableColumn colName;
    public TableColumn colNIC;
    public TableColumn colEmail;
    public TableColumn colContactNo;
    public TableColumn colAddress;
    public TableColumn colDelete;


    static ArrayList<Customer> customerList = new ArrayList<>();
    public JFXTextField txtSearch;
    public JFXButton btnSaveAndUpdate;
    public void SaveAndUpdate(ActionEvent actionEvent)throws IOException {
        if(btnSaveAndUpdate.getText().equalsIgnoreCase("Save And Update")) {
            Customer customer = new Customer(txtName.getText(), txtNIC.getText(), txtEmail.getText(), txtContactNo.getText(), txtAddress.getText());

            txtName.clear();

            if (isExists(customer)) {
                if (customerList.add(customer)) {
                    loadCustomers();
                    new Alert(Alert.AlertType.CONFIRMATION, "Saved..", ButtonType.CLOSE).show();
                } else {
                    new Alert(Alert.AlertType.WARNING, "Try Again..", ButtonType.CLOSE).show();
                }
            }else {
                new Alert(Alert.AlertType.WARNING, "Already Exists..", ButtonType.CLOSE).show();

            }

        }else {

        }


    }



    private void loadCustomers(){
        ObservableList<CustomerTM>tmObservableList= FXCollections.observableArrayList();
        for (Customer temp: customerList) {
            Button btn= new Button("Delete");
            tmObservableList.add(new CustomerTM(temp.getName(), temp.getNIC(), temp.getEmail(), temp.getContactNo(), temp.getAddress(),btn)
            );

            btn.setOnAction((e)-> {

                ButtonType yes= new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no= new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION
                        ,"Are you sure whether you want to delete this Customer?",yes,no);
                alert.setTitle("Confirmation Alert");
                Optional<ButtonType> result = alert.showAndWait();

                if(result.orElse(no)==yes){
                    customerList.remove(temp);
                    loadCustomers();
                }else {

                }
            });

        }


        tblCustomer.setItems(tmObservableList);

    }
    public void initialize(){
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colNIC.setCellValueFactory(new PropertyValueFactory<>("NIC"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colContactNo.setCellValueFactory(new PropertyValueFactory<>("contactNo"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("btn"));

        txtSearch.textProperty().addListener((observable, oldValue, txt) -> {
            for (Customer c:customerList
                 ) {
                if (c.getNIC().contains(txt)
                        ||
                        c.getContactNo().contains(txt)
                        ||
                        c.getName().contains(txt)
                        ||
                        c.getAddress().contains(txt)
                ) {
                }
            }
    });

        tblCustomer.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            try {
                loadCustomerData(newValue);
            } catch (IOException e) {
                e.printStackTrace();
            }

        } );

    }

    private void loadCustomerData(CustomerTM tm) throws IOException {
        txtName.setText(tm.getName());
        txtNIC.setText(tm.getNIC());
        txtEmail.setText(tm.getEmail());
        txtContactNo.setText(tm.getContactNo());
        txtAddress.setText(tm.getAddress());

        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/CustomerDataForm.fxml"));
        Parent parent = loader.load();
        CustomerDataFormController controller = loader.getController();
        controller.setData(tm);
        Scene scene = new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void backToReceptionist(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/Receptionist.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) addGuestDetailsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void addNewCustomer(ActionEvent actionEvent) {


    }
    public boolean isExists(Customer customer){
        for (Customer t:customerList) {
            if(t.getNIC().equalsIgnoreCase(customer.getNIC())){
                return false;
            }
        }
        return true;
    }



    public void moveToNIC(ActionEvent actionEvent) {
        txtNIC.requestFocus();
    }

    public void moveToEmail(ActionEvent actionEvent) {
        txtEmail.requestFocus();
    }

    public void moveToContactNo(ActionEvent actionEvent) {
        txtContactNo.requestFocus();
    }

    public void moveToAddress(ActionEvent actionEvent) {
        txtAddress.requestFocus();
    }
}
