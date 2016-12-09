package javaStudy;

// Ä«µå µ¦
public class Deck {
    final int CARD_NUM = 52;
    Card[] card = new Card[CARD_NUM];
    
    Deck(){
        int k = 0; 
        for(int i = Card.KIND_MAX; i > 0; i --){
            for(int j = Card.NUM_MAX; j > 0; j--){
                card[k++] = new Card(i, j);
            }
        }
    }
    
    // Ä«µå¼¯±â
    public void shuffle(){
        System.out.println("** card shuffle **");
        for(int i=0; i<1000; i++){
            int tempNo = (int)(Math.random() * CARD_NUM);
            Card temp    = card[0];
            card[0]      = card[tempNo];
            card[tempNo] = temp;
        }
    }
    
    public Card pick(int i){
        return card[i];
    }
}
