package rps.gameCotroll.dto;

public class CounterDto {

    private final int userCounter;
    private final int compCounter;

    public CounterDto(final int userCounter, final int compCounter) {
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
