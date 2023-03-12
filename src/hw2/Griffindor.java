package hw2;

public class Griffindor extends Hogwards {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int magic, int transgress, int nobility, int honor, int bravery) {
        super(name, surname, magic, transgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public String toStringGriffindor() {
        return super.toString() + ", " + "nobility:" + getNobility() + ", " + "honor:" + getHonor() + ", " + "bravery:" + getBravery();
    }

    public static void compareStudents(Griffindor student1, Griffindor student2) {
        int student1Points = student1.bravery + student1.honor + student1.nobility;
        int student2Points = student2.bravery + student2.honor + student2.nobility;
        if (student1Points > student2Points) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName());
        } else if (student1Points < student2Points) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " равен " + student2.getName());
        }
    }
}