// Parent class
class Student {

    public int rollNumber;     // public
    protected String name;     // protected
    private double CGPA;       // private

    // Public method to set CGPA
    public void setCGPA(double c) {
        CGPA = c;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }
}

// Subclass
class PostgraduateStudent extends Student {

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber); // public accessible
        System.out.println("Name       : " + name);       // protected accessible
        System.out.println("CGPA       : " + getCGPA());  // private accessed via method
    }

    public static void main(String[] args) {

        PostgraduateStudent p = new PostgraduateStudent();

        p.rollNumber = 101;
        p.name = "Aditya";
        p.setCGPA(8.5);

        p.displayDetails();
    }
}
