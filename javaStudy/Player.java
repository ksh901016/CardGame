package javaStudy;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String id;
    private int sum;
    private List<Card> cards;
    
    Player(String id){
        this.id   = id;
        this.sum  = 0;
        cards     = new ArrayList<Card>();
    }
    
    public void setCard(Card card){
        cards.add(card);
        sum += card.number;
    }
    
    public void showCards(){
        System.out.print(id + " : ");
        for(Card card : cards){
            System.out.print(card+" ");
        }
        System.out.println();
        System.out.println("sum : "+ this.sum);
    }
    
    public void resetCards(){
        cards.clear();
    }
    
    public int getSum() {
        return sum;
    }

    public String getId() {
        return id;
    }
    
    
    
}
