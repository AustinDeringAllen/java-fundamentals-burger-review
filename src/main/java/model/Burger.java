package model;

import model.BurgerSale;

import java.io.Serializable;

// MUST implement Serializable in our beans when using MVC
public class Burger implements Serializable {
    // Bean Properties should be private when using MVC structure

    // MUST be able to differentiate each burger from the rest so a unique key is needed
    private long id;

    // properties for bun, pickles, numPatties, Cheese
    private String burgerName;
    private int numBuns; // 3 for big mac, etc
    private int numPickles;
    private int numPatties;
    private boolean cheese; // true or false

    // TODO: Segment the condiments out into their own bean (i.e. public class Ingredient)
    // Private List<Ingredient> ingredients;

    // When using MVC Structure we want to always have a zero-argument constructor
    // The reason we do this is so Java can reserve space in memory for this object.
    public Burger() {}

    // constructor
    public Burger(String burgerName, int numberBuns, int numberPickles, int numberPatties, boolean hasCheese) {
        // set each of the local class properties, to the arguments passed into this constructor
        this.burgerName = burgerName;
        this.numBuns = numberBuns;
        this.numPickles = numberPickles;
        numPatties = numberPatties;
        cheese = hasCheese;
    }

    // public Burger(int numBuns, int numPickles, int numPatties, boolean cheese) {
    //     this.numBuns = numBuns;
    //     this.numPickles = numPickles;
    //     this.numPatties = numPatties;
    //     this.cheese = cheese;
    // }

    // ctrl - enter (to get the menu where you can create getters/setters)


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBurgerName() {
        return burgerName;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }

    public int getNumBuns() {
        return numBuns;
    }

    public void setNumBuns(int numBuns) {
        this.numBuns = numBuns;
    }

    public int getNumPickles() {
        return numPickles;
    }

    public void setNumPickles(int numPickles) {
        this.numPickles = numPickles;
    }

    public int getNumPatties() {
        return numPatties;
    }

    public void setNumPatties(int numPatties) {
        this.numPatties = numPatties;
    }

    public boolean isCheese() {
        return cheese;
    }

    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }
}