package practice;

//for constructors ke liye 
public class Employee {
    int Employee_id;// default value 0
    String Name;// default value NULL

    // patrameterised constructor
    public Employee(String n, int id){
        Name = n;
        Employee_id = id;
    }

    // public Test(int a) {
    //     System.out.println("no argument constructor");
    // }

    public static void main(String[] args) {
        Employee e1 = new Employee("Kamlesh",01);
        Employee e2 = new Employee("Suresh",02);

        System.out.println("Employee 1: "+e1.Employee_id+ " "+ e1.Name);
        System.out.println("Employee 2: "+e2.Employee_id+ " "+ e2.Name);
        // System.out.println(t.i+" "+t.s);

    }
}
