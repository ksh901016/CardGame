package javaStudy;

public class Main {
    public static void main(String[] args){
        Judge judge = new Judge();
        judge.setPlayerNum(4); // 4�� ����
        
        
        while(true){
            judge.divCards();
            boolean drawFlag = judge.judgeGame();
            
            if(!drawFlag) break; //����� ������ Ż��
        }
        
    }
}
