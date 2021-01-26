package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) countPlayers++;
    }

    public void run() {
        if (this.stamina > MIN_STAMINA) {
            this.stamina--;
            if (stamina == MIN_STAMINA) {
                System.out.println("Игрок устал и уходит с поля");
                countPlayers--;
            }
        }
    }

    public static void info() {
        if (countPlayers == 5) {
            System.out.printf("Команды неполные. На поле еще есть %d свободное место", 6 - countPlayers);
        } else if (countPlayers < 5 && countPlayers > 1) {
            System.out.printf("Команды неполные. На поле еще есть %d свободных места", 6 - countPlayers);
        } else if (countPlayers == 1) {
            System.out.printf("Команды неполные. На поле еще есть %d свободных мест", 6 - countPlayers);
        } else System.out.println("На поле нет свободных мест");
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
}
