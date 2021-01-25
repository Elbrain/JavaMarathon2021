package day6;

public class Task1 {

    public static void main(String[] args) {
        Car car = new Car();
        car.setYearOfManufacture(2020);
        car.setColour("White");
        car.setModel("BMW");
        Motorbike motorbike = new Motorbike(2010, "Black", "Yamaha");

        car.info();
        motorbike.info();
        System.out.println("Разница в годах с машиной 1990 года:" + car.yearDifference(1990) + " лет");
        System.out.println("Разница в годах с мотоциклом 2021 года:" + motorbike.yearDifference(2021) + " лет");
    }
}

