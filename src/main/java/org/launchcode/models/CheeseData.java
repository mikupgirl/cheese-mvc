package org.launchcode.models;

import java.util.ArrayList;

public class CheeseData {

    static ArrayList<Cheese> cheeses = new ArrayList<>();

    // getAll
    public static ArrayList<Cheese> getAll() {
        return cheeses;
     }
    // add
    public static void add(Cheese newCheese) {
        cheeses.add(newCheese);
    }

    // remove (reminder, use void for when no return statement is used)
    public static void remove(int id) {
        Cheese cheeseToRemove = getById(id);
        cheeses.remove(cheeseToRemove);
    }

    //getById
    public static Cheese getById(int id) {

        Cheese theCheese = null; //initialized to null if no id is given

        for (Cheese candidateCheese : cheeses) {
            if(candidateCheese.getCheeseId() == id ) {
                theCheese = candidateCheese;
            }
        }

        return theCheese;
    }
}
