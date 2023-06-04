public class Employee {

    private String name;
    private String position;
    private double salary;
    private int experience;
    private String educational_level;

    public Employee(String name, String position, double salary, int experience, String educational_level) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.experience = experience;
        this.educational_level = educational_level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEducational_level() {
        return educational_level;
    }

    public void setEducational_level(String educational_level) {
        this.educational_level = educational_level;
    }

    public double calculatedSalary() {
        double salaryCalc = salary + (salary * 5.0 / 100 * experience);

        if (educational_level.equals("Bachellor Degree")) {
            salaryCalc += 500;
        }
        if (educational_level.equals("Diploma Degree")) {
            salaryCalc += 250;
        }

        return salaryCalc;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Position: " + getPosition() + ", Basic Salary: " + getSalary()+
                ", Experience: " + getExperience() + ", Educational level: " + getEducational_level();
    }
    

}
