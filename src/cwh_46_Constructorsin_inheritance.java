
class Base1{
    Base1(){
        System.out.println("I am a base constructor ");
    }
    Base1(int a){
        System.out.println("I am a overloaded constructor from base class with value of a is :"+a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am a Derived Constructor ");
    }

    Derived1(int a, int b){
        super(a);
        System.out.println("I am a constructor from derived clas with value of b is :"+b);
    }
}
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }
    ChildOfDerived(int a,int b, int c){
        super(a , b);
        System.out.println("I am a child of derived constructor with value of c is :"+c);
    }
}
public class cwh_46_Constructorsin_inheritance {
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //Derived1 d = new Derived1();
        ChildOfDerived ch = new ChildOfDerived(50,45,78);
    }
}
