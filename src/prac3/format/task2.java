package format;

import java.text.NumberFormat;
import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> items = new HashMap<>();
        items.put("Jacket", rand.nextInt(2000, 5000));
        items.put("Skirt", rand.nextInt(1500, 3000));
        items.put("Socks", rand.nextInt(300, 600));
        items.put("PC", rand.nextInt(10000, 15000));

        //выбор товара
        int i = 1;
        for (String s : items.keySet()) {
            System.out.printf("%d. %s\n", i, s);
            i++;
        }
        System.out.print("Выбери товар: ");
        int choiceItem = sc.nextInt();
        int money = switch (choiceItem) {
            case 1 -> items.get("Skirt");
            case 2 -> items.get("Jacket");
            case 3 -> items.get("PC");
            case 4 -> items.get("Socks");
            default -> 0;
        };

        //выбор валюты
        Locale[] arr = {Locale.US, Locale.CHINA, Locale.UK, Locale.JAPAN};
        String[] arr2 = {"US", "CHINA", "UK", "JAPAN"};

        for (int j = 0; j < arr.length; j++) {
            System.out.printf("\n%d. %s", j + 1, arr2[j]);
        }
        System.out.print("\nВыбери валюты для оплаты товара: ");
        int choiceCurrency = sc.nextInt();

        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(arr[choiceCurrency-1]);
        System.out.printf("Денежная единица в %s локали: ", arr2[choiceCurrency-1]);
        System.out.println(numberFormat1.format(money));

    }
}

