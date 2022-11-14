package prac4_1.task6;

public class Employer {
    private String firstName;
    private String lastName;
    private double income;
    private boolean isAvgDaysWorked;

    Employer(String firstName, String lastName, double income, boolean isAvgDaysWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
        this.isAvgDaysWorked = isAvgDaysWorked;
    }

    public double getIncome() {
        if (isAvgDaysWorked) {
            return 12 * income;
        }
        return income;
    }
}