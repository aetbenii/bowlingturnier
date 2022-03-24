package bt;

public class Point implements Comparable<Point>{


    //glaube Element muss ich zu Punkte umbenennen und es nur aus int machen.


    private int wert;
    Point next;

    public Point(int eg) {
        this.wert = eg;
        this.next = null;
    }

    public Point(int eg, Point next) {
        this.wert = eg;
        this.next = next;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public Point getNext() {
        return next;
    }

    public void setNext(Point next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Element{" +
                "wert=" + wert +
                ", next=" + next +
                '}';
    }

    @Override
    public int compareTo(Point o) {
        try {
            if(this.getWert() == o.getWert() && this.getNext().getWert() == o.getNext().getWert()){
                return 1;
            }
        } catch (Exception e){
            return 0;
        }
        return 0;

    }
}
