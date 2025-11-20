import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Welcome to my Trivia Game.");
        //System.out.println("Please choose a topic between ____, ______, _______");
        System.out.println("Please choose a difficulty between Easy, Medium, Hard");
        String difficulty= scan.next();
        System.out.println(difficulty);
       if (difficulty.equalsIgnoreCase("Easy")) {
            System.out.println("Welcome");
        }
       else if (difficulty.equalsIgnoreCase("Medium")) {
           System.out.println(" this is mediunm");
       }
       else if (difficulty.equalsIgnoreCase("Hard")){
           System.out.println("this is hard");
       }


        ArrayList<String> questions = ExtractInfo.getFileData("Questions");
        ArrayList<String> answers = ExtractInfo.getFileData("Answers");


        System.out.println(questions.get(1));
        String a =  answers.get(1);
        int indexNumLetters = a.length();
        for (int i = 0; i < indexNumLetters; i++) {
            String letter = String.valueOf(a.charAt(i));
            String space = " ";
            if (letter.equals(space)){
                System.out.print(" ");
            }
            else {
                System.out.print("_");
                    }
            }
        String userAnswer= scan.next();

        while (!userAnswer.equalsIgnoreCase(a)){
            System.out.println("Try again");
        }
        if (userAnswer.equalsIgnoreCase(a)){
            System.out.println("you got the correct answer");
        }


    }

}