package practice;
class Animal{

    String name;
    int age;


    // using Method
    void initizlize_Variable(String s, int a){
        name = s;
        age = a;
    }

    void display(){
        System.out.println("name: "+name+" "+"age :"+age);
    }
    // public void run(){
    //     System.out.println("runing");
    // }

    // public void eat(){
    // System.out.println("rice is the stable food for most of the indians");
    // }
}
public class Main {
    public static void main(String[] args){
        // System.out.println("1");
        Animal dog = new Animal();
        dog.initizlize_Variable("hg",45);
        // dog.run();
        // dog.eat();

        // Bird chidiBird = new Bird();
        // chidiBird.fly();

        // dog.name = "Kamlesh";//By using Re frence Variable
        // dog.age = 25;//By using Refrence Variable

        // System.out.println(dog.name+"  " +dog.age);


        dog.display();
    }
}


// class Bird{

//     public void fly(){
//         System.out.println("I can fly");
//     }
// }
