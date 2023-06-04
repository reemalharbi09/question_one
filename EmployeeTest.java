
public class EmployeeTest {
 
    public static void main(String[] args) {
        
        FullTimeEmployee employee1 =new FullTimeEmployee("Sara","Manger",150,2,"Bachellor Degree");
        PartTimeEmployee employee2 =new PartTimeEmployee("Ahmed","Doctor",150,5,"Diploma Degree");
        
        System.out.println(employee1.toString());
        System.out.println("Employee1 Calculated : " + employee1.calculatedSalary());
        System.out.println(employee2.toString());
        System.out.println("Employee2 Calculated : " + employee2.calculatedSalary());
    }
}
