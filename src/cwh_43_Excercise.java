import java.util.Random;
import java.util.Scanner;

class Game {
    int userinput;
    int randomno;

    public Game() {
        System.out.println("The Random No. is ");
        Random random = new Random();
        int ranmdomno = random.nextInt();
    }

    public void takeUserInout() {
        Scanner sc = new Scanner(System.in);
        userinput = sc.nextInt();
    }

    public boolean isCorrectNumber() {
        if (userinput == randomno) {
            System.out.println("The userinput and random no. is found");
            return true;
        } else if (userinput > randomno) {
            System.out.println("This is greater than Random no.");
            return false;
        }
        return false;
    }
}



public class cwh_43_Excercise {
    public static void main(String[] args) {
        /*
        create a class Game , which allows a user to play "Guess the number" game once
        Game should have the following methods
        1. Constructor to generate the ramndom no.
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noOfGuesses
        use properties such as noOfGuesses(int) , etc to get this take done !
         */
        
    }
}
