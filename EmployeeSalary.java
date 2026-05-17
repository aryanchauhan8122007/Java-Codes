class Employee {

    private String name;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if(salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary! ❌");
        }
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class Code2_EmployeeSalary {
    public static void main(String[] args) {

        Employee e = new Employee();
        e.setName("Rahul");
        e.setSalary(50000);
        e.setSalary(-500);

        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
