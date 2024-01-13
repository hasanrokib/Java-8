import java.util.ArrayList;
import java.util.List;

public class EnhForLoop {
    public static void main(String[] args){
        List<Employee> totalEmployees= new ArrayList<>();
        totalEmployees.add(new Employee("hasan",1,2000,3));
        totalEmployees.add(new Employee("akib",2,24000,9));
        totalEmployees.add(new Employee("rokib",3,26000,8));
        totalEmployees.add(new Employee("tanjib",4,27000,5));
        totalEmployees.add(new Employee("ehan",5,29000,9));
        totalEmployees.forEach(System.out::println);
    }

}
