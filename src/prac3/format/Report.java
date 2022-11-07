package format;

public class Report {
    public static void generateReport(Employee[] array) {
        for (Employee employee : array) {
            System.out.printf("%s's salary is: %10.2f\n", employee.fullname, employee.salary);
        }
    }

    public static void main(String[] args) {
        Employee[] arr = {
                new Employee("Lena", 10.43)
                , new Employee("Anya", 597.45)
                , new Employee("Adam", 754.35)
        };

        generateReport(arr);
    }
}
