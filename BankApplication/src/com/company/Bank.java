package com.company;

import java.util.ArrayList;

public class Bank {
 private String name;
 private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches=new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
      if (findBranch(branchName)==null){
          this.branches.add(new Branch(branchName));
          return true;
      }
      return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialDeposite){
        if(findBranch(branchName)!=null){
            return findBranch(branchName).newCustomer(customerName, initialDeposite);

        }
        return false;
    }

    private Branch findBranch(String branchName){
        for (int i=0; i<this.branches.size(); i++){
            if (branchName==this.branches.get(i).getName()){

                return this.branches.get(i);
            }
        }
        return null;
    }

    public boolean addCustomerTransition(String branchName, String customerName, double transition){
        if(findBranch(branchName)!=null){
            return findBranch(branchName).addCustomerTransition(customerName, transition);
        }
        return false;
    }


    public boolean listCustomers(String branchName, boolean theTransitions) {
        if (findBranch(branchName) != null) {
            System.out.println("Customers of the Branch" + findBranch(branchName).getName());

            ArrayList<Customer> branchCustomers = findBranch(branchName).getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                System.out.println("Customer " + branchCustomers.get(i).getName() + " " + "i");
                if (theTransitions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomers.get(i).getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println((j + 1) + " Amount" + transactions.get(j));
                    }

                }

            }
            return true;
        } else {
            return false;
        }
    }
}

class Branch{
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers=new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    private Customer findCustomer(String theName){
        for (int i=0; i<this.customers.size(); i++){
            if (this.customers.get(i).getName()==theName){
                return this.customers.get(i);
            }
        }
        return null;
    }

    public boolean newCustomer(String theName, double initialDeposite){
        if (findCustomer(theName)==null){
            this.customers.add(new Customer(theName, initialDeposite))
            return true;
        }
        return false;
    }

    public boolean addCustomerTransition(String customerName, double deposite){
        if (findCustomer(customerName)!=null){
            findCustomer(customerName).addTransition(deposite);
            return true;

        }else{
            return false;
        }
    }
}


class Customer{
    private String name;
    private ArrayList<Double> transactions =new ArrayList<Double>();

    public Customer(String name, double initialDeposit) {
        this.name = name;
        addTransition(initialDeposit);

    }



    public void addTransition(double deposit){
        this.transactions.add(Double.valueOf(deposit));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
