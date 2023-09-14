import java.util.Scanner;//to take input for constructor
public class Main{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=scan.nextLine();

        System.out.println("Enter your marks :");
        int marks  =scan.nextInt();
        
        
        
        Student obj = new Student(name,marks);
        // obj.get_details();
        obj.show_details();
    }
}