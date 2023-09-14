package Multi_level_Inheritence;
import java.util.Scanner;

public class Testproject {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter your Name :");
        String Parent_name = scan.next();



        Grandchild obj = new Grandchild(Parent_name, 45, "M");


        obj.show_gender();
        obj.show_age();
        obj.show_name();
    }
}
