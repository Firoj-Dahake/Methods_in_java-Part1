class Employee1{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class Cellphone{
    public void ring(){
        System.out.println("Ringing ......");
    }
    public void vibrat(){
        System.out.println("Vibrating ......");
    }
    public void callfriend(){
        System.out.println("Calling to pranay....");
    }
}
class Square{
   int side;
    public int areaofsquare(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}
class Circle{
    int r;
    public float area(){
        return (3.142f*r*r);
    }
    public float perimeter(){
        return (2*3.142f*r);
    }
}
class TommyVecetti{
    public void hitt(){
        System.out.println("Hitting.....");
    }
    public void run(){
        System.out.println("running.....");
    }
    public void fir(){
        System.out.println("firing.....");
    }
}


public class cwh_39_Practiceset_on_opps {
    public static void main(String[] args) {
       /* //Problem no.: 1
        Employee1  firoj = new Employee1();
        firoj.setName("Fitness with firoj");
        firoj.salary=223;
        System.out.println(firoj.getsalary());
        System.out.println( firoj.getName());

        //problem no. 2
        Cellphone redmi9 = new Cellphone();
        redmi9.vibrat();
        redmi9.callfriend();
        redmi9.ring();*/

        //problem no. : 3
        /*Square calculation=new Square();
        calculation.side=3;
        System.out.println(calculation.areaofsquare());
        System.out.println(calculation.perimeter());*/

        /*System.out.println(calculation.areaofsquare(4));
        System.out.println(calculation.perimeter(4));*/

        //problem no-4
        /*Rectangle re=new Rectangle();
        re.l=4;
        re.b=3;
        System.out.println(re.area());
        System.out.println(re.perimeter());*/

        //problem mo-5
        /*TommyVecetti player1 = new TommyVecetti();
        player1.fir();
        player1.hitt();
        player1.run();*/

        //problem no.-6
        Circle circle1 = new Circle();
        circle1.r=5;
        System.out.println("The area of circle is "+circle1.area());
        System.out.println("The perimeter of circle is "+circle1.perimeter());
    }
}
