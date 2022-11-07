package prac7.task5_to6;

public interface StringManipulation {
    static int countChars(String line) {
        return line.length();
    }

    static String oddPositions(String line) {
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < line.length(); i += 2) {
            ans.append(line.charAt(i));
        }
        return ans.toString();
    }

    static String reverseString(String line) {
        StringBuilder ans = new StringBuilder();
        for (int i = line.length() - 1; i >= 0; i--) {
            ans.append(line.charAt(i));
        }
        return ans.toString();
    }
}
