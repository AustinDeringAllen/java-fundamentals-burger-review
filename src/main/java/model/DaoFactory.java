package model;

import java.util.Objects;

// This DAO Factory class is used as a window into every Bean type we create
// This class has a 'claw' for each bean type
public class DaoFactory {

    // We don't want ot require accessing the BurgersDAO directly, instead we will reference
    // its interface
    private static Burgers burgersDao;
    private static Ingredients ingredientsDao;
    private static Sodas sodasDao;

    // Any Bean type we have will get a method called get[Bean]Dao();
    public static Burgers getBurgersDao() {
        if(burgersDao == null) {
            burgersDao = new BurgersDAO();
        }

        return burgersDao;
    }

    public static Ingredients getIngredientsDao() {
        if(ingredientsDao == null) {
            ingredientsDao = new IngredientsDAO();
        }

        return ingredientsDao;
    }

    public static Sodas getSodasDao() {
        if(sodasDao == null) {
            sodasDao = new SodasDAO();
        }

        return sodasDao;
    }

}
