import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Draw {
    private static int countOfGames = 1;

    public static void drawingPairs(ArrayList<Player> players) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        boolean startStopGame = true;

        while (startStopGame) {
            System.out.println(countOfGames++ + " Игра:");
            List<Player> inGamePlayers = new ArrayList<>();
            for (int j = 1; j <= 4; j++) inGamePlayers.add(players.get((i + j) % players.size()));
            i++;

            Collections.shuffle(inGamePlayers);
            for (int j = 0; j < inGamePlayers.size(); j++) {
                System.out.println(inGamePlayers.get(j).getName());
                if (j == 1) System.out.println("ПРОТИВ: ");
            }
            System.out.println(" \n|-----------------------------------------|\n");
            if (i == players.size()) i = 0;

            System.out.println("Вывести следующую игру? Y/N");
            String resultOfChoice = scanner.nextLine();
            startStopGame = !resultOfChoice.equalsIgnoreCase("n");
        }

        scanner.close();
    }
}
