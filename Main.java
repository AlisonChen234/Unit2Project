import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("Welcome to my Trivia Game.");
        //System.out.println("Please choose a topic between ____, ______, _______");
        System.out.println("Please choose a difficulty between Easy, Medium, Hard");
        String difficulty= scan.next();
        System.out.println(difficulty);
//        if (String difficulty = "Easy"){
//            System.out.println("Welcome");
//        }


        ArrayList<String> questions = getFileData("Questions");

        // access an element in this list
        System.out.println(questions.get(10));

        // Go through each question in the list
        //for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(1));
        //}


        ArrayList<String> answers = getFileData("Answers");

        // access an element in this list
        System.out.println(answers.get(10));

        // Go through each question in the list
        //for (int i = 0; i < answers.size(); i++) {
//           String a =  answers.get(1);
//           int length = a.length();
//            for (int i = 0; i < length; i++) {
//                System.out.print("_");
//            }


                String a =  answers.get(1);
                int length = a.length();
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

    }

    public static ArrayList<String> getFileData(String Questions) {
        ArrayList<String> fileData = new ArrayList<String>();
        try {
            File f = new File(Questions);
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                String line = s.nextLine();
                if (!line.equals(""))
                    fileData.add(line);
            }
            return fileData;
        }
        catch (FileNotFoundException e) {
            return fileData;
        }
    }
}