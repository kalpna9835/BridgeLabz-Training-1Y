// Parent class
class Employee {

    public int employeeID;          // public
    protected String department;    // protected
    private double salary;          // private

    // Public method to set salary
    public void setSalary(double s) {
        salary = s;
    }

    // Public method to get salary
    public double getSalary() {
        return salary;
    }
}

// Subclass
class Manager extends Employee {

    void displayDetails() {
        System.out.println("Employee ID : " + employeeID);     // public accessible
        System.out.println("Department  : " + department);     // protected accessible
        System.out.println("Salary      : " + getSalary());    // private via method
    }

    public static void main(String[] args) {

        Manager m = new Manager();

        m.employeeID = 1001;
        m.department = "IT";
        m.setSalary(50000);

        m.displayDetails();
    }
}
