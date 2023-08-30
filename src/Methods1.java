public class Methods1 {
    static void change(int a){
        a=56;

    }

    static void change1(int []arr ){
        arr[0]=98;

    }

    static void telljock(){
        System.out.println("I am a jock");

    }
    public static void main(String[] args) {
       //telljock();

        //changing the integer  --> integer value will not change
        /*int [] marks={12,34,76,45,87};
        int x=12;
        change(x);
        System.out.println(x);*/

        //changing the array --> array value will change
        int [] marks={1,2,545,23,456,5}; //marks --> refrance and {} is object itself and giving reference to the change1 method
        change1(marks); //give the address
        System.out.println(marks[0]);

    }
}
