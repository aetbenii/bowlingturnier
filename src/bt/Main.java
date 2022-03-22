package bt;

public class Main {

    public static void main(String[] args) {

        Teilnehmer a1 = new Teilnehmer("thomas", null);

        TeilnehmerListe liste = new TeilnehmerListe();
        liste.addTeilnehmer(a1);

        liste.addTeilnehmer(new Teilnehmer("beni", null));

        System.out.println(liste.countTeilnehmer());

    }
}
