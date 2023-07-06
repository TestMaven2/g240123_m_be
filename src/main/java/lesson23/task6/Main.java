package lesson23.task6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Honda> hondaCars = List.of(new Honda(), new Honda(), new Honda());
        List<Vehicle> hangar = new ArrayList<>();

        hangar.add(new Honda());

        VehicleUtils.moveVehicles(hondaCars, hangar);

        System.out.println(hangar);
    }
}
