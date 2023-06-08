package lesson15.task2;

import java.util.ArrayList;
import java.util.List;

public class StarSystem {

    public static void main(String[] args) {

        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet());
        planets.add(new Planet());
        planets.add(new Planet());
        planets.add(new Planet());
        planets.add(new Planet());

        List<Satellite> satellites = new ArrayList<>();
        satellites.add(new Satellite());
        satellites.add(new Satellite());
        satellites.add(new Satellite());

        List<Asteroid> asteroids = new ArrayList<>();
        asteroids.add(new Asteroid());
        asteroids.add(new Asteroid());
        asteroids.add(new Asteroid());
        asteroids.add(new Asteroid());

        Planet planet = new Planet(satellites);
        planets.add(planet);

        // Необходимо запретить создание двух звёзд в звёздной системе
//        Star star1 = new Star();
//        Star star2 = new Star();

        Star star1 = Star.getInstance();
        Star star2 = Star.getInstance();

        star1.setPlanets(planets);
        star2.setAsteroids(asteroids);

        System.out.println(star1 == star2);
    }
}
