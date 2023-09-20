package Encapsulation;

class Employee {
    private int empId;

    public void SetEmp(int eid){
        empId = eid;
    }

    public int getEmp(){
        return empId;
    }
}



class Company{

    public static void main(String[] args){
        Employee e = new Employee();
        e.SetEmp(4);
        System.out.println(e.getEmp());


    }
}
