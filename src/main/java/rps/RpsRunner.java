package rps;

import rps.gameCotroll.GameStarter;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        System.out.println("Welcome to the game : ROCK PAPER SCISSORS");
        System.out.println("Please enter your name");
        String userName;
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        GameStarter gameStarter = new GameStarter();
        gameStarter.retrieveInfoToStartGame(userName);

    }
}
