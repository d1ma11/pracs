package prac28;

import java.util.*;

public class MyMap {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Dima", "Danilov");
        map.put("Dima", "Moiseev");
        map.put("Oleg", "Belov");
        map.put("Denis", "Belov");
        map.put("Yaroslav", "Belov");
        map.put("Yaropolk", "Lebedev");
        map.put("Maksim", "Ivanov");
        map.put("Yura", "Grigoriev");
        map.put("Petr", "Ovchinnikov");
        map.put("Petr", "Romanov");

        return map;
    }

    public static Map<String, Integer> getSameFirstNameCount(HashMap<String, String> map) {
        Integer one = 1;

        Map<String, Integer> result = new TreeMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer count = result.get(key);
            if (count == null)
                result.put(key, one);
            else
                result.put(key, count + 1);
        }
        return result;
    }

    public static Map<String, Integer> getSameLastNameCount(HashMap<String, String> map) {
        Integer one = 1;

        Map<String, Integer> result = new TreeMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Integer count = result.get(value);
            if (count == null)
                result.put(value, one);
            else
                result.put(value, count + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        HashMap<String, String> myMap = createMap();
        System.out.println(myMap);
        System.out.println(getSameFirstNameCount(myMap));
        System.out.println(getSameLastNameCount(myMap));

        {
            Set<String> set = new HashSet<>();
            set.add("Andrew Jackson");
            set.add("Martin Van Buren");
            set.add("William Henry Harrison");
            set.add("John Tyler");
            set.add("James K. Polk");
            set.add("Millard Fillmore");
            set.add("Franklin Pierce");
            set.add("James Buchanan");
            set.add("Abraham Lincoln");

            System.out.println("HashSet: " + set);

            Set<String> hashSetToTreeSet = new TreeSet<>(set);

            System.out.println("TreeSet: " + hashSetToTreeSet);
        }
    }
}
