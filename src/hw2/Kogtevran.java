package hw2;

public class Kogtevran extends Hogwards {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public Kogtevran(String name, String surname, int magic, int transgress, int smart, int wise, int witty, int creativity) {
        super(name, surname, magic, transgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public String toStringKogtevran() {
        return super.toString() + ", " + "smart:" + getSmart() + ", " + "wise:" + getWise() + ", " + "witty:" + getWitty() + ", " + "creativity:" + getCreativity();
    }

    public static void compareStudents(Kogtevran student1, Kogtevran student2) {
        int student1Points = student1.smart + student1.wise + student1.witty + student1.creativity;
        int student2Points = student2.smart + student2.wise + student2.witty + student2.creativity;
        if (student1Points > student2Points) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName());
        } else if (student1Points < student2Points) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " равен " + student2.getName());
        }
    }
}