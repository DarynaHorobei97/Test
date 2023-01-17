package org.example;

public class BankAccount {

    int id;
    String name;
    double balance;

    public BankAccount() {
    }

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public BankAccount(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void showName() {
        System.out.println(name);
    }

    void showName(int balance) {
        System.out.println(name);
    }

    void showName(String name) {
        System.out.println(name);
    }

    int sumOfThreeNumbers(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }


    public static void main(String[] args) {


        BankAccount bk1 = new BankAccount(1, "Ann", 54);
        BankAccount bk2 = new BankAccount(1, "Kate", 54);


        System.out.println(bk1.id == bk2.id);
    }

}
