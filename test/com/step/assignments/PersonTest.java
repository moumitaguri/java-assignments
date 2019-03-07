package com.step.assignments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFullNameEmpty() {

        Person person1 = new Person();
        person1.setFirstName("");
        person1.setLastName("");
        person1.setAge(10);

        String actual = person1.getFullName();
        String expected = "";

        assertEquals(expected,actual);
    }

    @Test
    void getFirstNameOnlyWhenLastNameEmpty() {
        Person person1 = new Person();
        person1.setFirstName("John");
        person1.setLastName("");
        person1.setAge(18);

        String actual = person1.getFullName();
        String expected = "John";

        assertEquals(expected,actual);
    }

    @Test
    void getLastNameOnlyWhenFirstNameEmpty() {
        Person person1 = new Person();
        person1.setFirstName("");
        person1.setLastName("Smith");
        person1.setAge(18);

        String actual = person1.getFullName();
        String expected = "Smith";

        assertEquals(expected,actual);

    }

    @Test
    void getFullName() {
        Person person1 = new Person();
        person1.setFirstName("John");
        person1.setLastName("Smith");
        person1.setAge(18);

        String actual = person1.getFullName();
        String expected = "John Smith";

        assertEquals(expected,actual);
    }

    @Test
    void isTeenReturnsTrue() {
        Person person = new Person();
        person.setAge(18);

        assertEquals(true,person.isTeen());
    }

    @Test
    void isTeenReturnsFalse() {
        Person person = new Person();
        person.setAge(10);

        assertEquals(false,person.isTeen());

    }
}