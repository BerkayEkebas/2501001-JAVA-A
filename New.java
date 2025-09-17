import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter: ");
        char ch = scanner.next().charAt(0);  

        int ascii = (int) ch; 
        System.out.println("ASCII: " + ascii);
        System.out.printf("ASCII: %h " , ch);
    }
}
