package Abstract_class;

abstract class Vechical {
    abstract void start();
}

class car extends Vechical {
    void start() {
        System.out.println("hmmm......hmmmm.hmmmmmm........hhhhhhhmmm");
    }
}

class scotter extends Vechical{

    void start(){
        System.out.println("futttt.futtt futttt..............ffffffuuuttlfjsijfiowaejhf");
    }

    public static void main(String [] args){
        car c = new car();
        c.start();
    }
}
