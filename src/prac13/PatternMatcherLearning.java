package prac13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherLearning {
    public void StringManipulation() {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter a pattern: ");
        String p = sc.nextLine();
        System.out.println(Arrays.toString(str.split(p)));
    }

    public static boolean isThatString(String s) {
        return s.equals("abcdefghijklmnopqrstuv18340");
    }

    public static ArrayList<String> findRubEurUsd(String s) {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d{1,2})*\\s+((USD)|(EUR)|(RUB))");
        Matcher matcher = pattern.matcher(s);
        ArrayList<String> ans = new ArrayList<>();
        while (matcher.find()) {
            ans.add(matcher.group());
        }
        return ans;
    }

    public static boolean haveDigitPlus(String s) {
        return Pattern.compile("\\d+\\s*[+]").matcher(s).find();
    }

    public static boolean isCorrectDateFormat(String s) {
        Matcher m = Pattern.compile(
                "((29/02/((19([2468][048])|([13579][26])|(0[48]))|([2-9]\\d([2468][048])|([13579][26]))|([2468][048]00)|([3579][26]00)))|((2[0-8]/02/((19\\d\\d)|([2-9]\\d{3}))))|(((0?\\d)|([12]\\d)|(3[01]))/((0?[013456789])|(1[12]))/((19\\d\\d)|([2-9]\\d{3}))))"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }
    public static boolean checkEmail(String s){
        Matcher m = Pattern.compile(
                "[a-zA-Z0-9]+[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~.]*@[a-zA-Z0-9\\-_.]+\\.[a-zA-Z]+"
        ).matcher(s);
        return m.find() && m.group().equals(s);
    }
    public static boolean checkPass(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z_]{8,}").matcher(s).find();
    }

    public static void filter(Object[] array) {

    }

    public static void main(String[] args) {
        //ex2
        System.out.println(isThatString("abcdefghijklmnopqrstuv18340"));
        System.out.println(isThatString("asdzfghd4yt5y5"));
        System.out.println();
        //ex3
        System.out.println(findRubEurUsd("12.3 RUB, fejhge12 EUdsfrg3.789USD, 12.432 USD, 43.13 EU, 43.11 USD"));
        System.out.println();
        //ex4
        System.out.println(haveDigitPlus("1 / 3 -5"));
        System.out.println(haveDigitPlus("1 + 3 -5"));
        System.out.println(haveDigitPlus("1 / 3+5"));
        System.out.println(haveDigitPlus("1 + 3 + 5"));
        System.out.println();
        //ex5
        System.out.println(isCorrectDateFormat("12/12/2001"));
        System.out.println(isCorrectDateFormat("29/02/2000"));
        System.out.println(isCorrectDateFormat("29/02/2001"));
        System.out.println(isCorrectDateFormat("29/02/6400"));
        System.out.println(isCorrectDateFormat("29/02/6200"));
        System.out.println(isCorrectDateFormat("1/1/1923"));
        System.out.println(isCorrectDateFormat("1/1/1345"));
        //ex6
        System.out.println();
        System.out.println(checkEmail("danilov0330@gmail.com"));
        System.out.println(checkEmail(".da nilov 0330@gmail.com"));
        System.out.println(checkEmail("danilov0330.@.gmail.com"));
        System.out.println(checkEmail("danilov0330@gmail"));
        System.out.println(checkEmail("danilov0330@g@mail.ru"));
        //ex7
        System.out.println();
        System.out.println(checkPass("badpass"));
        System.out.println(checkPass("_Googpass1"));
    }

}
