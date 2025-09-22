package oop_example;

public class Employee extends MySql {
    public int id;
    public String name;
    public String email;
    private int gizli;

    @Override
    public void delete() {
        super.delete();
    }

    @Override
    public void add() {
        // TODO Auto-generated method stub
        super.add();
    }

    public int getGizli() {
        return gizli + a;
    }

    public void setGizli(int gizli) {
        this.gizli = gizli;
    }
}
