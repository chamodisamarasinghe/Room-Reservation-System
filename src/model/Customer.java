package model;

public class Customer {
    private String name;
    private String NIC;
    private String email;
    private String contactNo;
    private String address;

    public Customer() {
    }

    public Customer(String name, String NIC, String email, String contactNo, String address) {
        this.setName(name);
        this.setNIC(NIC);
        this.setEmail(email);
        this.setContactNo(contactNo);
        this.setAddress(address);


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
}
