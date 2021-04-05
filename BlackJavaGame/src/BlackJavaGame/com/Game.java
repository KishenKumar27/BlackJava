package BlackJavaGame.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Game {


    //this list has all the players
    private List<Player> AllPlayers = new ArrayList<>();

    public Game() {
    }


    //Function that starts the game
    public void playGame() {

        PlayerPartforThreePlayers();
        PlayerPartforTwoPlayers();

    }


    //This method prints the scores of the players after 3 player phase
    public void ScorePrinter() {

        if (AllPlayers.get(0).getPlayerScore() > AllPlayers.get(1).getPlayerScore()
                && AllPlayers.get(0).getPlayerScore() > AllPlayers.get(2).getPlayerScore()) {
            System.out.print("\n***** " + AllPlayers.get(0).getPlayerName() + " and ");

            if (AllPlayers.get(1).getPlayerScore() > AllPlayers.get(2).getPlayerScore()) {
                System.out.println(AllPlayers.get(1).getPlayerName() + " proceed to 2-Player phase *****");
            } else if (AllPlayers.get(2).getPlayerScore() > AllPlayers.get(1).getPlayerScore()) {
                System.out.println(AllPlayers.get(2).getPlayerName() + " proceed to 2-Player phase *****");
                AllPlayers.set(1, AllPlayers.get(2));
            }
        } else if (AllPlayers.get(1).getPlayerScore() > AllPlayers.get(0).getPlayerScore()
                && AllPlayers.get(1).getPlayerScore() > AllPlayers.get(2).getPlayerScore()) {
            System.out.print("\n***** " + AllPlayers.get(1).getPlayerName() + " and ");

            if (AllPlayers.get(0).getPlayerScore() > AllPlayers.get(2).getPlayerScore()) {
                System.out.println(AllPlayers.get(0).getPlayerName() + " proceed to 2-Player phase *****");

            } else if (AllPlayers.get(2).getPlayerScore() > AllPlayers.get(0).getPlayerScore()) {
                System.out.println(AllPlayers.get(2).getPlayerName() + " proceed to 2-Player phase *****");

                AllPlayers.set(0, AllPlayers.get(2));

            }

        } else if (AllPlayers.get(2).getPlayerScore() > AllPlayers.get(0).getPlayerScore()
                && AllPlayers.get(2).getPlayerScore() > AllPlayers.get(1).getPlayerScore()) {
            System.out.print("\n***** " + AllPlayers.get(2).getPlayerName() + " and ");

            if (AllPlayers.get(0).getPlayerScore() > AllPlayers.get(1).getPlayerScore()) {
                System.out.println(AllPlayers.get(0).getPlayerName() + " proceed to 2-Player phase *****");

                AllPlayers.set(1, AllPlayers.get(2));

            } else if (AllPlayers.get(1).getPlayerScore() > AllPlayers.get(0).getPlayerScore()) {
                System.out.println(AllPlayers.get(1).getPlayerName() + " proceed to 2-Player phase *****");
                AllPlayers.set(0, AllPlayers.get(2));

            }

        }

    }

    //This method prints the scores of the players after 2 player phase
    public void ScorePrinter2() {

        if (AllPlayers.get(0).getPlayerScore() > AllPlayers.get(1).getPlayerScore()) {
            System.out.print("***** " + AllPlayers.get(0).getPlayerName() + " is the WINNER! *****");
        } else if (AllPlayers.get(1).getPlayerScore() > AllPlayers.get(0).getPlayerScore()) {
            System.out.print("***** " + AllPlayers.get(1).getPlayerName() + " is the WINNER! *****");
        } else if (AllPlayers.get(0).getPlayerScore() == AllPlayers.get(1).getPlayerScore()) {
            System.out.println("***** Both " + AllPlayers.get(0).getPlayerName() + " and " + AllPlayers.get(1).getPlayerName() + " are the WINNERS! *****");
            System.out.print("\nThe game ends in a tie.");
        }

    }


    //This method prints winner of the 2 player phase
    public void RoundWinner(int points, int points2) {

        if (points > points2) {
            System.out.println();
            System.out.println(AllPlayers.get(0).getPlayerName() + " wins this round");
            AllPlayers.get(0).setPoints(AllPlayers.get(0).getPlayerScore() + points); //edited
        } else if (points2 > points) {
            System.out.println();
            System.out.println(AllPlayers.get(1).getPlayerName() + " wins this round");
            AllPlayers.get(1).setPoints(AllPlayers.get(1).getPlayerScore() + points2);
        } else if (points == points2) {
            System.out.println();
            System.out.println(AllPlayers.get(0).getPlayerName() + " and " + AllPlayers.get(1).getPlayerName() + " win this round");
            AllPlayers.get(0).setPoints(AllPlayers.get(0).getPlayerScore() + points);
            AllPlayers.get(1).setPoints(AllPlayers.get(1).getPlayerScore() + points2);
        }

        System.out.println();
        System.out.println("Score: ");
        System.out.println(AllPlayers.get(0).getPlayerName() + ": " + AllPlayers.get(0).getPlayerScore());
        System.out.println(AllPlayers.get(1).getPlayerName() + ": " + AllPlayers.get(1).getPlayerScore());
        System.out.println();

    }


    //This method prints winner of the 3 player phase
    public void RoundWinner2(int points, int points2, int points3) {

        if (points > points2 && points > points3) {
            System.out.println();
            System.out.println(AllPlayers.get(0).getPlayerName() + " wins this round");
            AllPlayers.get(0).setPoints(AllPlayers.get(0).getPlayerScore() + points); //edited
        } else if (points2 > points && points2 > points3) {
            System.out.println();
            System.out.println(AllPlayers.get(1).getPlayerName() + " wins this round");
            AllPlayers.get(1).setPoints(AllPlayers.get(1).getPlayerScore() + points2);
        } else if (points3 > points && points3 > points2) {
            System.out.println();
            System.out.println(AllPlayers.get(2).getPlayerName() + " wins this round");
            AllPlayers.get(2).setPoints(AllPlayers.get(2).getPlayerScore() + points3);
        } else if ((points == points2) && (points2 == points3)) {
            System.out.println();
            System.out.println(AllPlayers.get(0).getPlayerName() + ", " + AllPlayers.get(1).getPlayerName() + " and " + AllPlayers.get(2).getPlayerName() + " win this round");
            AllPlayers.get(0).setPoints(AllPlayers.get(0).getPlayerScore() + points);
            AllPlayers.get(1).setPoints(AllPlayers.get(1).getPlayerScore() + points2);
            AllPlayers.get(2).setPoints(AllPlayers.get(2).getPlayerScore() + points3);
        } else if (points == points2) {
            System.out.println();
            System.out.println(AllPlayers.get(0).getPlayerName() + " and " + AllPlayers.get(1).getPlayerName() + " win this round");
            AllPlayers.get(0).setPoints(AllPlayers.get(0).getPlayerScore() + points);
            AllPlayers.get(1).setPoints(AllPlayers.get(1).getPlayerScore() + points2);
        } else if (points == points3) {
            System.out.println();
            System.out.println(AllPlayers.get(0).getPlayerName() + " and " + AllPlayers.get(2).getPlayerName() + " win this round");
            AllPlayers.get(0).setPoints(AllPlayers.get(0).getPlayerScore() + points);
            AllPlayers.get(2).setPoints(AllPlayers.get(2).getPlayerScore() + points2);
        } else if (points2 == points3) {
            System.out.println();
            System.out.println(AllPlayers.get(1).getPlayerName() + " and " + AllPlayers.get(2).getPlayerName() + " win this round");
            AllPlayers.get(1).setPoints(AllPlayers.get(1).getPlayerScore() + points);
            AllPlayers.get(2).setPoints(AllPlayers.get(2).getPlayerScore() + points2);
        }


        //Printing the final scores
        System.out.println();
        System.out.println("Score: ");
        System.out.println(AllPlayers.get(0).getPlayerName() + " = " + AllPlayers.get(0).getPlayerScore());
        System.out.println(AllPlayers.get(1).getPlayerName() + " = " + AllPlayers.get(1).getPlayerScore());
        System.out.println(AllPlayers.get(2).getPlayerName() + " = " + AllPlayers.get(2).getPlayerScore());
        System.out.println();
    }


    //This function assigns cards in 2 player phase
    public void CardAssigner2(DeckManagers D) {
        int i = 0;

        for (Map.Entry<Integer, String> entry : D.getCardDeck().entrySet()) {
            String cardforPlayer = entry.getValue() + "";
            if (i < 26)
                AllPlayers.get(0).cards.add(cardforPlayer);
            else if (i >= 26 && i < 52)
                AllPlayers.get(1).cards.add(cardforPlayer);

            i++;
        }

    }


    //This function prints the total points gained per round by cards at hand
    public int PointsPrinter(char[] suit, char[] face, int club, int spade, int diamond, int hearts, int index) {
        for (int j = 0; j < 5; j++) {
            if (suit[j] == 'c')
                club += getPoints(face[j]);
            else if (suit[j] == 'd')
                diamond += getPoints(face[j]);
            else if (suit[j] == 'h')
                hearts += getPoints(face[j]);
            else if (suit[j] == 's')
                spade += getPoints(face[j]);
        }

        int points = HighestVal(club, diamond, hearts, spade);
        System.out.println(" | Point = " + points);

        return points;
    }


    //This function returns the value of Face
    public int getPoints(char Face) {

        int temp = 0;
        if (Face == 'A')
            temp = 1;
        else if (Face == 'X' || Face == 'J' || Face == 'Q' || Face == 'K')
            temp = 10;
        else {
            temp = Integer.parseInt(Face + "");
        }
        return temp;
    }


    //This function checks which suit has the highest value among the cards at hand
    public int HighestVal(int club, int diamonspades, int heartspades, int spades) {
        int total = 0;

        if (club >= diamonspades && club >= heartspades && club >= spades) {
            total = club;
        } else if (diamonspades >= club && diamonspades >= heartspades && diamonspades >= spades) {
            total = diamonspades;
        } else if (heartspades >= club && heartspades >= diamonspades && heartspades >= spades) {
            total = heartspades;
        } else if (spades >= club && spades >= heartspades && spades >= diamonspades) {
            total = spades;
        }
        return total;
    }


    //This function assigns cards to each player and prints the available cards
    public void CardManager(boolean flag) {

        //True is for 3 player phase
        if (flag == true) {

            //Clearing the deck in case shuffle is used
            if (AllPlayers.get(0).cards.size() > 0 && AllPlayers.get(1).cards.size() > 0 && AllPlayers.get(2).cards.size() > 0) {
                AllPlayers.get(0).cards.clear();

                AllPlayers.get(1).cards.clear();

                AllPlayers.get(2).cards.clear();
            }

            DeckManagers D = new DeckManagers();
            D.DeckShuffleFun();
            int i = 0;

            //Card Assigning to each player
            for (Map.Entry<Integer, String> entry : D.getCardDeck().entrySet()) {
                String cardforPlayer = entry.getValue() + "";
                if (i < 18)
                    AllPlayers.get(0).cards.add(cardforPlayer);
                else if (i >= 18 && i < 35)
                    AllPlayers.get(1).cards.add(cardforPlayer);
                else if (i >= 35 && i <= 51)
                    AllPlayers.get(2).cards.add(cardforPlayer);

                i++;
            }

            //Printing available cards
            System.out.println("\nAvailable Cards:");
            Iterator IteratorVal = AllPlayers.get(0).getCards().iterator();
            i = 1;
            System.out.print(AllPlayers.get(0).getPlayerName() + ": ");
            while (IteratorVal.hasNext()) {
                System.out.print(IteratorVal.next() + " ");
                if (i % 5 == 0) {
                    System.out.print(", ");
                }
                i++;
            }
            System.out.println();

            IteratorVal = AllPlayers.get(1).getCards().iterator();
            i = 1;
            System.out.print(AllPlayers.get(1).getPlayerName() + ": ");
            while (IteratorVal.hasNext()) {
                System.out.print(IteratorVal.next() + " ");
                if (i % 5 == 0) {
                    System.out.print(", ");
                }
                i++;
            }

            System.out.println();

            IteratorVal = AllPlayers.get(2).getCards().iterator();
            i = 1;
            System.out.print(AllPlayers.get(2).getPlayerName() + ": ");
            while (IteratorVal.hasNext()) {
                System.out.print(IteratorVal.next() + " ");
                if (i % 5 == 0) {
                    System.out.print(", ");
                }
                i++;
            }

            System.out.println();
        }

        //False is for 2 player phase
        else if (flag == false) {

            //Clearing the deck
            if (AllPlayers.get(0).cards.size() > 0 && AllPlayers.get(1).cards.size() > 0) {
                AllPlayers.get(0).cards.clear();

                AllPlayers.get(1).cards.clear();

            }

            DeckManagers D = new DeckManagers();
            D.DeckShuffleFun();

            int i = 0;

            CardAssigner2(D);

            System.out.println("\nAvailable Cards:");
            Iterator IteratorVal = AllPlayers.get(0).getCards().iterator();
            i = 1;
            System.out.print(AllPlayers.get(0).getPlayerName() + ": ");
            while (IteratorVal.hasNext()) {
                System.out.print(IteratorVal.next() + " ");
                if (i % 5 == 0) {
                    System.out.print(", ");
                }
                i++;
            }
            System.out.println();

            IteratorVal = AllPlayers.get(1).getCards().iterator();
            i = 1;
            System.out.print(AllPlayers.get(1).getPlayerName() + ": ");
            while (IteratorVal.hasNext()) {
                System.out.print(IteratorVal.next() + " ");
                if (i % 5 == 0) {
                    System.out.print(", ");
                }
                i++;
            }

            System.out.println();

        }

    }

    //Main method for 3 player phase
    public void PlayerPartforThreePlayers() {

        Scanner in = new Scanner(System.in);

        System.out.println("******************");
        System.out.println("* 3 Player Phase *");
        System.out.println("******************");

        // Getting the Names of the players
        System.out.print("Enter player 1 name: ");
        String PlayerName = in.nextLine();
        Player player = new Player(1, PlayerName);
        AllPlayers.add(player);

        System.out.print("Enter player 2 name: ");
        PlayerName = in.nextLine();
        player = new Player(2, PlayerName);
        AllPlayers.add(player);

        System.out.print("Enter player 3 name: ");
        PlayerName = in.nextLine();
        player = new Player(3, PlayerName);
        AllPlayers.add(player);

        // True is used for three players
        CardManager(true);

        String UserInput = "A";
        System.out.println("\nPress S to Shuffle or ENTER to start.");
        UserInput = in.nextLine();

        //Taking user input for enter or shuffle
        if (UserInput.equals("")) {
            System.out.println("<Enter is pressed>");
            System.out.println();
            UserInput = "A";
        }

        while (UserInput.charAt(0) == 'S' || UserInput.charAt(0) == 's') {
            CardManager(true);
            System.out.println("\nPress S to Shuffle or ENTER to start.");

            UserInput = in.nextLine();
            if (UserInput.equals("")) {
                System.out.println("<Enter is pressed>");
                System.out.println();
                UserInput = "A"; //breaks out of loop
            }
        }

        List<Cards> ListCards = new ArrayList<Cards>();

        int counterss = 1;

        //counterss is 3 as there are 3 rounds
        while (counterss <= 3) {
            System.out.println("\n*** Round " + counterss + " ***");
            System.out.println("Cards at Hand:");

            Iterator IteratorVal2 = AllPlayers.get(0).getCards().iterator();

            //Setting min and high value for printing the cards at hand
            int MinVal = 0, HighestVal = 0;
            int i = 0;
            if (counterss == 1) {
                MinVal = 0;
                HighestVal = 4;
            } else if (counterss == 2) {
                MinVal = 5;
                HighestVal = 9;
            } else if (counterss == 3) {
                MinVal = 10;
                HighestVal = 14;
            }

            System.out.print(AllPlayers.get(0).getPlayerName() + ": ");
            int counter = 0;
            int d = 0, c = 0, h = 0, s = 0;
            char[] suit = new char[5];
            char[] face = new char[5];

            //Printing cards and calculating the score for all players
            while (IteratorVal2.hasNext()) {

                if (i >= MinVal && i <= HighestVal) {

                    String cardsIteratorVal = IteratorVal2.next() + "";
                    suit[counter] = cardsIteratorVal.charAt(0);
                    face[counter] = cardsIteratorVal.charAt(1);

                    Cards C = new Cards(suit[counter], face[counter]);
                    ListCards.add(C);

                    counter++;

                } else
                    IteratorVal2.next();
                if (i > HighestVal)
                    break;

                i++;
            }

            Collections.sort(ListCards, new SortBySuitFace());

            for (int k = 0; k < ListCards.size(); k++)
                System.out.print(ListCards.get(k).toString() + " ");

            ListCards.clear();

            int points = PointsPrinter(suit, face, c, s, d, h, 0);

            d = 0;
            c = 0;
            h = 0;
            s = 0;
            counter = 0;
            IteratorVal2 = AllPlayers.get(1).getCards().iterator();
            i = 0;
            System.out.print(AllPlayers.get(1).getPlayerName() + ": ");
            while (IteratorVal2.hasNext()) {
                if (i >= MinVal && i <= HighestVal) {

                    String cardsIteratorVal = IteratorVal2.next() + "";
                    suit[counter] = cardsIteratorVal.charAt(0);
                    face[counter] = cardsIteratorVal.charAt(1);

                    Cards C = new Cards(suit[counter], face[counter]);
                    ListCards.add(C);

                    counter++;

                } else
                    IteratorVal2.next();
                if (i > HighestVal)
                    break;
                i++;
            }

            Collections.sort(ListCards, new SortBySuitFace());

            for (int k = 0; k < ListCards.size(); k++)
                System.out.print(ListCards.get(k).toString() + " ");

            ListCards.clear();

            int points2 = PointsPrinter(suit, face, c, s, d, h, 1);

            d = 0;
            c = 0;
            h = 0;
            s = 0;

            counter = 0;
            IteratorVal2 = AllPlayers.get(2).getCards().iterator();
            i = 0;
            System.out.print(AllPlayers.get(2).getPlayerName() + ": ");
            while (IteratorVal2.hasNext()) {
                if (i >= MinVal && i <= HighestVal) {

                    String cardsIteratorVal = IteratorVal2.next() + "";
                    suit[counter] = cardsIteratorVal.charAt(0);
                    face[counter] = cardsIteratorVal.charAt(1);

                    Cards C = new Cards(suit[counter], face[counter]);
                    ListCards.add(C);

                    counter++;

                } else
                    IteratorVal2.next();
                if (i > HighestVal)
                    break;
                i++;
            }

            Collections.sort(ListCards, new SortBySuitFace());

            for (int k = 0; k < ListCards.size(); k++)
                System.out.print(ListCards.get(k).toString() + " ");

            ListCards.clear();

            int points3 = PointsPrinter(suit, face, c, s, d, h, 2);

            //Printing the winner of the round
            RoundWinner2(points, points2, points3);

            System.out.println("Available Cards:");
            Iterator IteratorVal = AllPlayers.get(0).getCards().iterator();
            i = 1;
            int starter = 0;
            if (counterss == 1)
                starter = 6;
            else if (counterss == 2)
                starter = 11;
            else
                starter = 16;

            System.out.print(AllPlayers.get(0).getPlayerName() + ": ");
            while (IteratorVal.hasNext()) {
                if (i >= starter) {
                    System.out.print(IteratorVal.next() + " ");

                    if (i % 5 == 0 && i > starter) {
                        System.out.print(", ");
                    }

                } else
                    IteratorVal.next();
                i++;
            }
            System.out.println();

            IteratorVal = AllPlayers.get(1).getCards().iterator();
            i = 1;
            System.out.print(AllPlayers.get(1).getPlayerName() + ": ");
            while (IteratorVal.hasNext()) {
                if (i >= starter) {
                    System.out.print(IteratorVal.next() + " ");

                    if (i % 5 == 0 && i > starter) {
                        System.out.print(", ");
                    }

                } else
                    IteratorVal.next();
                i++;
            }

            System.out.println();

            IteratorVal = AllPlayers.get(2).getCards().iterator();
            i = 1;
            System.out.print(AllPlayers.get(2).getPlayerName() + ": ");
            while (IteratorVal.hasNext()) {
                if (i >= starter) {
                    System.out.print(IteratorVal.next() + " ");

                    if (i % 5 == 0 && i > starter) {
                        System.out.print(", ");
                    }

                } else
                    IteratorVal.next();

                i++;

            }

            System.out.println();
            System.out.println();


            counterss++;

        }

        ScorePrinter();

        //the losing player is set to 2nd index and it is removed before starting 2 player phase
        AllPlayers.remove(2);

    }

    //Main method for 2 player phase. Follows the same structure as three player phase
    public void PlayerPartforTwoPlayers() {
        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println();
        System.out.println("******************");
        System.out.println("* 2-Player Phase *");
        System.out.println("******************");

        CardManager(false);

        String UserInput = "A";
        System.out.println();
        System.out.println("Press S to Shuffle or ENTER to start.");
        UserInput = in.nextLine();

        //taking user input for shuffle or enter
        if (UserInput.equals("")) {
            System.out.println("<Enter is pressed>");
            System.out.println();
            UserInput = "A";
        }

        while (UserInput.charAt(0) == 'S' || UserInput.charAt(0) == 's') {
            CardManager(false);
            System.out.println("\nPress S to Shuffle or ENTER to start.");

            UserInput = in.nextLine();
            if (UserInput.equals("")) {
                System.out.println("<Enter is pressed>");
                System.out.println();
                UserInput = "A"; //breaks out of loop
            }

        }

        int counterss = 1;

        //2 player phase has 4 rounds in total
        while (counterss <= 4) {
            System.out.println("\n*** Round " + counterss + " ***");
            System.out.println("Cards at Hand:");

            Iterator IteratorVal2 = AllPlayers.get(0).getCards().iterator();

            int MinVal = 0, HighestVal = 0;
            int i = 0;
            if (counterss == 1) {
                MinVal = 0;
                HighestVal = 4;
            } else if (counterss == 2) {
                MinVal = 5;
                HighestVal = 9;
            } else if (counterss == 3) {
                MinVal = 10;
                HighestVal = 14;
            } else if (counterss == 4) {
                MinVal = 15;
                HighestVal = 19;
            }

            System.out.print(AllPlayers.get(0).getPlayerName() + ": ");
            int counter = 0;
            int d = 0, c = 0, h = 0, s = 0;
            char[] suit = new char[5];
            char[] face = new char[5];

            List<Cards> ListCards = new ArrayList<>();
            while (IteratorVal2.hasNext()) {

                if (i >= MinVal && i <= HighestVal) {

                    String cardsIteratorVal = IteratorVal2.next() + "";
                    suit[counter] = cardsIteratorVal.charAt(0);
                    face[counter] = cardsIteratorVal.charAt(1);

                    Cards C = new Cards(suit[counter], face[counter]);
                    ListCards.add(C);

                    counter++;

                } else
                    IteratorVal2.next();
                if (i > HighestVal)
                    break;

                i++;
            }

            Collections.sort(ListCards, new SortBySuitFace());

            for (int k = 0; k < ListCards.size(); k++)
                System.out.print(ListCards.get(k).toString() + " ");

            ListCards.clear();

            int points = PointsPrinter(suit, face, c, s, d, h, 0);

            d = 0;
            c = 0;
            h = 0;
            s = 0;
            counter = 0;
            IteratorVal2 = AllPlayers.get(1).getCards().iterator();
            i = 0;
            System.out.print(AllPlayers.get(1).getPlayerName() + ": ");
            while (IteratorVal2.hasNext()) {
                if (i >= MinVal && i <= HighestVal) {

                    String cardsIteratorVal = IteratorVal2.next() + "";
                    suit[counter] = cardsIteratorVal.charAt(0);
                    face[counter] = cardsIteratorVal.charAt(1);

                    Cards C = new Cards(suit[counter], face[counter]);
                    ListCards.add(C);

                    counter++;

                } else
                    IteratorVal2.next();
                if (i > HighestVal)
                    break;
                i++;
            }

            Collections.sort(ListCards, new SortBySuitFace());

            for (int k = 0; k < ListCards.size(); k++)
                System.out.print(ListCards.get(k).toString() + " ");

            ListCards.clear();

            int points2 = PointsPrinter(suit, face, c, s, d, h, 1);

            RoundWinner(points, points2);

            System.out.println("Available Cards:");
            Iterator IteratorVal = AllPlayers.get(0).getCards().iterator();
            i = 1;
            int starter = 0;
            if (counterss == 1)
                starter = 6;
            else if (counterss == 2)
                starter = 11;
            else if (counterss == 3)
                starter = 16;
            else
                starter = 21;
            System.out.print(AllPlayers.get(0).getPlayerName() + ": ");
            while (IteratorVal.hasNext()) {
                if (i >= starter) {
                    System.out.print(IteratorVal.next() + " ");

                    if (i % 5 == 0 && i > starter) {
                        System.out.print(", ");
                    }

                } else
                    IteratorVal.next();
                i++;
            }
            System.out.println();

            IteratorVal = AllPlayers.get(1).getCards().iterator();
            i = 1;
            System.out.print(AllPlayers.get(1).getPlayerName() + ": ");
            while (IteratorVal.hasNext()) {
                if (i >= starter) {
                    System.out.print(IteratorVal.next() + " ");

                    if (i % 5 == 0 && i > starter) {
                        System.out.print(", ");
                    }

                } else
                    IteratorVal.next();
                i++;
            }

            System.out.println();
            System.out.println();

            counterss++;

        }

        ScorePrinter2();

    }
}
