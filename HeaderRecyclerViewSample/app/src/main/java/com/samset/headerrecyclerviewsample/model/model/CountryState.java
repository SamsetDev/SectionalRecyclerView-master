package com.samset.headerrecyclerviewsample.model.model;

public class CountryState {



    private String name;
    private String id;
    private int Type;

    public CountryState(String name, String description, int type) {
        this.name = name;
        this.id = description;
        this.Type = type;
    }
    public CountryState() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return id;
    }

    public void setDescription(String description) {
        this.id = description;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        this.Type = type;
    }
}
