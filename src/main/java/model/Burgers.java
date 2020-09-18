package model;

// This interface will define all the methods we need to access the data from our Bean
// This is the interfece the DAO will implement
public interface Burgers {
    // We need a method to find a burger by its ID.
    // We want the return Object to be type Burger
    Burger findById(long id);

    // We need a method to create a new burger and return the ID (long) once its successfuly created.
    long createBurger(Burger burger);

}
