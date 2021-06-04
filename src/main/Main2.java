package main;

import animals.Animal2;
import animals.Cat2;
import animals.Dog2;

public class Main2 {

    /**
     * Csinálj egy programot ami számon tartja a ház körüli kutyákat
     *
     *               Object
     *                 |
     *               Animal
     *              |     |
     *             Dog   Cat
     *
     * @param args
     */
    public static void main(String[] args) {
        Dog2 boroka2 = new Dog2("Németjuhász", "Boróka");
        boroka2.setColor("fehér");
        boroka2.setAge(19);
        Dog2 bodri = new Dog2("Keverék", "Bodri");
        bodri.setColor("kék");
        bodri.setAge(38);
        Dog2 bloki = new Dog2("Border", "Blöki");
        bloki.setAge(2);
        bloki.setColor("barna");
        Dog2 szervac = new Dog2("Border", "Szervac", "tricolor", 1);

        Dog2[] myDogs = {boroka2, bodri, boroka2, bodri, boroka2, bodri, bloki, szervac};

        Cat2 cirmi = new Cat2("Cirmi", "fekete", 2, 9);
        Cat2 anhur = new Cat2("Anhur the cat of war", "unknown", 5000, 10000);

        Cat2[] cats = {cirmi, anhur};

        Animal2 kutya = new Dog2("Puli", "Kutya");
        // kutya.getType();    - az Animal ősosztály nem tartalmaz ilyen függvényt
        kutya.sayWhat();    // - az Animal ősosztály tartalmaz ilyen függvényt - Override
        Animal2[] myAnimals = {kutya, cirmi, bloki, boroka2, anhur, bodri};

        System.out.println(bloki.getName() +
                " fajtája " + bloki.getType() +
                ", színe " + bloki.getColor() +
                " és kora " + bloki.getAge());

        System.out.println(cirmi.getName() +
                " színe " + cirmi.getColor() +
                " és kora " + cirmi.getAge() +
                " amiből még " + cirmi.getLivesLeft() + " van meg!");

        bloki.sayWhat();
        cirmi.sayWhat();
        bloki.pet();
        cirmi.pet();

    }
}
