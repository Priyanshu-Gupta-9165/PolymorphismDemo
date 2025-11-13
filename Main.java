public class Main {
    public static void main(String[] args) {

        Person p;

        p = new Student("Priyanshu", 20, 101);
        p.displayDetails();

        System.out.println("-------------------");

        p = new Teacher("Gupta Sir", 40, "CS101");
        p.displayDetails();

        System.out.println("\nDisplaying both objects separately:");

        Student s = new Student("Rohan", 18, 202);
        Teacher t = new Teacher("Verma Madam", 35, "MATH201");

        s.displayDetails();
        System.out.println("-------------------");
        t.displayDetails();
    }
}
