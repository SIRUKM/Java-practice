package Set_Get;

public class set {
    int age;
    String Name;

    void setage(int age) {
        this.age = age;
        // this.Name = Name;
    }

    int getage() {
        return age;
    }

    public static void main(String[] args) {
        set s = new set();
        s.setage(35);
        System.out.println(s.getage());
    }

}
