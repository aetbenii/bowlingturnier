package bt;

public class Teilnehmer implements Comparable<Teilnehmer>{

    private String name;
    private Teilnehmer tv;
    private Teilnehmer tn;
    private CustomList Points;

    public Teilnehmer(String name, Teilnehmer next){
        this.name = name;
        this.tv = null;
        this.tn = next;
        Points = new CustomList();
    }

    public Teilnehmer(String name,Teilnehmer before, Teilnehmer next){
        this.name = name;
        this.tv = before;
        this.tn = next;
        Points = new CustomList();
    }



    @Override
    public String toString() {
        return "name=" + name  ;
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

    public CustomList getPoints() {
        return Points;
    }


    @Override
    public int compareTo(Teilnehmer teilnehmer) {

        // hier fehlt noch die halbe lebensgeschichte!!

        return 0;
    }
}
