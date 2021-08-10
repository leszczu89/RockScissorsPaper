package rps.gameCotroll;

import java.util.Scanner;

public class GameStarter {

    private int winNumber;
    private int gameVersion;

    public void startGame (String userName) {
        System.out.println("Hello " + userName);
        System.out.println("How many times does the player have to win to end the game?");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            winNumber = scanner.nextInt();
        }
        System.out.println("Please choose version of the game.\nFor ROCK-PAPER-SCISSORS enter 1\n"+
                "For ROCK-PAPER-SCISSORS enter 2");
        if (scanner.hasNextInt()) {
            gameVersion = scanner.nextInt();
        }
        GameController gameController = new GameController();
        gameController.startGame(winNumber, gameVersion, userName);

    }

}
