package prac12;

import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Address {
    private String country, region, city, street, house, building, apartment;

    public Address(String address, boolean isTokenizer) {
        String[] s;
        if (isTokenizer) {
            StringTokenizer tokenizer = new StringTokenizer(address, ",.;");
            s = new String[tokenizer.countTokens()];

            int i = 0;
            while (tokenizer.hasMoreTokens()) {
                s[i++] = tokenizer.nextToken();
            }
        } else {
            s = address.split(",");
        }

        if (s.length < 7) {
            throw new IllegalArgumentException("Строка содержит недостаточно данных!");
        }
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        building = s[5].trim();
        apartment = s[6].trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Address address1 = new Address("United States, Alabama, Huntsville, Bassel Avenue, 165    ,   none,    none", false);
        Address address2 = new Address("Spain    . Granada.      Fuente Vaqueros.     Cruce Casa de Postas. 63. none. 152", true);
        Address address3 = new Address("Russia    ;    Respublika Tatarstan;     Kazan; Kosmonatov UI; 49; 1; 63", true);
        Address address4 = new Address("    Germany, Hessen; Espenau. Michaelkirchstr.     91, 3; 34", true);


        System.out.println(address1);
        System.out.println(address2);
        System.out.println(address3);
        System.out.println(address4);
    }
}
