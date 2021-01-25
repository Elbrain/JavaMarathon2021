package day6;

public class Motorbike {
    private int yearOfManufacture;
    private String colour;
    private String model;

    public Motorbike(int yearOfManufacture, String colour, String model) {
        this.yearOfManufacture = yearOfManufacture;
        this.colour = colour;
        this.model = model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        if (this.yearOfManufacture > inputYear) return this.yearOfManufacture - inputYear;
        else return inputYear - this.yearOfManufacture;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }
}
