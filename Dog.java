package com.company;

public class Dog {
    String name;
    int numberOfLegs;// można dopisać private przed jeżeli chcemy, żeby liczba nóg się nie zmieniała

    public Dog() {
        this.numberOfLegs = 4;
    }

    public Dog(String name) {
        this();
        this.name = name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void bark() {
        System.out.println("hua hua");
    }
    public static void sayHau();
}
}
}
