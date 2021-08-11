package rps.gameCotroll;

import rps.gameCotroll.dto.InputDto;

import java.util.Scanner;

public class InputVerifier {

    private int user;
    private boolean gameContinue = true;
    private boolean newGameRequest = false;
    private boolean escapeExit = false;

    public InputDto verifyInput(Scanner scanner, int gameVersion) {

        if (scanner.hasNextInt()) {
            user = scanner.nextInt();
            if (gameVersion==1&&user>3||gameVersion==2&&user>5){
                System.out.println("Please enter one of the given signs");
                escapeExit = true;
            }
        } else if (scanner.hasNextLine()){
            String s = scanner.nextLine();
            if (s.equals("x")){
                System.out.println("Are you sure you want to quit? Please enter:\n"+
                        "1 for Yes\n2 for no");
                if (scanner.hasNextInt()) {
                    int i = scanner.nextInt();
                    if (i == 1){
                        gameContinue = false;
                    } else if (i==2){
                        escapeExit = true;
                    } else {
                        System.out.println("You chose wrong number. You will go back to the game");
                        escapeExit = true;
                    }
                } else {
                    System.out.println("You didn't choose one of the given numbers. You will go back to the game");
                    escapeExit = true;
                }
            } else if (s.equals("n")) {
                System.out.println("Are you sure you want to start a new game? Please enter:\n" +
                        "1 for Yes\n2 for no");
                if (scanner.hasNextInt()) {
                    int i = scanner.nextInt();
                    if (i == 1) {
                        newGameRequest = true;
                    } else if (i == 2){
                        escapeExit = true;
                    } else {
                        System.out.println("You chose wrong number. You will go back to the game");
                        escapeExit = true;
                    }
                } else {
                    System.out.println("You didn't choose one of the given numbers. You will go back to the game");
                    escapeExit = true;
                }
            } else {
                System.out.println("You didn't choose one of the given numbers. You will go back to the game");
                escapeExit = true;
            }
        } else {
            System.out.println("Please enter one of the given signs");
        }

        return new InputDto(user, gameContinue, newGameRequest, escapeExit);
    }
}
