package prac24.task2;

public class VictorianChair extends Chair {
    private final int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        System.out.print("OMG!@$! This chair is so old that you can not afford it. LUL. " +
                "BTW, it's ");
        return this.age;
    }

    @Override
    String getType() {
        return "Victorian chair";
    }
}
