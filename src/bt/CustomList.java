package bt;

public class CustomList {
    private Element start;

    public CustomList() {
        start = null;
    }

    public CustomList(int eg) {
        start = new Element(eg);
    }

    public Element getLastElement(){
        Element e = start;
        while(e.getNext() != null){
            e = e.getNext();
        }
        return e;
    }

    public void addElement(Element e){
        if(start == null){
            start = e;
        }else{
            getLastElement().setNext(e);
        }
    }

    public void removeElement(Element e){
        Element check = start;
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
        Element e = start;
        if(start.getNext() == null){
            return 1;
        }
        while(e.getNext() != null){
            count++;
            e = e.getNext();
        }
        return count;
    }

    // Zählt die Punkte die der Teilnehmer besitzt
    public int countPoints(){
        // !!!!!!!!!!!!!!!!!!!!!!!!
        //noch nicht gemacht
        return 0;
    }

    public boolean containsElement(Element e){


        return false;
    }

}
