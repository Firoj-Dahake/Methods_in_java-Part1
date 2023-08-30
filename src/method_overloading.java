public class method_overloading {// two methods having same name but having different function
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){   // a is parameter

        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a,int b){   // a is parameter

        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    public static void main(String args[]){
        foo();
        foo(50); // value of parameter is called argument like 50 argument are actual value
        foo(30,34);
    }
}
