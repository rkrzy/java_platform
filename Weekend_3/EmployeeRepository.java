package Weekend_3;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class StaticTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Employee employee1 = new Employee(sc.next(), sc.nextDouble());
        Employee employee2 = new Employee(sc.next(), sc.nextDouble());
        Employee employee3 = new Employee(sc.next(), sc.nextDouble());
        sc.close();

        EmployeeRepository repository = EmployeeRepository.getInstance();
        repository.add(employee1);
        repository.add(employee2);

        System.out.println(findEmployee(employee1));
        System.out.println(findEmployee(employee3));
    }

    private static Employee findEmployee(Employee employee) {
        EmployeeRepository repository = EmployeeRepository.getInstance();
        if (repository.contains(employee))
            return repository.get(employee);
        else
            return new Employee ("DEFAULT", 0.0);
    }
}
public class EmployeeRepository {

    private Map<String, Employee> employees = new HashMap<String,Employee>();
   private static EmployeeRepository ER = new EmployeeRepository();
   private EmployeeRepository(){}
    public static EmployeeRepository getInstance()
    {
        return ER;
    }

    public void add(Employee employee) {
        employees.put(employee.getName(), employee);
    }

    public boolean contains(Employee employee) {
        return employees.containsKey(employee.getName());
    }

    public Employee get(Employee employee) {
        return employees.get(employee.getName());
    }
}