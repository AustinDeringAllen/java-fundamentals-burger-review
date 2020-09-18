package model;

import java.util.ArrayList;
import java.util.List;

public class SodasDAO implements Sodas {
    List<Soda> sodas = new ArrayList<>();

    @Override
    public Soda findById(long id) {
        return sodas.get((int) id - 1);
    }

    @Override
    public long createIngredient(Soda soda) {
        soda.setId(sodas.size() + 1);

        sodas.add(soda);

        return soda.getId();
    }
}
