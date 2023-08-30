 class Employee{
    int id;
    String name;
    int salary;

    public void printdetails(){
        System.out.println("My Id is "+ id);
        System.out.println("My Name is "+ name);
    }
    public int getsalary(){
        return salary;
    }
}
public class Opps1 {
    public static void main(String[] args) {
        System.out.println("Creating the Custome class");
      Employee firoj = new Employee();
      Employee pranay= new Employee();

        //setting attributs of firoj
        firoj.id=12;
        firoj.name="Fitness with firoj";
        firoj.salary=130000;

        //setting attributs of pranay
        pranay.id=20;
        pranay.name="pranay has shop";
        pranay.salary=100000;

        //printing attributes
        firoj.printdetails();
        pranay.printdetails();

        int salary= firoj.getsalary();
        int salary1= pranay.getsalary();
        System.out.println("The salary of firoj is"+ salary);
        System.out.println("The salary of jhon is"+ salary1);
       // System.out.println(firoj.salary);
    }
}
