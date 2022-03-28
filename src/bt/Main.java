package bt;

public class Main {

    public static void main(String[] args) {

        TeilnehmerListe liste = new TeilnehmerListe();
        Teilnehmer t1 = new Teilnehmer("thomas");
        Teilnehmer t2 = new Teilnehmer("beni");
        Teilnehmer t3 = new Teilnehmer("nils");
        Teilnehmer t4 = new Teilnehmer("Anna");
        Teilnehmer t5 = new Teilnehmer("Tom");

        liste.addTeilnehmer(t1);
        liste.addTeilnehmer(t2);
        liste.addTeilnehmer(t3);
        liste.addTeilnehmer(t4);
        liste.addTeilnehmer(t5);

        System.out.println(liste.toString());

        //Teilnehmer von der liste löschen funktioniert. Auch erster, letzter und dazwischen.
        //liste.removeTeilnehmer(t1.getName());
        liste.removeTeilnehmer("anna");
        liste.removeTeilnehmer("tom");

        //Alphabetisch check.
        liste.addTeilnehmer(new Teilnehmer("Bernd"));
        liste.addTeilnehmer(new Teilnehmer("Yuu xin"));
        liste.addTeilnehmer(new Teilnehmer("Xin xauo"));

        liste.addPointsToTeilnehmer("thomas", 10);
        liste.addPointsToTeilnehmer("beni", 30);
        liste.addPointsToTeilnehmer("nils", 40);
        liste.addPointsToTeilnehmer("xin xauo", 10);
        liste.addPointsToTeilnehmer("yuu xin", 10);

        //System.out.println(liste.containsTeilnehmer("nils"));

        //liste.pointOrderedString();
        System.out.println(liste.pointOrderedString());
        System.out.println(liste.toString());
    }
}
