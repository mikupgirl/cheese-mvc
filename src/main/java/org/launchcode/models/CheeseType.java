package org.launchcode.models;

public enum CheeseType {

    HARD ("Hard"),
    SOFT ("Soft"),
    FAKE ("Fake :P");

    private final String name; //once we initialize the fields (HARD, SOFT, FAKE), we dont want them to be changed, so we use "final" in the method

    CheeseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
