package model;

public interface Sodas {
    Soda findById(long id);

    long createIngredient(Soda soda);
}
