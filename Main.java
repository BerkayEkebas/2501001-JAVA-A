import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public int topla(int input){
        if(input==1){
            return 1;
        }
        else{
            return input+topla(input-1);
        }
     
    }
    public static void main(String[] args) {
        Main a = new Main();
        String[] sdsd = {"122","3434"};
        List<String> deneme = new ArrayList<>();
        deneme.add("sdsd");
        boolean bool= deneme.contains("sddfdfsd");
        int input=5;
        int sonuc = a.topla(input);
        System.out.println(bool);
        deneme.size();
        int sdsdsdsd= sdsd[0].length();
        System.out.println(deneme.get(0));
        System.out.println(Arrays.toString(sdsd));
        String denemes= "sdsd";
        denemes="sadasddsadasd8888";
        System.out.println(denemes);
        // Employee employee = new Employee();
        // employee.email="mehmet";
        // employee.id=1;
        // employee.setGizli(2);
        // List<Integer> sayilar = new ArrayList<Integer>();

        // sayilar.add(3);
        // sayilar.add(5);
        // sayilar.add(6);

        // for (int integer : sayilar) {
        //     System.out.println(integer);
        // }
        
        // System.out.println(employee.getGizli());

        // MySql mySql= new MySql();
        // mySql.add();
        // mySql.delete();

        // try (Scanner scanner = new Scanner(System.in)) {
        //     int a,b;
        //     System.out.println("gir");
        //     a= scanner.nextInt();
        //     b= scanner.nextInt();
        //     System.out.println("toplam"+a+b);
        // }

    }
}
