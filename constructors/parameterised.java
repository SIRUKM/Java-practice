package constructors;

// Constructors that can take arguments are called parameterized constructors.
public class parameterised {
    int age;
    String Name;

    parameterised(int a, String N) {
        age = a;
        Name = N;
    }

    public static void main(String[] args) {
        parameterised s = new parameterised(34, "kamelesh");
        System.out.println(s.Name);
    }
}
