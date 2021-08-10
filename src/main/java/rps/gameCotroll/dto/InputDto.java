package rps.gameCotroll.dto;

public class InputDto {

    private int number;
    private boolean gameContinue;
    private boolean newGameRequest;
    private boolean escapeExit;

    public InputDto(int number, boolean gameContinue, boolean newGameRequest, boolean escapeExit) {
        this.number = number;
        this.gameContinue = gameContinue;
        this.newGameRequest = newGameRequest;
        this.escapeExit = escapeExit;
    }

    public int getNumber() {
        return number;
    }

    public boolean isGameContinue() {
        return gameContinue;
    }

    public boolean isNewGameRequest() {
        return newGameRequest;
    }

    public boolean isEscapeExit() {
        return escapeExit;
    }
}
