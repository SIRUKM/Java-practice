package This;
class A {
    int i = 10;

    void mi() {
        System.out.println("I in A");
    }
}

class B extends A {
    int i = 20;

    void show(int i) {
        System.out.println(i); // i passed on object
        System.out.println(this.i);// 20
        System.out.println(super.i);// 10 parent class ka i
        // super ke use se parent class ke andar wale features access kar sakte hai
        // agar parent and child class me same name ka koi method hai -> then using
        // super class can help in accesing the method
        // in parent class
    }

    void mi() {
        System.out.println("I in B");
    }

    void show1(){
        mi();//ye class B ke mi ko call karega
    }
    void show2(){
        super.mi();//ye class A ke mi ko call karega
        //super hamesha he parent class ko refer karta hai
    }

    public static void main(String[] args) {
        B ob = new B();
        ob.show(4);

        ob.mi();
        ob.show1();
        ob.show2();
    }
}
