public class cwh_35_prectice_set_on_Methods {
    static void multiplication_table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+ " X "+ i +" = "+ n*i);
        }

    }
    static void pattern1(int n){
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    static int naturaln0sum(int n){
       if (n==1){ //base condition to end recursion
           return 1;
       }
       else {
           return n+naturaln0sum(n-1);
       }
    }
    static void pattern2(int n){
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
    static void pattern1_rec(int n){
        if (n>0){
            pattern1_rec(n-1);
            for (int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // *
    // * *
    // * * *
    // * * * *
    static void pattern2_rec(int n){

    }
    // * * * *
    // * * *
    // * *
    // *

    public static void main(String[] args) {

        //problem no> 1
      // multiplication_table(5);

       //problem no > 2
       // pattern1(5);

        //problem no >3
       // int x=3;
       //System.out.println("The sum of first n natural number"+ naturaln0sum(x));

        //proble no >4
       // pattern2(5);

        //problem no >5
       // int result=fib(7);
        //System.out.println(result);

        //problem no 8
        pattern1_rec(4);
        pattern2_rec(4);

    }
}
