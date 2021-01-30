package day11.task1;

public class Picker implements Worker{
    private int salary;
    private boolean isPayed;
    private String name;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse, String name) {
        this.name = name;
        this.salary = 0;
        this.isPayed = false;
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.pickOrder();

    }

    @Override
    public void bonus() {
        if (warehouse.getCountPickedOrders() >= 10000 && !isPayed){
            salary += 70000;
            isPayed = true;
        } else if (isPayed) System.out.print("Бонус уже был выплачен для " );
        else System.out.println("Бонус пока не доступен");
    }

    @Override
    public String toString() {
        return "Courier "+ name +"{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }


}