package prac12;

public class task1 {
    private static String line;

    public static void getString(String inputString) {
        line = inputString;
    }

    public static void main(String[] args) {
        getString("I like Java!!!");

        System.out.println("Последний символ строки \"I like Java!!!\": " + line.charAt(line.length() - 1));
        System.out.println("Оканчивается ли строка на \"!!!\": " + line.endsWith("!!!"));
        System.out.println("Начинается ли строка на \"I like\": " + line.startsWith("I like"));
        System.out.println("Содержит ли строка подстроку \"Java\": " + line.contains("Java"));
        System.out.println("Позиция подстроки \"Java\": " + line.indexOf("Java"));
        System.out.println("Замена буквы О на букву А: " + line.replace('a', 'o'));
        System.out.println("Приведение строки к верхнему регистру: " + line.toUpperCase());
        System.out.println("Приведение строки к нижнему регистру: " + line.toLowerCase());
        System.out.println("Вырез подстроки \"Java\": " + line.substring(line.indexOf("Java"), line.indexOf("Java") + "Java".length()));
    }
}