package com.step.assignments;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100){
            this.age = 0;
            return;
        }
        this.age = age;
    }

    public String getFullName(){

        if(getFirstName().isEmpty() && getLastName().isEmpty()){
            return "";
        }
        if(getFirstName().isEmpty()){
            return getLastName();
        }
        if (getLastName().isEmpty()){
            return getFirstName();
        }
        return getFirstName() + " " + getLastName();
    }

    public boolean isTeen(){
        return this.age > 12 && this.age < 20;
    }
}


