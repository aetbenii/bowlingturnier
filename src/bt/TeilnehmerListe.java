package bt;

public class TeilnehmerListe {

    private Teilnehmer start;

    public TeilnehmerListe() {
        start = null;
    }

    //fertig
    public void addTeilnehmer(Teilnehmer t) {
        Teilnehmer teilnehmer = this.start;

        if (this.start == null) { // -> wenn noch kein benutzer in der "liste" ist wird es hier aufgefangen sonst ->
            this.start = t;
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
                        teilnehmer.setTn(t);
                        t.setTv(teilnehmer);
                        break;
                    }
                }
            }
        }
    }

    //fertig
    public void removeTeilnehmer(String teilnehmername){
        Teilnehmer teilnehmer = start;
        if(teilnehmer.getName().toLowerCase().equals(teilnehmername.toLowerCase()) && teilnehmer.getTv() == null){
            teilnehmer.getTn().setTv(null);
            start = teilnehmer.getTn();
        }else{
            while(teilnehmer.getTn() != null){
                if(teilnehmer.getName().toLowerCase().equals(teilnehmername.toLowerCase())){
                    teilnehmer.getTv().setTn(teilnehmer.getTn());
                    teilnehmer.getTn().setTv(teilnehmer.getTv());
                    break;
                }else{
                    teilnehmer = teilnehmer.getTn();
                }
            }
            if(teilnehmer.getTn() == null){
                teilnehmer.getTv().setTn(null);
            }
        }

    }

    //fertig
    public void addPointsToTeilnehmer(String tname, int points){
        Teilnehmer teilnehmer = start;
        while(teilnehmer.getTn() != null){
            if(teilnehmer.getName().toLowerCase().equals(tname.toLowerCase())){
                teilnehmer.getPointslist().addPoints(new Point(points));
                break;
            }else{
                teilnehmer = teilnehmer.getTn();
            }
        }
        if(teilnehmer.getTn() == null){
            teilnehmer.getPointslist().addPoints(new Point(points));
        }
    }

    //fertig
    public int countTeilnehmer() {
        int count = 0;
        Teilnehmer t = start;
        if (start.getTn() == null)  return 1;
        while (t.getTn() != null) {
            count++;
            t = t.getTn();
        }
        return count;
    }

    public String pointOrderedString(){
        // funktioniert nicht
        String pos = "";
        Teilnehmer teilnehmer = start;
        TeilnehmerListe copy = new TeilnehmerListe();
        Teilnehmer a = new Teilnehmer("dddd");
        copy.addTeilnehmer(a);
        Teilnehmer highest = a;
        while(teilnehmer != null){
            if(highest.getPointslist().countTotalPoints() <= teilnehmer.getPointslist().countTotalPoints()){
                if(!copy.containsTeilnehmer(teilnehmer.getName())) {
                    highest = teilnehmer;
                }
            }
            if(teilnehmer.getTn() == null){
                Teilnehmer n = new Teilnehmer(highest.getName());
                copy.addTeilnehmer(n);
                copy.addPointsToTeilnehmer(n.getName(), highest.getPointslist().countTotalPoints());
                pos += highest.toString() + '\n';
                highest = a;
                teilnehmer = this.start;
            }else{
                teilnehmer = teilnehmer.getTn();
            }
            if(copy.countTeilnehmer() > this.countTeilnehmer()){
                break;
            }
        }
        return pos;
    }

    //fertig
    public boolean containsTeilnehmer(String tname){
        if(start.getName().toLowerCase().equals(tname.toLowerCase())) return true;
        Teilnehmer teilnehmer = start.getTn();
        while(teilnehmer != null){
            if(teilnehmer.getName().toLowerCase().equals(tname.toLowerCase())) return true;
            if(teilnehmer.getTn() == null) return false;
            else{
                teilnehmer = teilnehmer.getTn();
            }
        }
        return false;
    };

    //fertig
    @Override
    public String toString() {
        String at = "";
        Teilnehmer teilnehmer = start;
        if(start == null){
            at += "Die Liste ist leer!";
        }else{
            while(teilnehmer.getTn() != null){
                at += teilnehmer.toString()+'\n';
                teilnehmer = teilnehmer.getTn();
            }
            at += teilnehmer.toString()+'\n';
        }
        return "TeilnehmerListe{"+'\n' +
                 at +
                '}';
    }
}