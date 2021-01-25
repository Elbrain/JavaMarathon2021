package day6;

public class Car {
    private int yearOfManufacture;
    private String colour;
    private String model;


    public void info(){
        System.out.println("Это автомобиль");
    }

    public int yearDifference (int inputYear){
        if (this.yearOfManufacture > inputYear)  return this.yearOfManufacture - inputYear;
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

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
