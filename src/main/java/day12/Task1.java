package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> vehicles = new ArrayList<>();
        vehicles.add("bmw");
        vehicles.add("audi");
        vehicles.add("subaru");
        vehicles.add("opel");
        vehicles.add("lada");
        System.out.println(vehicles);
        vehicles.add(2, "ferrari");
        vehicles.remove(0);
        System.out.println(vehicles);
    }
}
/*
1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль.
        Добавить в середину еще 1 автомобиль, удалить самый первый автомобиль из списка. Вывести список в консоль.
*/
