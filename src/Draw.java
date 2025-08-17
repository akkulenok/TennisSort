import java.util.ArrayList;
import java.util.Scanner;

public class Draw {
    private static int countOfGames = 1;

    public static void drawingPairs(ArrayList<Player> players) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        boolean startStopGame = true;

        while (startStopGame) {
            System.out.println(countOfGames++ + " Игра:");

            for (int j = 1; j <= 4; j++) {
                System.out.println(players.get((i + j) % players.size()).getName());
                if (j == 2) System.out.println("ПРОТИВ:");
            }
            i++;

            System.out.println(" \n|-----------------------------------------|\n");
            if (i == players.size()) i = 0;

            System.out.println("Вывести следующую игру? Y/N");
            String resultOfChoice = scanner.nextLine();
            startStopGame = !resultOfChoice.equalsIgnoreCase("n");
        }

        scanner.close();
    }
}
