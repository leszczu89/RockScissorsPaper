package rps.symbols;

public final class SymbolFactory {

    public final Symbol makeSymbol(int symbolNumber) {

        switch (symbolNumber){
            case 1:
                return new Rock();
            case 2:
                return new Paper();
            case 3:
                return new Scissors();
            case 4:
                return new Spock();
            case 5:
                return new Lizard();
            default:
                System.out.println("You chose wrong number");
                return null;
        }
    }
}
