package com.step.assignments;

public class PersonMain {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setFirstName("");
        person1.setLastName("");
        person1.setAge(-5);

        System.out.println("Full name = " + person1.getFullName());
        System.out.println("Age = " + person1.getAge());
        System.out.println("isTeen = " + person1.isTeen());

        person1.setFirstName("Mouboni");
        person1.setAge(4);

        System.out.println("Full name = " + person1.getFullName());
        System.out.println("Age = " + person1.getAge());
        System.out.println("isTeen = " + person1.isTeen());

        person1.setLastName("Karmakar");

        System.out.println("Full name = " + person1.getFullName());
        System.out.println("Age = " + person1.getAge());

    }
}
