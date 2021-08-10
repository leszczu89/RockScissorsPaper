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
            FileReader.readFile("instructions/rps.txt");
        }else {
            FileReader.readFile("instructions/rpssl.txt");
        }
        while (userCounter!=winNumber||computerCounter!=winNumber) {
            System.out.println("Enter the number");
            Scanner scanner = new Scanner(System.in);
            InputVerifier inputVerifier = new InputVerifier();
            InputDto inputDto = inputVerifier.verifyInput(scanner, gameVersion);
            if (inputDto.isEscapeExit()){
                continue;
            }
            if (inputDto.isGameContinue()) {
                int user = inputDto.getNumber();
                Random random = new Random();
                ResultDto resultDto;
                int comp;
                if (gameVersion == 1) {
                    comp = random.nextInt(3) + 1;
                } else {
                    comp = random.nextInt(5)+1;
                }
                resultDto = new GameAlgorithm().startFight(user, comp);
                ResultDisplay resultDisplay = new ResultDisplay();
                CounterDto counterDto = resultDisplay.displayResult(resultDto, userCounter, computerCounter);
                userCounter = counterDto.getUserCounter();
                computerCounter = counterDto.getCompCounter();
            } else if (inputDto.isNewGameRequest()) {
                GameStarter gameStarter = new GameStarter();
                gameStarter.startGame(userName);
            } else if (!inputDto.isGameContinue()) {
                break;
            }

        }
        System.out.println("End of the game");

    }
}
