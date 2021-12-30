package view.tm;

import javafx.scene.control.Button;

public class CustomerTM {
    private String name;
    private String NIC;
    private String email;
    private String contactNo;
    private String address;
    private Button btn;

    public CustomerTM() {
    }

    public CustomerTM(String name, String NIC, String email, String contactNo, String address, Button btn) {
        this.setName(name);
        this.setNIC(NIC);
        this.setEmail(email);
        this.setContactNo(contactNo);
        this.setAddress(address);
        this.setBtn(btn);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
