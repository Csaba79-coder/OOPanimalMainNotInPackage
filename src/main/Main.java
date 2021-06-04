package main;

import animals.Cat;
import animals.Dog;

public class Main {

    /**
     * Csinálj egy programot ami számon tartja a ház körüli kutyákat
     * @param args
     */
    public static void main(String[] args) {
        Dog boroka = new Dog("Németjuhász", "Boróka");
        boroka.setColor("fehér");
        boroka.setAge(19);
        Dog bodri = new Dog("Keverék", "Bodri");
        bodri.setColor("kék");
        bodri.setAge(38);
        Dog bloki = new Dog("Border", "Blöki");
        bloki.setAge(2);
        bloki.setColor("barna");
        Dog szervac = new Dog("Border", "Szervac", "tricolor", 1);

        Dog[] myDogs = {boroka, bodri, boroka, bodri, boroka, bodri, bloki, szervac};

        Cat cirmi = new Cat("Cirmi", "fekete", 2, 9);
        Cat anhur = new Cat("Anhur the cat of war", "unknown", 5000, 10000);

        Cat[] cats = {cirmi, anhur};

        System.out.println(bloki.getName() +
                " fajtája " + bloki.getType() +
                ", színe " + bloki.getColor() +
                " és kora " + bloki.getAge());

        System.out.println(cirmi.getName() +
                " színe " + cirmi.getColor() +
                " és kora " + cirmi.getAge() +
                " amiből még " + cirmi.getLivesLeft() + " van meg!");


    }
}