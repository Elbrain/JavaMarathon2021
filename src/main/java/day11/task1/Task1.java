package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse smallWarehouse = new Warehouse();
        Warehouse bigWarehouse = new Warehouse();

        Worker courier1 = new Courier(smallWarehouse, "Alex");
        Worker picker1 = new Picker(smallWarehouse, "Vova");
        Worker courier2 = new Courier(bigWarehouse, "Petia");
        Worker picker2 = new Picker(bigWarehouse, "Stepa");

        businessProcess(picker1);
        System.out.println(picker1);

        businessProcess(courier1);
        System.out.println(courier1);

        businessProcess(picker1);
        System.out.println(picker1);

        businessProcess(courier2);
        System.out.println(courier2);

        businessProcess(picker2);
        System.out.println(picker2);

        businessProcess(courier1);
        System.out.println(courier1);

    }

    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

}
