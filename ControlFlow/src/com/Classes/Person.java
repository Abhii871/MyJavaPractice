package com.Classes;

public class Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println(person.getAge());
        System.out.println("FullName= " + person.getFullName());
        System.out.println("Teen= " +person.isTeen());
        person.setFirstName("Abhishek");
        person.setLastName("Vidyapogula");
        person.setAge(19);
        System.out.println("FullName= " + person.getFullName());
        System.out.println("Teen= " +person.isTeen());
    }

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
        return false;
    }

    public String getFullName() {
        String fullName;
        if (firstName.isEmpty()) {
            return lastName;
        }
        if (lastName.isEmpty()) {
            return firstName;
        } else if (lastName.isEmpty() && firstName.isEmpty()) {
            return "";
        }
        fullName = firstName + " " + lastName;
        return fullName;
    }

}
