package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band1.members.addAll(band2.members);
        band2.members.clear();
    }

    public void printMembers() {
        for (String member : members) {
            System.out.println(member);
        }
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Name:" + name +
                ", Year: " + year +
                ", Members: " + members ;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}
