public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism demo
        Person p;

        // Assigning Student object
        p = new Student("Priyanshu Gupta", 20, 231001);
        p.displayDetails();

        System.out.println("--------------------------");

        // Assigning Teacher object
        p = new Teacher("Rajesh Kumar", 38, "CS104");
        p.displayDetails();

        System.out.println("\nShowing individual objects:");

        // Creating Student object
        Student s = new Student("Ravikant Verma", 19, 231015);

        // Creating Teacher object
        Teacher t = new Teacher("Anil Sharma", 45, "MATH201");

        System.out.println("--------------------------");
        s.displayDetails();

        System.out.println("--------------------------");
        t.displayDetails();
    }
}
