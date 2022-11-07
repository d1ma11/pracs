package prac6.task11;

public class ConvertDemo {
    public static void main(String[] args) {
        double temperature = 36.6;

        System.out.printf("temperature = %.1f F\n", new FahrenheitConverter().getConverted(temperature));
        System.out.printf("temperature = %.1f K\n", new KelvinConverter().getConverted(temperature));
    }
}
