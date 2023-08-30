class MyMainEmployee{
    private int id;
    private String name;
    private int salary;
    public MyMainEmployee(){
        id=12;
        name="This is me";
    }
    public MyMainEmployee(String myname){ ///automaticaly invoke(run) because it is constructor
        id=123;
        name=myname;
    }
    public MyMainEmployee(int myid){ ///automaticaly invoke(run) because it is constructor
        id=myid;
        name="firoj";
    }
    public MyMainEmployee(int myid, String myname, int mysalary){
        id=myid;
        name=myname;
        salary=mysalary;
    }

   /* public int getId(){
        return id;
    }
    public void setId(int i){
        id=i;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }*/

}
public class cwh_42_constructor {
    public static void main(String[] args) {
        MyMainEmployee firoj = new MyMainEmployee(13,"samir",10000);
        /*firoj.setName("Fitness with firoj");
        firoj.getName();*/
       /* System.out.println(firoj.getName());
        firoj.setId(123);
        System.out.println(firoj.getId());*/

       /* System.out.println(firoj.getId());
        System.out.println(firoj.getName());*/

    }
}
