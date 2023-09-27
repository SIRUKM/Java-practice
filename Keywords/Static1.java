package Keywords;

class Static1 {
    int EmpId;
    static String dept = "ee";
    private static Object show;

    void show() {
        System.out.println(EmpId + dept);
    }

    public static void main(String[] args) {
        Static1 emp = new Static1();
        emp.EmpId = 4;
        System.out.println(emp.EmpId);
        System.out.println(Static1.dept);
        emp.show();
    }
}
