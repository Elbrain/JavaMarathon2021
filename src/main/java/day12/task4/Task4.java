package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            bands.add(new MusicBand("Band N" + i, 1990 + rnd.nextInt(31),
                    new ArrayList<>(Arrays.asList("Member of band" + i, "Member of band" + i))));
        }
        MusicBand.transferMembers(bands.get(0), bands.get(3));
        System.out.println(bands.get(0).getMembers());
        System.out.println(bands.get(3).getMembers());
    }
}
