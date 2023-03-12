package hw2;

public class Slizerin extends Hogwards {
    private int cunning;
    private int determined;
    private int ambitious;
    private int resourceful;
    private int powerlike;

    public Slizerin(String name, String surname, int magic, int transgress, int cunning, int determined, int ambitious, int resourceful, int powerlike) {
        super(name, surname, magic, transgress);
        this.cunning = cunning;
        this.determined = determined;
        this.ambitious = ambitious;
        this.resourceful = resourceful;
        this.powerlike = powerlike;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermined() {
        return determined;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public int getResourceful() {
        return resourceful;
    }

    public int getPowerlike() {
        return powerlike;
    }

    public String toStringSlizerin() {
        return super.toString() + ", " + "cunning:" + getCunning() + ", " + "determined:" + getDetermined() + ", " + "ambitious:" + getAmbitious() + ", " + "resourceful:" + getResourceful() + ", " + "powerlike:" + getPowerlike();
    }

    public static void compareStudents(Slizerin student1, Slizerin student2) {
        int student1Points = student1.cunning + student1.determined + student1.ambitious + student1.resourceful + student1.powerlike;
        int student2Points = student2.cunning + student2.determined + student2.ambitious + student2.resourceful + student2.powerlike;
        if (student1Points > student2Points) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName());
        } else if (student1Points < student2Points) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " равен " + student2.getName());
        }
    }
}