public class PartTimeEmployee extends Employee {

    public PartTimeEmployee(String name, String position, double salary, int experience, String educational_level) {
        super(name, position, salary, experience, educational_level);
    }

    @Override
    public double calculatedSalary() {

        double salaryCalc = super.calculatedSalary();
        salaryCalc += getSalary() * 1.5 / 100;
        return salaryCalc;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee : " + super.toString();
    }

}
