import java.util.Scanner;
import week2.Week2;
import week3.Week3;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which week's samples do you want to run?");
        System.out.println("1 - Week2");
        System.out.println("2 - Week3");
        System.out.print("Your choice (1 or 2): ");
        int weekChoice = scanner.nextInt();

        if (weekChoice == 1) {
            Week2 w2 = new Week2();
            System.out.print("Enter sample number for Week2 (1-8): ");
            int sample = scanner.nextInt();
            w2.runSample(sample);
        } else if (weekChoice == 2) {
            Week3 w3 = new Week3();
            System.out.print("Enter sample number for Week3 (1-9): ");
            int sample = scanner.nextInt();
            w3.runSample(sample);
        } else {
            System.out.println("Invalid week selection!");
        }
        scanner.close();
    }
}


// ...existing code...
