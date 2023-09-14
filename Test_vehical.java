import java.util.Scanner;
public class Test_vehical {
    public static void main(String[] args){
       Scanner scan =  new Scanner(System.in);


       
       System.out.println("Enter cost of vechicle");
       int vechicle_cost  = scan.nextInt();



       System.out.println("Enter milege of vechicle");
       int vechicle_mileage  = scan.nextInt();


       System.out.println("Enter color of vechicle");
       String car_color  = scan.next();

       System.out.println("Enter number of tyres vechicle");
       int car_tyre = scan.nextInt();

       Car obj = new Car(vechicle_cost, vechicle_mileage, car_color, car_tyre);
       obj.show_car_details();
       obj.show_vehicle_details();
       

    }
}
