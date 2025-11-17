import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my Trivia Game.");
        System.out.println("Please choose a topic between ____, ______, _______");
        System.out.println("Please choose a difficulty between Easy, Medium, Hard");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println("_");
        }
    }

    public static ArrayList<Questions> getFileData(String Questions) {
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