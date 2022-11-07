package format;
import java.text.NumberFormat;
import java.util.Locale;

public class task1 {
    public static void main(String[] args) {
        double money = 133.7;

        Locale[] arr = {Locale.US, Locale.CHINA, Locale.UK, Locale.JAPAN};
        String[] arr2 = {"US", "CHINA", "UK", "JAPAN"};

        for (int i = 0; i < arr.length; i++) {
            NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(arr[i]);
            System.out.printf("Денежная единица в %s локали: ", arr2[i]);
            System.out.println(numberFormat1.format(money));
        }
    }
}
