package practice;

//for constructors ke liye 
public class Test {
    int i;// default value 0
    String s;// default value NULL

    public Test(int a) {
        System.out.println("no argument constructor");
    }

    public static void main(String[] args) {
        Test t = new Test(10);
        // System.out.println(t.i+" "+t.s);

    }
}
