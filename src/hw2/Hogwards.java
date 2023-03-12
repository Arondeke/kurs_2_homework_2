package hw2;

public class Hogwards {
    public String name;
    public String surname;
    private int magic;
    private int transgress;

    public Hogwards(String name, String surname, int magic, int transgress) {
        this.name = name;
        this.surname = surname;
        this.magic = magic;
        this.transgress = transgress;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMagic() {
        return magic;
    }

    public int getTransgress() {
        return transgress;
    }

    @Override
    public String toString() {
        return "name:" + name + ", " +
                "surname:" + surname + ", " +
                "magic:" + magic + ", " +
                "transgress:" + transgress;
    }

    public static void compareStudents(Hogwards student1, Hogwards student2) {
        int student1Points = student1.magic + student1.transgress;
        int student2Points = student2.magic + student2.transgress;
        if (student1Points > student2Points) {
            System.out.println(student1.getName() + " лучше чем " + student2.getName());
        } else if (student1Points < student2Points) {
            System.out.println(student2.getName() + " лучше чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " равен " + student2.getName());
        }
    }
}
