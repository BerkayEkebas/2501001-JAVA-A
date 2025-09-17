public class Test {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = new Integer(5);
        int c =5;
        System.out.println(a +"," +b +"," + c);
        System.out.println(c == b ? true : false);
        System.out.println(b.equals(c));
    }
}
