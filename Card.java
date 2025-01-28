public class Card {
    private String suit;
    private String rank;
    private int value;
    private String pic;

    public Card() {
        suit = "";
        rank = "";
        value = 0;
        pic = "";
    }

    public Card(String suit, String rank, int value, String pic) {
        this.suit = suit;
        this.rank = rank;
        this.value = value;
        this.pic = pic;
    }

    //setters and getters
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return "suit " + suit + "rank " + rank + "value " + value + "pic " + pic;
    }


}