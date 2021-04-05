package BlackJavaGame.com;

import java.util.Comparator;


//This is a comparator class used to sort the card by face and suit
public class SortBySuitFace implements Comparator<Cards> {

    @Override
    public int compare(Cards o1, Cards o2) {

        int a = o1.getFaceScore(o1.getface2()) + o1.getSuitvalue(o1.getsuit2());
        int b = o2.getFaceScore(o2.getface2()) + o2.getSuitvalue(o2.getsuit2());

        return a - b;
    }

}
