package rps.gameCotroll;

import rps.gameCotroll.dto.InputDto;

import java.util.Scanner;

public class InputVerifier {

    private int user;
    private boolean gameContinue;
    private boolean newGameRequest = false;
    private boolean escapeExit = false;

    public InputDto verifyInput(Scanner scanner, int gameVersion) {

        if (scanner.hasNextInt()) {
            user = scanner.nextInt();
            if (gameVersion==1&&user>3){
                System.out.println("Please enter one of the given signs");
                escapeExit = true;
            }
            gameContinue = true;
        } else if (scanner.hasNextLine()){
            if (scanner.nextLine().equals("x")){
                System.out.println("Are you sure you want to quit? Please enter:\n"+
                        "1 for Yes\n2 for no");
                gameContinue = scanner.nextInt() != 1;
                escapeExit = scanner.nextInt() != 1;
            } else if (scanner.nextLine().equals("n")) {
                System.out.println("Are you sure you want to start a new game? Please enter:\n" +
                        "1 for Yes\n2 for no");
                if (scanner.nextInt() == 1) {
                    gameContinue = true;
                    newGameRequest = true;
                } else {
                    gameContinue = true;
                    escapeExit = true;
                }
            }
        } else {
            System.out.println("Please enter one of the given signs");
            gameContinue = true;
        }

        return new InputDto(user, gameContinue, newGameRequest, escapeExit);
    }
}
