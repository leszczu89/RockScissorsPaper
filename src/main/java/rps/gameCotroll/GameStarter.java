package rps.gameCotroll;

import java.util.Scanner;

public class GameStarter {

    private int winNumber = 0;
    private int gameVersion = 0;

    public void retrieveInfoToStartGame(String userName) {
        System.out.println("Hello " + userName);
        System.out.println("How many times does the player have to win to end the game?");
        while (winNumber==0) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                winNumber = scanner.nextInt();
            } else {
                System.out.println("You didn't choose a number, start one more time");
            }
        }

        System.out.println("Please choose version of the game.\nFor ROCK-PAPER-SCISSORS enter 1\n" +
                "For ROCK-PAPER-SCISSORS-SPOCK-LIZARD enter 2");
        while (gameVersion==0) {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                if (i == 1 || i == 2) {
                    gameVersion = i;
                } else {
                    System.out.println("You chose a wrong number, enter 1 or 2");
                }
            } else {
                System.out.println("You didn't choose a given number, enter 1 or 2");
            }
        }
        GameController gameController = new GameController();
        gameController.startGame(winNumber, gameVersion, userName);

    }

}
