package Polymorphism;
// Run time Polymorphism(Dynamic Polymorphism)
//Method overiding 
// 1.different class
// 2. Same name Methods
// 3. Same Arguments
    //   i. No of Arguments
    //   ii. Types of Arguments
    //   iii. Sequence of Arguments
// 4. Inheritence

class Test2 {
    void show(){//no parameter
        System.out.println("1");
    }
    void show(int a){//passing parameters
        System.out.println("1");
    }
    void show(int a, int b){//passing parameters
        System.out.println("1");
    }
    void show(int a, String s){//Different parameters
        System.out.println("1");
    }
    void show(String s, int a){//Different parameters
        System.out.println("1");
    }
}

class xyz extends Test2{
    void show(){//no parameter
        System.out.println("2");
    }
    void show(int a){//passing parameters
        System.out.println("2");
    }
    void show(int a, int b){//passing parameters
        System.out.println("2");
    }
    void show(int a, String s){//Different parameters
        System.out.println("2");
    }
    void show(String s, int a){//Different parameters
        System.out.println("2");
    }

    public static void main(String[] args){

        Test2 t1 = new Test2();
        t1.show();
        t1.show(49);
        t1.show(49,59);
        t1.show(49,"dfhhf");
        t1.show("dfhhf",58);



        System.out.println("----------------------------------------------");
        xyz t2 = new xyz();



        t2.show();
        t2.show(68);
        t2.show(68,78);
        t2.show(68,"hfewb");
        t2.show("hfewb",78);
    }
}
