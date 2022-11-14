package prac4_1.task6;

public class Manager extends Employer{
    private double averageSum;

    Manager(String firstName, String lastName, double income, double averageSum, boolean isAvgDaysWorked) {
        super(firstName, lastName, income, isAvgDaysWorked);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }


    public static void main(String[] args) {
        Employer[] workers = {
                new Manager("Steve", "Smith", 40000, 15000, true),
                new Employer("Bob", "Gates", 20000, true),
                new Employer("Stan", "Lee", 20000,false),
                new Manager("Barak", "Obama", 100000, 50000, false)
        };

        for (Employer worker : workers) {
            System.out.println(worker.getIncome());
        }
    }
}
