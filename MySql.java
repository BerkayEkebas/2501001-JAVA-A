public class MySql implements IData {

    int a=6;
    @Override
    public void add() {
     System.out.println("Mysql added");
    }

    @Override
    public void delete() {
        System.out.println("Mysql deleted");
    }
    
}
