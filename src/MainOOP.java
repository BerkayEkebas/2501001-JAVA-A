import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import oop_example.Employee;
import oop_example.MySql;


public class MainOOP {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.email = "mehmet";
        employee.id = 1;
        employee.setGizli(2);
        List<Integer> sayilar = new ArrayList<Integer>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);

        for (int integer : sayilar) {
            System.out.println(integer);
        }

        System.out.println(employee.getGizli());

        MySql mySql = new MySql();
        mySql.add();
        mySql.delete();

        try (Scanner scanner = new Scanner(System.in)) {
            int a, b;
            System.out.println("gir");
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println("toplam" + (a + b));
        }
    }
}
