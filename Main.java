import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double randomNum = 0;
        boolean runGame = true;
        while (runGame == true) {


            System.out.println("Welcome to my Trivia Game.");
            //System.out.println("Please choose a topic between ____, ______, _______");
            System.out.println("Please choose a difficulty between Easy, Medium, Hard");
            String difficulty = scan.nextLine();
            //System.out.println(difficulty);
            if (difficulty.equalsIgnoreCase("Easy")) {
                randomNum = (int) (Math.random() * 17) + 1;
                System.out.println("Welcome");
            } else if (difficulty.equalsIgnoreCase("Medium")) {
                randomNum = (int) (Math.random() * 21) + 21;
                System.out.println(" this is mediunm");
            } else if (difficulty.equalsIgnoreCase("Hard")) {
                randomNum = (int) (Math.random() * 10) + 45;
                System.out.println("this is hard");
            }


            ArrayList<String> questions = ExtractInfo.getFileData("Questions");
            ArrayList<String> answers = ExtractInfo.getFileData("Answers");


            System.out.println(questions.get((int) randomNum));
            String a = answers.get((int) randomNum);
            int indexNumLetters = a.length();
            for (int i = 0; i < indexNumLetters; i++) {
                String letter = String.valueOf(a.charAt(i));
                String space = " ";
                if (letter.equals(space)) {
                    System.out.print(" ");
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
            String userAnswer = scan.nextLine();
//        System.out.println(userAnswer);
            while (!userAnswer.equalsIgnoreCase(a)) {
                List<String> messages = Arrays.asList("Bro, come on", "How do you not know this", "bruh", "0 IQ");
                System.out.println(messages.get((int) (Math.random() * messages.size())));
                System.out.println("Try again");
                userAnswer = scan.nextLine();

            }
            if (userAnswer.equalsIgnoreCase(a)) {
                System.out.println("you got the correct answer");
                List<String> messages = Arrays.asList("1000 IQ", "Hmmm, very smart", "YAY", "yesss sirrr");

                System.out.println("Please type yes if you want to try again or no to indicate that you're done");
                String tryAgain = scan.nextLine();

                if (tryAgain.equalsIgnoreCase("Yes")) {
                    continue;
                } else if (tryAgain.equalsIgnoreCase("no")) {
                    System.out.println("You're finished. Have a great day");
                    runGame = false;
                }
            }
        }
    }
}