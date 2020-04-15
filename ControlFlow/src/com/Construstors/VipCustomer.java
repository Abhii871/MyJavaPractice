package com.Construstors;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public static void main(String[] args) {
        VipCustomer Person1= new VipCustomer();
        System.out.println(Person1.getName());
        VipCustomer Person2= new VipCustomer("Bob", 25000);
        System.out.println(Person2.getName());
        VipCustomer Person3= new VipCustomer("Abhi",290, "abhii871@gmail.com");
        System.out.println(Person3.getName());
    }

    public VipCustomer() {

        this("Abhishek", 123, "Abhii871");
    }

    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "abhii871@mailcom");
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
