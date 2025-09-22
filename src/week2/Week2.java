package week2;
import java.util.Scanner;

public class Week2 {
    public void runSample(int sample) {
        switch (sample) {
            case 1: sample1(); break;
            case 2: sample2(); break;
            case 3: sample3(); break;
            case 4: sample4(); break;
            case 5: sample5(); break;
            case 6: sample6(); break;
            case 7: sample7(); break;
            case 8: sample8(); break;
            default: System.out.println("Invalid sample number!");
        }
    }
    public void sample1() {
        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
    public void sample2() {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
    System.out.print("What is your name? ");
    name = keyboard.nextLine();
    System.out.println("Name: " + name);
        keyboard.close();
    }
    public void sample3() {
        Scanner keyboard = new Scanner(System.in);
        int first;
        int second;
        int result;
    System.out.print("Enter first integer: ");
    first = keyboard.nextInt();
    System.out.print("Enter second integer: ");
    second = keyboard.nextInt();
    result = first * second;
    System.out.printf("%,d * %,d = %,d\n", first, second, result);
        keyboard.close();
    }
    public void sample4() {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        short age = 0;
    System.out.print("What is your name? ");
    name = keyboard.nextLine();
    System.out.printf("How old are you, %s? ", name);
    age = keyboard.nextShort();
    System.out.printf("\n%s is %d years old.\n", name, age);
        keyboard.close();
    }
    public void sample5() {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        short age = 0;
        float height = 0.0f;
        double weight = 0.0;
    System.out.print("What is your name? ");
    name = keyboard.nextLine();
    System.out.printf("How old are you, %s? ", name);
    age = keyboard.nextShort();
    System.out.printf("What is your height, %s? ", name);
    height = keyboard.nextFloat();
    System.out.printf("What is your weight, %s? ", name);
    weight = keyboard.nextDouble();
    System.out.printf("\n%s is %d years old.\n", name, age);
    System.out.printf("%s's height is %.1f cm.\n", name, height);
    System.out.printf("%s's weight is %.1f kg.\n", name, weight);
        keyboard.close();
    }
    public void sample6() {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int age = 0;
        char gender = ' ';
        char result = ' ';
    System.out.print("What is your name? ");
    name = keyboard.nextLine();
    System.out.printf("How old are you, %s? ", name);
    age = keyboard.nextInt();
    System.out.printf("What is your gender, %s? (M = Male, F = Female): ", name);
    gender = keyboard.next().charAt(0);
    result = gender == 'M' ? 'M' : 'F';
    System.out.printf("\n%s is %d years old.\n", name, age);
    System.out.printf("%s's gender is %c (%c).\n", name, gender, result);
        keyboard.close();
    }
    public void sample7() {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int age = 0;
        String address = "";
    System.out.print("What is your name? ");
    name = keyboard.nextLine();
    System.out.printf("How old are you, %s? ",  name);
    age = keyboard.nextInt();
    keyboard.nextLine();
    System.out.printf("What is your address, %s? ",  name);
    address = keyboard.nextLine();
    System.out.printf("\n%s is %d years old.\n", name, age);
    System.out.printf("%s's address is %s.\n", name, address);
        keyboard.close();
    }
    public void sample8() {
        Scanner keyboard = new Scanner(System.in);
        char ch = ' ';
    System.out.print("Enter a character: ");
    ch = keyboard.next().charAt(0);
    System.out.printf("\nThe ASCII code of character %c is %h.\n",ch, ch);
        keyboard.close();
    }
}
