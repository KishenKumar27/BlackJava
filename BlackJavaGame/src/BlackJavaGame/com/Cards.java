package BlackJavaGame.com;


public class Cards {

    //Arrays holding all suits and faces
    private Character[] Suit = {'d', 'c', 'h', 's'};
    private Character[] Faces = {'5', '6', '7', '8', '9', 'A', '2', '3', '4', 'X', 'J', 'Q', 'K'};


    //Attributes to hold a single suit and face
    private char suit;
    private char face;

    //Constructors
    public Cards() {

    }

    public Cards(char s, char f) {
        suit = s;
        face = f;
    }


    //getters and setters
    public char getface2() {
        return face;
    }

    public char getsuit2() {
        return suit;
    }

    public Character[] getFace() {
        return Faces;
    }

    public Character[] getSuits() {
        return Suit;
    }

    public void setSuits(Character[] suits) {
        Suit = suits;
    }

    public void setFace(Character[] face) {
        Faces = face;
    }


    //Get the score of the face value provided as parameter
    public int getFaceScore(Character face) {

        if (face == 'A')
            return 1;
        else if (face == 'X')
            return 10;
        else if (face == 'J')
            return 11;
        else if (face == 'Q')
            return 12;
        else if (face == 'K')
            return 13;
        else {
            return Character.getNumericValue(face);
        }

    }

    //Get the score of the suit value provided as a parameter
    public int getSuitvalue(Character Suit) {

        if (Suit == 'c')
            return 1000;
        else if (Suit == 'd')
            return 2000;
        else if (Suit == 'h')
            return 3000;
        else if (Suit == 's')
            return 4000;

        return 0;

    }

    //Overridden tostring function
    @Override
    public String toString() {
        String c = Character.toString(suit);
        c += Character.toString(face);
        return c;

    }

}
