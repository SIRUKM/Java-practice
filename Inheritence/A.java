package Inheritence;

class A {
    void showA() {
        System.out.println("A class method");
    }
}

class B extends A {// Single Level Inhertince
    void showB() {
        System.out.println("B class method");
    }
}

class C extends B{// Multi Level Inhertince
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
        obj3.showA();   //{      
        obj3.showB();      // obj3 C ka object hai , from this we are calling A,B and C
        obj3.showC();   //}
    }
}
