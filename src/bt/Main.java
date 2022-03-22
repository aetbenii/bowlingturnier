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

        liste.addTeilnehmer(a2);
        System.out.println(liste.countTeilnehmer());
    }
}
