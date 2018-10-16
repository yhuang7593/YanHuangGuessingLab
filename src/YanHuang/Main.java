package YanHuang;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        Random generator = new Random();
        int random = generator.nextInt(10);
        System.out.println("Can you guess an integer from 1 to 10?");
        int guess = Keyboard.nextInt();
        if (guess != random) {
            System.out.println("Guess Again");
        } else {
            System.out.print("You guessed it!");
        }
    }

    public static void hundred(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        Random generator = new Random();
        int random = generator.nextInt(100);
        System.out.println("Can you guess an integer from 1 to 100?");
        int guess = Keyboard.nextInt();
        while (guess != random) {
            if (guess > random) {
                System.out.println("Lower");
            } else if (guess < random) {
                System.out.print("Higher");
            }
        }
        System.out.println("You guessed it!");
    }

    public static void choose(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        Random generator = new Random();
        String Username;
        System.out.println("What is your name?");
        Username = "";
        System.out.print("If you want to guees a number from 1-10, enter 'A.'If you want to guess a number from 1-1000 'C'");
        public static void extensionA (String[]args){

            int random = generator.nextInt(10);
            System.out.println("Can you guess an integer from 1 to 10?");
            int guess = Keyboard.nextInt();
            int attempts = 0;
            while (guess != random) {
                if (guess > random) {
                    System.out.println("Lower");
                    attempts = attempts + 1;
                } else if (guess < random) {
                    System.out.print("Higher");
                    attempts = attempts + 1;
                }
            }
            System.out.println("You guessed it" + Username + "and you took" + attempts + "attempts to guess it");
        }

        public static void extensionC (String[]args) {
            int random = generator.nextInt(1000);
            System.out.println("Can you guess an integer from 1 to 1000?");
            int guess = Keyboard.nextInt();
            int attempts = 0;
            while (guess != random) {
                if (guess > random) {
                    System.out.println("Lower");
                    attempts = attempts + 1;
                } else if (guess < random) {
                    System.out.print("Higher");
                    attempts = attempts + 1;
                }
            }
            System.out.println("You guessed it" + Username + "and you took" + attempts + "attempts to guess it");
        }
    }

}
