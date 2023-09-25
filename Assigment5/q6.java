package Assigment5;

class Audi {
    final String Brand = "Audi";
    final int Enginie_no;

    Audi(int eng) {
        Enginie_no = eng;
    }

    void show() {
        System.out.println(Enginie_no);
    }

}

public class q6 {

    public static void main(String[] args) {
        Audi a = new Audi(45);
        a.show();
    }

}
