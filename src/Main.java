import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        System.out.println("Введите имена, а затем напишите слово stop: ");
        Scanner scanner = new Scanner(System.in);
        int ID = 0;

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            } else {
                ID++;
                players.add(new Player(input, ID));
            }
        }

        System.out.println(" \n|-----------------------------------------|\n");

        Draw.drawingPairs(players);
    }
}