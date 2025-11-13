class Teacher extends Person {
    String subjectCode;

    Teacher(String name, int age, String subjectCode) {
        super(name, age);
        this.subjectCode = subjectCode;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name + ", Age: " + age + ", Subject Code: " + subjectCode);
    }
}
