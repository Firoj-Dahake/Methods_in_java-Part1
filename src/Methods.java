public class Methods {
      int logic(int x, int y){ //as a function which is present inside the classes
        int z;                      // int ---> return type and this is () a parameters
        if (x>y){
            z = x + y ;
        }
        else {
            z = ( x + y ) * 5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a =15;
        int b=10;
        int c;
        Methods obj=new Methods();// Method  invocation using method creation

        c = obj.logic(a,b);
        System.out.println(c);

        int a1=3;
        int b1=30;
        int c1=obj.logic(a1,b1);
        System.out.println(c1);
    }
}
