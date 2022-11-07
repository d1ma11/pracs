package prac6.task11;

public class KelvinConverter implements Convertable {

    @Override
    public double getConverted(double temperature) {
        return temperature + 273.15;
    }
}
