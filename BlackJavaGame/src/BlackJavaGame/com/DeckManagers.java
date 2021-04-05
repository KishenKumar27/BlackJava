package BlackJavaGame.com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;

public class DeckManagers extends Cards {
    //Map that holds the deck
    private Map<Integer, String> CardDeck = new HashMap<Integer, String>();

    //Constructor
    public DeckManagers() {
    }

    //Getters and setters
    public Map<Integer, String> getCardDeck() {
        return CardDeck;
    }

    public void setCardDeck(Map<Integer, String> d) {
        CardDeck = d;
    }


    //This function shuffles the deck
    public void DeckShuffleFun() {

        Integer index = 0;
        List<String> TempList = new ArrayList<>();

        //Get all faces and shuffle them
        //Get all suits and shuffle them
        List<Character> DeckwithFaces = Arrays.asList(this.getFace());

        List<Character> DeckwithSuits = Arrays.asList(this.getSuits());

        Collections.shuffle(DeckwithFaces);

        Collections.shuffle(DeckwithSuits);

        //Store the face and suits together in a list
        for (int i = 0; i < DeckwithSuits.size(); i++) {
            for (int j = 0; j < DeckwithFaces.size(); j++) {

                TempList.add(DeckwithSuits.get(i) + "" + DeckwithFaces.get(j));
            }
        }

        //Shuffle the list with face and suits
        Collections.shuffle(TempList);

        //Storing it all in the defined map
        for (int i = 0; i < TempList.size(); i++) {
            CardDeck.put(index, TempList.get(i));
            index++;
        }


    }
}
