package Weekend_3;

import java.util.*;

public class Employee {
    private final String name;
    private final Double salary;

    Employee(String name,Double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    //Your code here - 생성자를 정의하시오

    public String getName() {
        return this.name;
    }

    public Double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return this.name+this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}

 class ObjectMethodTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee(sc.next(), sc.nextDouble());
        Employee e2 = new Employee(sc.next(), sc.nextDouble());
        sc.close();

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.toString().equals(e2.toString()));

        System.out.println(e1.hashCode() != e2.hashCode());
        Set<Employee> employees = new HashSet<Employee>();
        employees.add(e1);
        employees.add(e2);
        System.out.println(employees.contains(e1));

        HashMap<Employee, Employee> pair = new HashMap<Employee, Employee>();
        pair.put(e1, e2);
        Employee found = pair.get(e1);
        System.out.println(found);
    }
}