package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplaneOne = new Airplane("Boeing", 1990, 137.5, 6320.32);
        Airplane airplaneTwo = new Airplane("Cesna", 1995, 237.5, 1320.35);
        Airplane.compareAirplanes(airplaneOne, airplaneTwo);
    }
}