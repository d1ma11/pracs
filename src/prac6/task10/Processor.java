package prac6.task10;

public class Processor {
    private final int cores;
    private final int GHz;

    Processor(int cores, int GHz) {
        this.cores = cores;
        this.GHz = GHz;
    }

    public int getCores() {
        return cores;
    }

    public int getGHz() {
        return GHz;
    }
}
