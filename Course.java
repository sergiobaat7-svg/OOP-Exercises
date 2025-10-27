class Course {
    // Attributes
    protected String courseName;
    protected String instructor;
    protected int credits;

    // Constructor
    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    // Method to display course details
    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}

// Subclass
class OnlineCourse extends Course {
    // Additional attributes
    private String platform;
    private int duration; // in weeks

    // Constructor
    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    // Overridden method to display course details (including new attributes)
    @Override
    public void displayDetails() {
        super.displayDetails(); // call parent class method
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " weeks");
    }

    // Method to check certificate eligibility
    public void checkCertificateEligibility() {
        if (duration >= 4) {
            System.out.println("True, Eligible for certificate!");
        } else {
            System.out.println("False, Not eligible for certificate (minimum 4 weeks required).");
        }
    }
}

// Main class to test
class Main {
    public static void main(String[] args) {
        // Create an OnlineCourse object
        OnlineCourse oc = new OnlineCourse("Java Programming", "Dr. Sergio", 3, "Coursera", 6);

        // Display course details
        oc.displayDetails();

        // Check certificate eligibility
        oc.checkCertificateEligibility();s
    }
}