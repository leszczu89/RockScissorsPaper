package rps.gameCotroll.dto;

public class InputDto {

    private final int number;
    private final boolean gameContinue;
    private final boolean newGameRequest;
    private final boolean escapeExit;

    public InputDto(final int number, final boolean gameContinue, final boolean newGameRequest, final boolean escapeExit) {
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
