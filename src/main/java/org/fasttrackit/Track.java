package org.fasttrackit;

public class Track {


    private String name;
    private double lenght;

    public Track(String name, double lenght) {
        this.name = name;
        this.lenght = lenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
