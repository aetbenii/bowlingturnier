package bt;

import java.util.Locale;

public class TeilnehmerListe {

    private Teilnehmer start;

    public TeilnehmerListe() {
        start = null;
    }

    public void addTeilnehmer(Teilnehmer t) {
        Teilnehmer teilnehmer = start;

        if (start == null) { // -> wenn noch kein benutzer in der "liste" ist wird es hier aufgefangen sonst ->
            start = t;
            //System.out.println("Dies ist der erste Benutzer");
        } else {
            while (true) {
                // die ersten 3 buchstaben, weil sonst hashcode durchdreht
                if (teilnehmer.getName().equals(t.getName())) { // -> befindet sich der name schon in der liste wird die schleife abgebrochen
                    System.out.println("Der Name: '"+t.getName()+"' wird schon verwendet!");
                    break;
                } else {
                    if (teilnehmer.getName().substring(0, 3).toLowerCase().hashCode() > t.getName().substring(0, 3).toLowerCase().hashCode()) {
                        if (teilnehmer.getTv() == null) {
                            start = t;
                            start.setTn(teilnehmer);
                            teilnehmer.setTv(start);
                            break;
                        } else {
                            teilnehmer.getTv().setTn(t);
                            t.setTv(teilnehmer.getTv());
                            teilnehmer.setTv(t);
                            t.setTn(teilnehmer);
                            break;
                        }
                    }
                    if (teilnehmer.getTn() != null) {
                        teilnehmer = teilnehmer.getTn();
                    } else {
                        teilnehmer.getTv().setTn(t);
                        t.setTv(teilnehmer.getTv());
                        teilnehmer.setTv(t);
                        t.setTn(teilnehmer);
                        break;
                    }
                }
            }
        }
    }


    public int countTeilnehmer() {
        int count = 1;
        Teilnehmer t = start;
        if (start.getTn() == null) {
            System.out.println(start.toString());
            return 1;
        }
        while (t.getTn() != null) {
            count++;
            System.out.println(t.toString().toLowerCase());
            t = t.getTn();
        }
        System.out.println(t.toString().toLowerCase());
        return count;
    }

}
