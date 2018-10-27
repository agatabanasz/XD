package com.company;

public class Main {

    public static void main(String[] args) {
        Dog reksio = new Dog("Reksio");
        System.out.println(reksio.numberOfLegs);
        reksio.setNumberOfLegs(3);
        System.out.println(reksio.numberOfLegs);
        reksio.bark();
        Dog.sayHau();

        osoby monia = new osoby("Monika", "Angerhoefer", GenderTypEnumeracyjny.FEMALE);
        System.out.println(monia);

        String a = new String ("Java");
        String b = new String ("Java");
        String c = "Java";
        String d = "Java";

        System.out.println(a == b);
        System.out.println(c == d);

        for(int i = 0; i<100000; i++) {
            System.out.println("a" == "a");
        }
    }
}
