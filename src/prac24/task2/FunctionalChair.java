package prac24.task2;

public class FunctionalChair extends Chair{
    private int a;
    private int b;

    public int sum(int a, int b) {
        System.out.print("Holly molly!! This chair just added numbers "
                + a + " and " + b
                + " and have got this: ");
        return a + b;
    }

    @Override
    String getType() {
        return "Functional chair";
    }
}
