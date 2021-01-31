package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            bands.add(new MusicBand("Band N"+i, 1990  + rnd.nextInt(31)));
        }
        Collections.shuffle(bands);
        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsNewest = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() > 2000) bandsNewest.add(band);
        }
        return bandsNewest;
    }
}
/*
        Создать статический метод в классе Task3: public static List<MusicBand> groupsAfter2000(List<MusicBand> bands)
        Этот метод принимает список групп в качестве аргумента и возвращает новый список, состоящий из групп,
        основанных после 2000 года. Вызвать метод groupsAfter2000(List<MusicBand> bands) в методе main() на вашем списке из 10 групп.
        Вывести в консоль оба списка (оригинальный и с группами, основанными после 2000 года).
*/
