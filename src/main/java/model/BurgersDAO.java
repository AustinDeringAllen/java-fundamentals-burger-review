package model;

import java.util.ArrayList;
import java.util.List;

// This class implements the Burgers interface. It must have all the methods defined in Burgers
public class BurgersDAO implements Burgers {

    // Create a temporary list to hold the Burgers as they're created
    private List<Burger> burgers = new ArrayList<>();

    // This method will search for a burger by its ID and return the full Burger object
    @Override
    public Burger findById(long id) {
        return burgers.get((int) id - 1);
    }

    // This method will create a Burger object in our
    // local repository of burgers and return the newly added Burgers ID
    @Override
    public long createBurger(Burger burger) {
        // The ID for each Burger should be 1-Indexed (Because of mySQL)
        // To get the ID of a newly created burger, we'll get the size of the current list and add 1
        burger.setId(burgers.size() + 1);

        // We need to add the passed in Burger object to our ArrayList
        burgers.add(burger);

        return burger.getId();
    }
}
