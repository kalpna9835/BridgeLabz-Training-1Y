class Person {

    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Copy constructor
    Person(Person p) {
        name = p.name;
        age = p.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Aditya", 18);
        Person p2 = new Person(p1);

        p1.display();
        p2.display();
    }
}
