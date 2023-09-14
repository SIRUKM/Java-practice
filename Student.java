import java.util.Scanner;

public class Student{
    Scanner scan = new Scanner(System.in);
    String name = "";
    int marks = 0;

    public void get_details(){//taking input from the user
        
        System.out.println("Enter your Name ");
        name=scan.nextLine();
        System.out.println("Enter your Marks ");
        marks = scan.nextInt();
    }
    public void show_details(){
        System.out.println("Name of the Student :"+name);
        System.out.println("Marks of the Student :"+marks);
    }
}