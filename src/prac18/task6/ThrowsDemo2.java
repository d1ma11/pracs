package prac18.task6;

public class ThrowsDemo2 {
    public void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo2 throwsDemo = new ThrowsDemo2();
        try {
            throwsDemo.printMessage("beer");
            throwsDemo.printMessage(null);
        } catch (NullPointerException exception) {
            System.out.println("U've got an error");
        }
    }
}
