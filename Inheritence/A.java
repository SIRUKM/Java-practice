package Inheritence;
//Herirical Inheritance
//      A
//     / \
//    /   \
//   B     C
class A {//parent class
    void showA() {
        System.out.println("A class method");
    }
}

class B extends A {// Herirical Inhertince
    void showB() {
        System.out.println("B class method");
    }
}

class C extends A{// Herirical Inheritance
    void showC(){
        System.out.println("C class method");
    }

    public static void main(String[] args) {
        A obj1 = new A(); 
        obj1.showA();
        // obj1.showB() this is wrong we can't call parent from child

        B obj2 = new B();
        obj2.showB();
        obj2.showA();

        C obj3 = new C();
        obj3.showA();       
        // obj3.showB();//B ko call nahi kar sakte     
        obj3.showC(); 
    }
}
