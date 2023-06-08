package lesson15.task2;

import java.util.ArrayList;
import java.util.List;

public class Planet {

    private List<Satellite> satellites = new ArrayList<>();

    public Planet() {
    }

    public Planet(List<Satellite> satellites) {
        this.satellites = satellites;
    }
}