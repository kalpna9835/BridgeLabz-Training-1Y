class Student {

    String name;
    int rollNumber;
    int marks;

    // Method to calculate grade
    String calculateGrade() {
        if (marks >= 80)
            return "A";
        else if (marks >= 60)
            return "B";
        else if (marks >= 40)
            return "C";
        else
            return "Fail";
    }

    // Method to display student details and grade
    void displayReport() {
        System.out.println("Name       : " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + calculateGrade());
    }

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Aditya";
        s.rollNumber = 101;
        s.marks = 75;

        s.displayReport();
    }
}
