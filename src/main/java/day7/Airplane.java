package day7;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel;

    public Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.printf("Изготовитель: %s, год выпуска: %d , длина: %.2f, вес: %.2f, количество топлива в баке: %d",
                this.producer, this.year, this.length, this.weight, this.fuel);
    }

    public static void compareAirplanes(Airplane airplaneOne, Airplane airplaneTwo) {
        if (airplaneOne.length > airplaneTwo.length) {
            System.out.println("Первый самолет длиннее");
        } else if (airplaneOne.length < airplaneTwo.length) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Длины самолетов равны");
        }
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }
}
