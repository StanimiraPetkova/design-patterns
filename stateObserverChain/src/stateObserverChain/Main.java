package stateObserverChain;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        getEmployees().forEach(Handler::new);
    }

    private static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee("E1");
        Order order1 = new Order("id1");
        employee1.subscribe(order1);
        employees.add(employee1);
        Employee employee2 = new Employee("E2");
        Order order2 = new Order("id2");
        employee2.subscribe(order2);
        employees.add(employee2);
        Employee employee3 = new Employee("E3");
        Order order3 = new Order("id3");
        employee3.subscribe(order3);
        employees.add(employee3);
        Employee speditor = new Employee("Speditor");
        employees.add(speditor);

        return employees;
    }
}
