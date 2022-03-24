package bt;

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

    public void removeTeilnehmer(Teilnehmer t){
        Teilnehmer teilnehmer = start;
        while(teilnehmer.getTn() != null){
            if(teilnehmer.getName().toLowerCase().equals(t.getName().toLowerCase())){
                teilnehmer.getTv().setTn(teilnehmer.getTn());
                teilnehmer.getTn().setTv(teilnehmer.getTv());
                break;
            }else{
                teilnehmer = teilnehmer.getTn();
            }
        }
    }

    public void addPointsToTeilnehmer(String tname, int points){
        Teilnehmer teilnehmer = start;
        while(teilnehmer.getTn() != null){
            if(teilnehmer.getName().toLowerCase().equals(tname.toLowerCase())){
                teilnehmer.getPointslist().addElement(new Point(points));
            }else{
                teilnehmer = teilnehmer.getTn();
            }
        }
        if(teilnehmer.getName().toLowerCase().equals(tname.toLowerCase())){
            teilnehmer.getPointslist().addElement(new Point(points));
        }
    }



    public int countTeilnehmer() {
        int count = 0;
        Teilnehmer t = start;
        if (start.getTn() == null) {
            System.out.print("Anzahl Teilnehmer: ");
            return 1;
        }
        while (t.getTn() != null) {
            count++;
            t = t.getTn();
        }
        System.out.print("Anzahl Teilnehmer: ");
        return count;
    }

}
