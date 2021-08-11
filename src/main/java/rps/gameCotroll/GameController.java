package rps.gameCotroll;


import rps.gameCotroll.dto.CounterDto;
import rps.gameCotroll.dto.InputDto;
import rps.gameCotroll.dto.ResultDto;

import java.util.Random;
import java.util.Scanner;

public class GameController {

    private int userCounter = 0;
    private int computerCounter = 0;

    public void startGame(int winNumber, int gameVersion, String userName) {

        if (gameVersion==1) {
            InstructionDisplay.displayInstruction("instructions/rps.txt");
        }else {
            InstructionDisplay.displayInstruction("instructions/rpssl.txt");
        }
        while (userCounter!=winNumber&&computerCounter!=winNumber) {
            System.out.println("Enter the number");
            Scanner scanner = new Scanner(System.in);
            InputVerifier inputVerifier = new InputVerifier();
            InputDto inputDto = inputVerifier.verifyInput(scanner, gameVersion);
            if (inputDto.isEscapeExit()){
                System.out.println("Back to the game");
            } else if (inputDto.isNewGameRequest()) {
                GameStarter gameStarter = new GameStarter();
                gameStarter.retrieveInfoToStartGame(userName);
            } else if (!inputDto.isGameContinue()){
                break;
            } else if (inputDto.isGameContinue()) {
                int user = inputDto.getNumber();
                Random random = new Random();
                ResultDto resultDto;
                int comp;
                if (gameVersion == 1) {
                    comp = random.nextInt(3) + 1;
                } else {
                    comp = random.nextInt(5)+1;
                }
                resultDto = new WinnerRetrieval().returnWinner(user, comp);
                ResultDisplay resultDisplay = new ResultDisplay();
                CounterDto counterDto = resultDisplay.displayResult(resultDto, userCounter, computerCounter);
                userCounter = counterDto.getUserCounter();
                computerCounter = counterDto.getCompCounter();
            }
        }
        String winner = "There is no winner";
        if(userCounter==winNumber){
            winner = userName;
        } else if (computerCounter==winNumber){
            winner = "Computer";
        }
        System.out.println("End of the game. The winner is: "+ winner);
        System.exit(0);
    }
}
