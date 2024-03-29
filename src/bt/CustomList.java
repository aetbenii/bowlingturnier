package bt;

import java.lang.annotation.ElementType;

public class CustomList {
    private Point start;

    public CustomList() {
        start = null;
    }

    public CustomList(int punkte) {
        start = new Point(punkte);
    }

    public Point getLastElement(){
        Point e = start;
        while(e.getNext() != null){
            e = e.getNext();
        }
        return e;
    }

    public void addPoints(Point e){
        if(start == null){
            start = e;
        }else{
            getLastElement().setNext(e);
        }
    }

    public void removePoint(Point e){
        Point check = start;
        if( e.getWert() != start.getWert()){
            while (check.getNext() != null) {
                if(e.getWert() == check.getNext().getWert()){
                    check.setNext(check.getNext().getNext());
                    break;
                }
                check = check.getNext();
            }
        }else{
            start = start.getNext();
        }
    }

    public int countElements(){
        int count = 1;
        Point e = start;
        if(start.getNext() == null) return 1;
        while(e.getNext() != null){
            count++;
            e = e.getNext();
        }
        return count;
    }

    // Zählt die Punkte die der Teilnehmer besitzt
    public int countTotalPoints(){
        int points = 0;
        Point e = start;
        if(start.getNext() == null) return start.getWert();
        while(e.getNext() != null){
            points += e.getWert();
            e = e.getNext();
        }
        return points += e.getWert();
    }

    @Override
    public String toString() {
        String ts = "";
        if(start.getNext() == null) return start.getWert()+"";
        Point p = start;
        while (p.getNext() != null){
            ts += p.getWert() + ",";
            p = p.getNext();
        }
        return ts + p.getWert();
    }
}