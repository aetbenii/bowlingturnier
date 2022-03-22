package bt;

public class Element implements Comparable<Element>{

    private int wert;
    Element next;

    public Element(int eg) {
        this.wert = eg;
        this.next = null;
    }

    public Element(int eg, Element next) {
        this.wert = eg;
        this.next = next;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
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
    public int compareTo(Element o) {
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
