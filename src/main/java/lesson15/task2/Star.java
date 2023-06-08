package lesson15.task2;

import java.util.ArrayList;
import java.util.List;

// Класс Star реализует паттерн Singleton, то есть у нас может существовать
// только один-единственный объект этого класса. Что для этого нужно:
// 1. Объявить конструктор приватным
// 2. Написать метод, который либо создаёт объект, если он ещё не был создан,
//    либо возвращает ранее созданный объект.
public class Star {

    private static Star star;

    private List<Planet> planets = new ArrayList<>();
    private List<Asteroid> asteroids = new ArrayList<>();

    private Star() {

    }

    public static Star getInstance() {
        if (star == null) {
            star = new Star();
        }
        return star;
    }

    public List<Planet> getPlanets() {
        return planets;
    }

    public void setPlanets(List<Planet> planets) {
        this.planets = planets;
    }

    public List<Asteroid> getAsteroids() {
        return asteroids;
    }

    public void setAsteroids(List<Asteroid> asteroids) {
        this.asteroids = asteroids;
    }
}