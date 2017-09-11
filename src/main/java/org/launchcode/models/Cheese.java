package org.launchcode.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity // all fields below should be stored in a table that's associated with this class
public class Cheese {

    @Id //creates primary key along with the @GeneratedValue
    @GeneratedValue // creates the value associated with the id above
    private int id;

    @NotNull
    @Size(min= 3, max=15)
    private String name;

    @NotNull
    @Size(min= 1, message = "Description must not be empty")
    private String description;

    private CheeseType type;


    // below is a getter, right click anywhere in java and generate to create methods like getters and setters
    public Cheese(String name, String description) {
        this.name = name; //this.name tells java we mean the field  of the class and not the method input
        this.description = description;
    }

    public Cheese() { }//default/no arg constructor

        public int getId() {
            return id;
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
