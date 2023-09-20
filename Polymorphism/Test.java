package Polymorphism;

// Compile time Polymorphism(Static Polymorphism)
//Method overloading 
// 1.Same class
// 2. Same name Methods
// 3. Different Arguments
    //   i. No of Arguments
    //   ii. Types of Arguments
    //   iii. Sequence of Arguments
class Test {
    void show(){//No Arguments
        System.out.println("1");
    }
    void show(int a){//With Arguments
        System.out.println("2");
    }
    void show(int a,int b){//Differetn No of argumetns
        System.out.println("3");
    }
    void show(int a,String s){//Different Types of Arguments
        System.out.println("4");
    }
    void show(String s,int a){//Change of Sequences
        System.out.println("5");
    }
    void show(String s){
        System.out.println("6");
    }
    void show(int...a){//varargs  can pass multiple int args
        System.out.println("7");
    }



    public static void main(String[] args){
        Test t1 = new Test();

        t1.show();
        t1.show(10);
        // t1.show('4');//char int ke tra treat hoo raha
        // t1.show('j');
        t1.show(10,20);
        t1.show(10,"kamlesh");
        t1.show("kamlesh",10);
        t1.show("kamlesh");
        t1.show(10,23,45,87);
    }
}
