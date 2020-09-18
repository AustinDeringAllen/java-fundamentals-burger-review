package model;

public interface Ingredients {
    // want a method to find ingredient by id
    Ingredient findById(long id);

    // method to add ingredient to our list
    long createIngredient(Ingredient ingredient);
}
