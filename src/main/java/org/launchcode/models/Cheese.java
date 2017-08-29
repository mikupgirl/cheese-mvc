package org.launchcode.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cheese {

    @NotNull
    @Size(min= 3, max=15)
    private String name;

    @NotNull
    @Size(min= 1, message = "Description must not be empty")
    private String description;

    private CheeseType type;


    private int cheeseId;
    private static int nextId = 1;

    // below is a getter, right click anywhere in java and generate to create methods like getters and setters
    public Cheese(String name, String description) {
        this(); //calls the default constructor for the given class
        this.name = name; //this.name tells java we mean the field  of the class and not the method input
        this.description = description;
    }

    public Cheese() { //default/no arg constructor
        cheeseId = nextId; //
        nextId++; //increments to the next id
    }

    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public CheeseType getType() {
        return type;
    }

    public void setType(CheeseType type) {
        this.type = type;
    }
}
