public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, String position, double salary, int experience, String educational_level) {
        super(name, position, salary, experience, educational_level);
    }

    @Override
    public double calculatedSalary() {

        double salaryCalc = super.calculatedSalary();
        salaryCalc += getSalary() * 3.0 / 100;
        return salaryCalc;
    }

    @Override
    public String toString() {
        return  "FullTimeEmployee : " +super.toString()  ;
    }
    

}
