class Employee {

    String name;
    int id;
    double salary;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee();

        e.name = "Aditya";
        e.id = 1;
        e.salary = 20000;

        e.display();
    }
}
