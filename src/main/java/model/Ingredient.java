package model;

import java.io.Serializable;

// We want this class to represent a burger ingredient
public class Ingredient implements Serializable {
    // TODO: Create all properties, with correct access type (public/protected/private)
    private long id;
    private String name;
    private int quantity;

    // TODO: Create a zero argument constructor
    public Ingredient() {}

    // TODO: Create a constructor with all properties except id
    public Ingredient(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // TODO: Create all Getters & Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
