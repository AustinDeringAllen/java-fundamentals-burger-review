package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDAO implements Ingredients {

    private List<Ingredient> ingredients = new ArrayList<>();


    @Override
    public Ingredient findById(long id) {
        return ingredients.get((int) id -1 );
    }

    @Override
    public long createIngredient(Ingredient ingredient) {
        ingredient.setId(ingredients.size() + 1);

        ingredients.add(ingredient);

        return ingredient.getId();
    }
}
