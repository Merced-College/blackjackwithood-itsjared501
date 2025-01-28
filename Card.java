public class Card {
    
    //data variables
    //heart, ace, 11,ah.gif
    private String cardSuit;
    private String cardRank;
    private int cardValue;
    private String picName;

    //constructor
    public Card() {
        cardSuit = "hearts";
        cardRank = "ace";
        cardValue = 1;
        picName = "kd.gif";
    }

    public Card(String suit, String rank, int value, String picName) {
        cardSuit = suit;
        cardRank = rank; 
        cardValue = value; 
        this.picName = picName; 
    }

    //setters and getters (4 of each)
    public void setSuit(String suit) {
        this.cardSuit = suit;
    }
    public void setRank(String rank) {
        this.cardRank = rank;
    }
    public void setValue(int value) {
        this.cardValue = value;
    }
    public void setPicName(String picName) {
        this.picName = picName;
    }

    //getters
    public String getSuit() {
        return cardSuit;
    }
    public String getRank() {
        return cardRank;
    }
    public int getValue() {
        return cardValue;
    }
    public String getPicName() {
        return picName;
    }

    public String toString() {
        return "Suit: " + cardSuit + " Rank: " + cardRank + " Value: " + cardValue + " Picture Name: " + picName;
    }

}