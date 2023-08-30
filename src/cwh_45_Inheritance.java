
class Base{//parent class
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a Print Me method");
    }
}
class Derived extends Base{ //decleare through extends keyword   -----> child class
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am setting y now");
        this.y = y;
    }
}
public class cwh_45_Inheritance {
    public static void main(String[] args) {
        //Creating the object of Base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //Creating the object of derived class
        Derived d = new Derived();
        b.setX(44);
        System.out.println(b.getX());
        d.setY(5);
        System.out.println(d.getY());
        b.printMe();
    }
}
