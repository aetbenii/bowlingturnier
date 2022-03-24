package bt;

public class Teilnehmer implements Comparable<Teilnehmer>{

    private String name;
    private Teilnehmer tv;
    private Teilnehmer tn;
    private CustomList pointslist;

    public Teilnehmer(String name, Teilnehmer next){
        this.name = name;
        this.tv = null;
        this.tn = next;
        pointslist = new CustomList();
    }

    public Teilnehmer(String name,Teilnehmer before, Teilnehmer next){
        this.name = name;
        this.tv = before;
        this.tn = next;
        pointslist = new CustomList();
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

//    @Override
//    public String toString() {
//        if(this.getPointslist() != null){
//            return "Teilnehmer{" +
//                    "name='" + name + '\''+this.getPointslist().countPoints();
//        }else{
//            return "Teilnehmer{" +
//                    "name='" + name + '\'';
//        }
//    }

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

        // hier fehlt noch die halbe lebensgeschichte!!

        return 0;
    }
}
