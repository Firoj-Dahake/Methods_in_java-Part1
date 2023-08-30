class Employee2 {
    int id;
    String name;
    public Employee2(){
        id=101;
        name="firoj";
    }
    public Employee2(int id, String name){
        System.out.println("The id of Employee is "+id);
        System.out.println("The Name of employee is "+name);
    }
    public Employee2(int myid,   String myname,int salary){
        id=myid;
       name=myname;
        System.out.println("The Salary of employee is "+salary);
    }

}

public class cwh_42_problem {
    public static void main(String[] args) {
        Employee2 emp = new Employee2(10,"firoj",10000);
    }
}
