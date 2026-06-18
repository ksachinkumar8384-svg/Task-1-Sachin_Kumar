// Create a class Game, which allows a user to play "Guess the Number" game once. Game should have the following
// methods:
// 1. Constructor to generate the random number.
// 2. takeUserInput() to take a user input of number.
// 3. isCorrectNumber() to detect whether the number entered by the user is true.
// 4. getter and setter for noOfGuesses
// Use properties such as noOfGuesses(int), etc to get this task done!.
import java.util.Random;
import java.util.Scanner;

class Game
{
    public int number;
    public int inputNumber;
    public int noOfAttempts = 0;
    public int getNoOfAttempts()
    {
        return noOfAttempts;
    } 

    Game()
    {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeuserInput()
    {
        System.out.println("Guess the number");
        Scanner s = new Scanner(System.in);
        inputNumber = s.nextInt();
    }

    boolean isCorrectNumber()
    {
        noOfAttempts++;
        if(inputNumber == number)
        {
            // System.out.println("Yes, you are guessed it right, it was "+number+" \nYou guessed it in "+noOfAttempts+" attempts.");
            System.out.println("Correct");
            return true;
        }
        else if(inputNumber>number)
        {
            // System.out.println("This number is high....");
            System.out.println("Too High");
        }
        else if(inputNumber<number)
        {
            // System.out.println("This number is low....");
            System.out.println("Too Low");
        }
            return false;
    }
    
}

class A
{
    public static void main(String[] arr)
    {
        Game g = new Game();
        boolean b = false;
        while(!b)
        {
            g.takeuserInput();
            b = g.isCorrectNumber();
        }
        System.out.println("The number of Attempts = "+g.getNoOfAttempts());
 
    }
}