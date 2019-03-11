package com.step.assignments;

public class Contact {

    private String name;
    private long contactNumber;

    public Contact() {
    }

    public Contact(String name, long contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void modifyName(String name){
        setName(name);
    }

    public void modifyNumber(int contactNumber){
        setContactNumber(contactNumber);
    }

    public String printContact(){
        return "Contact name = " + name + "\n" + "Contact number = " + contactNumber;

    }

}
