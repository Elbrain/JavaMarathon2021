package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1990, 137.5, 6320.3);
        airplane.setYear(2005);
        airplane.setLength(145.9);
        airplane.fillUp(50);
        airplane.fillUp(45);
        airplane.info();
    }
}
