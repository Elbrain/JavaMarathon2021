package day14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();
        try (FileReader reader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                checkAge(line);
                String[] info = line.split(" ");
                people.add(new Person(info[0], Integer.parseInt(info[1])));
            }
        } catch (IOException e) {
            System.err.println("Файл не найден");
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
            people.clear();
        }
        return people;
    }

    public static void checkAge(String str) throws MyException {
        if (str.contains(" -")) {
            throw new MyException("Некорректный входной файл");
        }
    }
}
