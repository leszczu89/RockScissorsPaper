package rps.gameCotroll.dto;

public class CounterDto {

    private int userCounter;
    private int compCounter;

    public CounterDto(int userCounter, int compCounter) {
        this.userCounter = userCounter;
        this.compCounter = compCounter;
    }

    public int getUserCounter() {
        return userCounter;
    }

    public int getCompCounter() {
        return compCounter;
    }
}
