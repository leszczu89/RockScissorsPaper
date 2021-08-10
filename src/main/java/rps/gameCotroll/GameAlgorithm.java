package rps.gameCotroll;

import rps.gameCotroll.dto.ResultDto;
import rps.symbols.SymbolFactory;

public class GameAlgorithm {

    SymbolFactory symbolFactory = new SymbolFactory();
    private final static String SCISSORS = "SCISSORS";
    private final static String PAPER = "PAPER";
    private final static String ROCK = "ROCK";
    private final static String USER = "USER";
    private final static String COMPUTER = "COMPUTER";
    private final static String TIE = "TIE";
    private final static String LIZARD = "LIZARD";
    private final static String SPOCK = "SPOCK";

    public ResultDto startFight(int user, int comp) {
        String userSymbol = symbolFactory.makeSymbol(user).getSymbol();
        String compSymbol = symbolFactory.makeSymbol(comp).getSymbol();
        String winInfo = null;
        if (userSymbol.equals(SCISSORS)&&compSymbol.equals(PAPER)) {
            winInfo = USER;
        } else if (userSymbol.equals(PAPER)&&compSymbol.equals(ROCK)) {
            winInfo = USER;
        } else if (userSymbol.equals(ROCK)&&compSymbol.equals(SCISSORS)) {
            winInfo = USER;
        } else if (userSymbol.equals(ROCK)&&compSymbol.equals(LIZARD)) {
            winInfo = USER;
        } else if (userSymbol.equals(LIZARD)&&compSymbol.equals(SPOCK)) {
            winInfo = USER;
        } else if (userSymbol.equals(SPOCK)&&compSymbol.equals(SCISSORS)) {
            winInfo = USER;
        } else if (userSymbol.equals(SCISSORS)&&compSymbol.equals(LIZARD)) {
            winInfo = USER;
        } else if (userSymbol.equals(LIZARD)&&compSymbol.equals(PAPER)) {
            winInfo = USER;
        } else if (userSymbol.equals(PAPER)&&compSymbol.equals(SPOCK)) {
            winInfo = USER;
        } else if (userSymbol.equals(SPOCK)&&compSymbol.equals(ROCK)) {
            winInfo = USER;
        } else if (userSymbol.equals(compSymbol)) {
            winInfo = TIE;
        } else {
            winInfo = COMPUTER;
        }

        return new ResultDto(userSymbol, compSymbol, winInfo);
    }
}
