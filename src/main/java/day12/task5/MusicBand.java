package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        band1.members.addAll(band2.members);
        band2.members.clear();
    }

    public void printMembers() {
        System.out.println("Members of band: " + name + "(" + members.size() + ")");
        for (MusicArtist member : members) {
            System.out.println(member);
        }
        System.out.println();
    }

    public List<MusicArtist> getMembers() {
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
