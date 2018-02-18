package com.company;

public class BankAccount {
    private int number;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;


    public void deposit(int fund){
        this.balance +=fund;
    }
    public void widthDraw(int fund){
        if (this.balance>fund) {
            this.balance -= fund;
        } else{

        }
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
