package bt;

public class Teilnehmer implements Comparable<Teilnehmer>{

    private String name;
    private Teilnehmer tv;
    private Teilnehmer tn;
    private CustomList pointslist;

    public Teilnehmer(String name){
        this.name = name;
        this.tv = null;
        this.tn = null;
        pointslist = new CustomList(0);
    }

    public Teilnehmer(String name, Teilnehmer next){
        this.name = name;
        this.tv = null;
        this.tn = next;
        pointslist = new CustomList(0);
    }

    public Teilnehmer(String name,Teilnehmer before, Teilnehmer next){
        this.name = name;
        this.tv = before;
        this.tn = next;
        pointslist = new CustomList(0);
    }

//    @Override
//    public String toString() {
//        return "Teilnehmer{" +
//                "name='" + name + '\'' +
//                ", tv=" + tv +
//                ", tn=" + tn +
//                ", pointslist=" + pointslist +
//                '}';
//    }

    @Override
    public String toString() {
        return "Name: "+this.name+", Punkte Gesamt: "+this.getPointslist().countTotalPoints();
    }

    public Teilnehmer getTv() {
        return tv;
    }

    public void setTv(Teilnehmer tv) {
        this.tv = tv;
    }

    public Teilnehmer getTn() {
        return tn;
    }

    public void setTn(Teilnehmer tn) {
        this.tn = tn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomList getPointslist() {
        return pointslist;
    }


    @Override
    public int compareTo(Teilnehmer teilnehmer) {
        if(this.getPointslist().countTotalPoints() < teilnehmer.getPointslist().countTotalPoints()) return 1;
        return 0;
//        irrelevant bis jetzt... keine ahnung was ausgegeben werden soll.
//        if(this.getPointslist().countTotalPoints() == teilnehmer.getPointslist().countTotalPoints()){
//            return 0;
//        }else if(this.getPointslist().countTotalPoints() > teilnehmer.getPointslist().countTotalPoints()){
//            return 0;
//        }else if(this.getPointslist().countTotalPoints() < teilnehmer.getPointslist().countTotalPoints()){
//            return 1;
//        }
//        return 0;
    }
}
