package constructors;

public class Student {
    int age;
    String Name;

    public Student() {// variables ko initilize karne me help karta hia
        // It is generally used to initialize the default value of the data members.
        age = 35;
        Name = "kamlesh";
    }

    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.Name);
    }
}