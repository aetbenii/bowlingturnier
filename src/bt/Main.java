package bt;

public class Main {

    public static void main(String[] args) {

        Teilnehmer a1 = new Teilnehmer("thomas", null);
        Teilnehmer a2 = new Teilnehmer("beni", null);


        TeilnehmerListe liste = new TeilnehmerListe();
        liste.addTeilnehmer(a1);
        liste.addTeilnehmer(a2);
        liste.addTeilnehmer(new Teilnehmer("Nils",null));
        liste.addTeilnehmer(new Teilnehmer("Anna",null));
        liste.addTeilnehmer(new Teilnehmer("tom",null));
        liste.addTeilnehmer(new Teilnehmer("aalex",null));
        liste.addTeilnehmer(a2);
        System.out.println(liste.countTeilnehmer() + "\n ---");

        liste.removeTeilnehmer(a2);

        System.out.println(liste.countTeilnehmer() + "\n ---");

        liste.addPointsToTeilnehmer("thomas", 5);
        a1.getPointslist().countPoints();
        System.out.println(a1.getPointslist().countPoints());

        System.out.println("   ");
        //System.out.println(liste.toString());
    }
}
