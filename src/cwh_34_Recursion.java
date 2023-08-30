public class cwh_34_Recursion {
    static  int factorial(int n){
        //factorial 0! = 1;
        // factorial 4! =4 * 3 * 2 * 1=120 ;
        // factorial(n) =n *factorial(n-1)

        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }

    }
    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else {
            int result=1;
            for (int i=1;i<=n;i++){
                result*=i;
            }
            return result;
        }
    }


    public static void main(String[] args) {
        int x=5;
        System.out.println("The value of 5! is :"+factorial(x)); //by Resursive method
        System.out.println("The value of 5! is :"+factorial_iterative(x)); // by iterative method

    }
}
