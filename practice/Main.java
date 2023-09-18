package practice;
class Animal{


    public void run(){
        System.out.println("runing");
    }

    public void eat(){
    System.out.println("rice is the stable food for most of the indians");
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println("1");
        Animal dog = new Animal();
        dog.run();
        dog.eat();

        Bird chidiBird = new Bird();
        chidiBird.fly();
    }
}


class Bird{

    public void fly(){
        System.out.println("I can fly");
    }
}
