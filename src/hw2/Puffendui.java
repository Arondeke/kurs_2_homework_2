package hw2;

public class Puffendui extends Hogwards {
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffendui(String name, String surname, int magic, int transgress, int hardworking, int loyal, int honest) {
        super(name, surname, magic, transgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    public String toStringPuffendui() {
        return super.toString() + ", " + "hardworking:" + getHardworking() + ", " + "loyal:" + getLoyal() + ", " + "honest:" + getHonest();
    }

    public static void compareStudents(Puffendui student1, Puffendui student2) {
        int student1Points = student1.hardworking + student1.loyal + student1.honest;
        int student2Points = student2.hardworking + student2.loyal + student2.honest;
        if (student1Points > student2Points) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName());
        } else if (student1Points < student2Points) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " равен " + student2.getName());
        }
    }
}
