class Teacher extends Person {
    String subjectCode;

    Teacher(String name, int age, String subjectCode) {
        super(name, age);
        this.subjectCode = subjectCode;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Profile:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject Code: " + subjectCode);
    }
}
