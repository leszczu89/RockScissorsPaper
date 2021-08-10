package rps.gameCotroll.dto;

public class ResultDto {

    private final String userChoice;
    private final String compChoice;
    private final String winInfo;

    public ResultDto(final String userChoice, final String compChoice, final String winInfo) {
        this.userChoice = userChoice;
        this.compChoice = compChoice;
        this.winInfo = winInfo;
    }

    public String getUserChoice() {
        return userChoice;
    }

    public String getCompChoice() {
        return compChoice;
    }

    public String getWinInfo() {
        return winInfo;
    }
}
