package prac4.Task1;

public enum Seasons {
    WINTER(-7.7),
    SPRING(6.8),
    SUMMER(20.7) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(6.2),
    ;
    private final double avg;

    Seasons(double avg) {
        this.avg = avg;
    }

    public double getAvg() {
        return avg;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
