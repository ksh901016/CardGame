package javaStudy;

// ī��
public class Card {
    
    static final int KIND_MAX = 4;  // ī�� ���� ��
    static final int NUM_MAX  = 13;  // ī�� ����
    
    static final int SPADE   = 1;
    static final int DIAMOND = 2;
    static final int HEART   = 3;
    static final int CLOVER  = 4;
    
    int kind;
    int number;
    
    Card(int kind, int number){
        this.kind   = kind;
        this.number = number;
    }

    @Override
    public String toString() {
        String kind   = "";
        
        switch(this.kind){
            case 4 :
                kind = "��";
                break;
            case 3 :
                kind = "��";
                break;
            case 2 :
                kind = "��";
                break;
            case 1 :
                kind = "��";
                break;
        }
        return kind + this.number;
    }
    
    
}
