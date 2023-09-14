package Multi_level_Inheritence;
public class Grandchild extends Child{
    String Gender;

    public Grandchild(String s, int a, String g){
        super(s,a);
        Gender = g;
    }

    public void show_gender(){
        System.out.println("The Gender is ;"+Gender);
    }
}
