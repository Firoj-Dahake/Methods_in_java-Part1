public class cwh_33_variable_argument {
    /* static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b,int c){
        return a+b+c;
    }
    static int sum(int a, int b,int c, int d){
        return a+b+c+d;
    }*/

    static int sum (int ...arr){ //available as int [] arr //variable argument
        int result=0;
        for (int e: arr){
            result += e;
        }
        return result;
    }
    static float average(int ...arr){
        float  average=0f;
        float result1=0f;
        for (int e:arr){
            result1+=e;
             average=result1/ arr.length;
        }
        return average;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4 and 5 is :" +sum());
        System.out.println("The sum of 4 and 5 is :" +sum());
        System.out.println("The sum of 4 , 3 and 5 is :" +sum(4,5,3));
        System.out.println("The sum of 4 , 3 and 5 is :" +sum(4,5,3,6));
        System.out.println("The average of 4 , 3 ,5 and 6 is :" +average(4,5,7,6,2,4));

    }
}
