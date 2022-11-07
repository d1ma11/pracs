package prac6.task10;

public class Monitor {
    private final int Hz;
    private final int diagonal;

    Monitor(int Hz, int diagonal) {
        this.Hz = Hz;
        this.diagonal = diagonal;
    }

    public int getHz() {
        return Hz;
    }
    public int getDiagonal() {
        return diagonal;
    }
}

