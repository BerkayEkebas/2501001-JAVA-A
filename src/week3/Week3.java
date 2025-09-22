package week3;
import java.util.Scanner;

public class Week3 {
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
            case 9: sample9(); break;
            default: System.out.println("Invalid sample number!");
        }
    }
    public void sample1() {
        byte a;
        short b;
        int c;
        long d;
        float f;
        double k;
        char ch;
        final float PI = 3.141592f;
    // PI = 3.14f; // final variable cannot be changed
        a = (byte) 128;
        b = (short) 32768;
        c = (int) 3L;
        d = 3;
        f = 31.4f;
        k = 34.1;
        ch = 'A';
        String name = "A";
        String test = new String("test");
    System.out.println("Sample3-1 executed.");
    }
    public void sample2() {
        int byte1 = 127;
        int byte2 = 34;
        long result =  (byte1 + byte2);
        System.out.printf("%d + %d = %d\n", byte1, byte2, result);
    }
    public void sample3() {
        String apple = "부사";
        byte count = 4;
        String name = "홍길동";
        double height = 170.5;
    System.out.printf("Apple type: %s, count: %d\n", apple, count);
    System.out.printf("%s's height is %5.1f %c.\n", name, height, '\uf028');
    }
    public void sample4() {
        String name = "홍길동";
        int age = 21;
        float eye = 1.2f;
        String blood = "O";
    System.out.printf("Name : %s\n", name);
    System.out.printf("Age : %2d\n", age);
    System.out.printf("Eyesight : %3.1f\n", eye);
    System.out.printf("Blood type : %s\n", blood);
    }
    public void sample5() {
        Scanner keyboard = new Scanner(System.in);
        float litter = 0.0f;
        float km = 0.0f;
        float result = 0.0f;
    System.out.print("Enter fuel used: ");
        litter = keyboard.nextFloat();
    System.out.print("Enter distance traveled: ");
        km = keyboard.nextFloat();
        result = km / litter;
    System.out.printf("Fuel used: %.2f %c\n", litter, '\u2113');
    System.out.printf("Distance traveled: %.2f Km\n", km);
    System.out.printf("Fuel efficiency: %.2f Km/%c\n", result, '\u2113');
        keyboard.close();
    }
    public void sample6() {
        int time = 12000;
        int work = 5;
        int day = 7;
        int money = 25000;
        money = money + ((time * work) * day);
    System.out.printf("Hourly wage: %c %,d\n", '\uffe6', time);
    System.out.printf("Hours worked per day: %d hours\n", work);
    System.out.printf("Days worked: %d days\n", day);
    System.out.printf("My wallet money: %c %,d \n", '\uffe6', money);
    }
    public void sample7() {
        final int SPEED = 300000;
        final float YEAR = 365.25f;
        long light = 0L;
        double light1 = 0.0;
        light = SPEED * (long) (((YEAR * 24) * 60) * 60);
        light1 = SPEED * (((YEAR * 24) * 60) * 60);
    System.out.printf("Distance light travels in 1 second: %,d km/s\n", SPEED);
    System.out.printf("1 year is %.2f days\n", YEAR);
    System.out.printf("1 light year: %,d Km\n", light);
    System.out.printf("1 light year: %,d Km\n", (long) light1);
    }
    public void sample8() {
        Scanner keyboard = new Scanner(System.in);
        int kor = 0;
        int eng = 0;
        int math = 0;
        int total= 0;
        float avg = 0.0f;
    System.out.print("Enter Korean score: ");
    kor = keyboard.nextInt();
    System.out.print("Enter English score: ");
    eng = keyboard.nextInt();
    System.out.print("Enter Math score: ");
    math = keyboard.nextInt();
    total = kor + eng + math;
    avg = total / 3.0f;
    System.out.printf("\nKorean score: %d\n", kor);
    System.out.printf("English score: %d\n", eng);
    System.out.printf("Math score: %d\n", math);
    System.out.printf("\nTotal: %d\n", total);
    System.out.printf("Average: %.2f\n", avg);
        keyboard.close();
    }
    public void sample9() {
        Scanner keyboard = new Scanner(System.in);
        final String NAME = "양준혁";
        int batting = 0;
        int hit = 0;
        float result = 0.0f;
    System.out.print("Enter today's at bats: ");
    batting = keyboard.nextInt();
    System.out.print("Enter today's hits: ");
    hit = keyboard.nextInt();
    result = (float) hit / batting;
    System.out.printf("Player name: %s\n", NAME);
    System.out.printf("Today's at bats: %d\n", batting);
    System.out.printf("Today's hits: %d\n", hit);
    System.out.printf("Today's batting average: %.2f\n", result);
        keyboard.close();
    }
}
