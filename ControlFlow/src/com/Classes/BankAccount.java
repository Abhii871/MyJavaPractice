package com.Classes;

public class BankAccount {

    public static void main(String[] args) {
        BankAccount BA =new BankAccount();
        BA.setAccountNumber(1234);
        System.out.println("Account Number: "+ BA.getAccountNumber());
        BA.setBalance(124);
        System.out.println("Account Balance: "+ BA.getBalance());
        BA.setCustomerName("Ranger");
        System.out.println("Account Name: "+ BA.getCustomerName());
        BA.setPhoneNumber(88888);
        System.out.println("Account Phone Number: "+ BA.getPhoneNumber());
        System.out.println("Amount withdrawn= "+ BA.withdrawal(100) );
        System.out.println("Updated account balance is=" +BA.getBalance());
    }
   private double balance;
    private int accountNumber;
    private int phoneNumber;
    private String CustomerName;

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return CustomerName;
    }
    public void deposit(double deposit){
    /*    double deposit=0;*/
        if (deposit >=0){
            balance +=deposit;
        }
        else System.out.println("Enter valid amount to deposit");
    }
    public double withdrawal( double withdrawal){
       /* double withdrawal=0;*/
        if(this.balance < withdrawal){
            System.out.println("Insufficient Amount");
        }
        if (withdrawal >0){
            balance -=withdrawal;
            return withdrawal;
        }
        else return -1;
    }

}
