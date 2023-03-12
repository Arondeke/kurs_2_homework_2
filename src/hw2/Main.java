package hw2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random property = new Random();

        Griffindor GarryPotter = new Griffindor("Garry", "Potter", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(11));
        Griffindor HermioneGranger = new Griffindor("Hermione", "Granger", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101));
        Griffindor RonWeasley = new Griffindor("Ron", "Weasley", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101));

        Slizerin DracoMalfoy = new Slizerin("Draco", "Malfoy", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101));
        Slizerin GrahamMontague = new Slizerin("Graham", "Montague", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101));
        Slizerin GregoryGoyle = new Slizerin("Gregory", "Goyle", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101));

        Puffendui ZachariasSmith = new Puffendui("Zacharias", "Smith", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101));
        Puffendui CedricDiggory = new Puffendui("Cedric", "Diggory", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101));
        Puffendui JustinFinchFletchley = new Puffendui("Justin", "FinchFletchley", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101));

        Kogtevran ChoChang = new Kogtevran("Cho", "Chang", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101));
        Kogtevran PadmaPatil = new Kogtevran("Padma", "Patil", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101));
        Kogtevran MarcusBelby = new Kogtevran("Marcus", "Belby", property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101), property.nextInt(101));


        System.out.println(GarryPotter.toStringGriffindor());
        System.out.println(HermioneGranger.toStringGriffindor());
        System.out.println(RonWeasley.toStringGriffindor());

        System.out.println(DracoMalfoy.toStringSlizerin());
        System.out.println(GrahamMontague.toStringSlizerin());
        System.out.println(GregoryGoyle.toStringSlizerin());

        System.out.println(ZachariasSmith.toStringPuffendui());
        System.out.println(CedricDiggory.toStringPuffendui());
        System.out.println(JustinFinchFletchley.toStringPuffendui());

        System.out.println(ChoChang.toStringKogtevran());
        System.out.println(PadmaPatil.toStringKogtevran());
        System.out.println(MarcusBelby.toStringKogtevran());

        Griffindor.compareStudents(GarryPotter, HermioneGranger);
        Kogtevran.compareStudents(ChoChang, PadmaPatil);
        Slizerin.compareStudents(GregoryGoyle, GrahamMontague);
        Puffendui.compareStudents(CedricDiggory, ZachariasSmith);

        Hogwards.compareStudents(GarryPotter, DracoMalfoy);
    }
}