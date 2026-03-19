class Course {

    // Instance variables
    String courseName;
    int duration;        // in months
    double fee;

    // Class variable (common for all courses)
    static String instituteName = "ABC Institute";

    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name   : " + courseName);
        System.out.println("Duration      : " + duration + " months");
        System.out.println("Fee           : " + fee);
    }

    // Class (static) method
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {

        Course c1 = new Course();
        c1.courseName = "Java";
        c1.duration = 6;
        c1.fee = 15000;

        Course c2 = new Course();
        c2.courseName = "Python";
        c2.duration = 4;
        c2.fee = 12000;

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy");

        System.out.println("\nAfter Updating Institute Name:");
        c1.displayCourseDetails();
    }
}
