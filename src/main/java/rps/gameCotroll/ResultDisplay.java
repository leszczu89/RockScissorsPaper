package rps.gameCotroll;

import rps.gameCotroll.dto.CounterDto;
import rps.gameCotroll.dto.ResultDto;

public class ResultDisplay {

    public CounterDto displayResult(ResultDto resultDto, int userCounter, int compCounter) {

        System.out.println("Result of this fight:\n You chose: " + resultDto.getUserChoice() +
                "\n Computer chose: " + resultDto.getCompChoice() +
                "\n Who win: " + resultDto.getWinInfo());

        if (resultDto.getWinInfo().equals("USER")){
            userCounter++;
        } else if (resultDto.getWinInfo().equals("COMPUTER")) {
            compCounter++;
        }
        System.out.println("Your result: "+userCounter+ "\nComputer result: "+ compCounter);
        return new CounterDto(userCounter, compCounter);
    }
}
