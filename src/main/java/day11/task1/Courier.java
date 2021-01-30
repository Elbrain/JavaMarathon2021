package day11.task1;

public class Courier implements Worker{
    private int salary;
    private boolean isPayed;
    private String name;
    private Warehouse warehouse;

    public Courier(Warehouse warehouse, String name) {
        this.name = name;
        this.salary =0;
        this.isPayed = false;
        this.warehouse = warehouse;
    }
    @Override
    public void doWork() {
        salary += 100;
        warehouse.deliverOrder();
    }

    @Override
    public void bonus() {
        if (warehouse.getCountDeliveredOrders() >= 10000 && !isPayed){
            salary += 50000;
            isPayed = true;
        } else if (isPayed) System.out.println("Бонус уже был выплачен");
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
