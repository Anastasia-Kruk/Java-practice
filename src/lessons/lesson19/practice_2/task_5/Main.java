package lessons.lesson19.practice_2.task_5;

import java.util.*;

public class Main {
    private static final int DISTANCE = 600;
    private static final int numberOfSportsmens = 8;
    private static int placeInRace;

    public static void main(String[] args) {
        Random random = new Random();

        TreeSet<Sportsmen> sportsmens = new TreeSet<>();
        // i = 0 и можно убрать numberOfSportsmens+1
        for (int i = 1; i < numberOfSportsmens + 1; i++) {
            int speed = random.nextInt(30);
            sportsmens.add(new Sportsmen(i, speed));
        }
        System.out.println(sportsmens);

        TreeMap<Medal, Sportsmen> race = new TreeMap<>();
        int counter = 1;

        /* допустим ты выдала медали, зачем тебе бежать по оставшимся спортсменам?
        думаю TreeMap<Medal, Sportsmen> race = new TreeMap<>(); не нужна, а вот засетать медальку спортсмену необходимо
        */
        for (Sportsmen elem : sportsmens) {
            if (counter == 1) {
                race.put(Medal.GOLD, elem);
            }
            if (counter == 2) {
                race.put(Medal.SILVER, elem);
            }
            if (counter == 3) {
                race.put(Medal.BRONZE, elem);
            }
            counter++;
        }
        System.out.println(race);
    }
}
