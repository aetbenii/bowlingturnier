package bt;

public class TeilnehmerListe {

    private Teilnehmer start;

    public TeilnehmerListe(){
        start = null;
    }



    public void addTeilnehmer(Teilnehmer t){

        if(start == null){
            start = t;

        }else{
            Teilnehmer teilnehmer = start;

            while (teilnehmer.getTn() != null) {
                if(teilnehmer.getName().equals(t.getName())){
                    System.out.println("Dieser Name wird schon verwendet!");
                    break;
                }

                teilnehmer = teilnehmer.getTn();
            }
            teilnehmer.setTn(t);
        }
    }

    public int countTeilnehmer(){
        int count = 1;
        Teilnehmer t = start;
        if(start.getTn() == null){
            return 1;
        }
        while(t.getTn() != null){
            count++;
            t = t.getTn();
        }
        return count;
    }

}
