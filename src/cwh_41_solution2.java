import java.util.Random;
import java.util.Scanner;
public class cwh_41_solution2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose 0 for rock, 1 for paper and 2 for Scissor");
        int userInput = sc.nextInt();

        Random random= new Random();
        int computerInput = random.nextInt(3);

        if (userInput == computerInput){
            System.out.println("Draw");
        }
        else if(userInput ==0 && computerInput == 2 || userInput ==1 && computerInput ==0
                || userInput==2 && computerInput ==1){
            System.out.println("You Win !");
        }
        else {
            System.out.println("Computer win !");
        }
        System.out.println("User Input Chooice is "+userInput);
        if (computerInput==0){
            System.out.println("Computer Chooice Rock");
        }
        else if (computerInput==1){
            System.out.println("Computer Chooice is Paper");
        }
        else {
            System.out.println("Computer Chooice is Scissor");
        }
    }
}
