package org.example;

public class Animal {

    int weigth;

    public Animal(int weigth) {
        this.weigth = weigth;
    }

    void showWeight() {
        System.out.println(weigth);
    }


    public static void main(String[] args) {



        Animal cat = new Animal(12);

        Animal dog = new Animal(10);


        System.out.println(cat == dog);

    }

}
