package model;

import java.io.Serializable;

public class Soda implements Serializable {
    private long id;
    private String name;

    public Soda() {}

    public Soda(String name) {
        this.name = name;
    }

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
}
