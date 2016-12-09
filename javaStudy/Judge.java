package javaStudy;

import java.util.ArrayList;
import java.util.List;

public class Judge {
    
    final int theCardNum = 7;  // ������ ī�� ����
    private List<Player> playerList = new ArrayList();
	private Deck deck = new Deck();
    
    // �÷��̾� ���
    public void setPlayerNum(int num){
        System.out.println("** Player�� ����մϴ�. **");
        for(int i=0; i<num; i++){
            playerList.add(new Player("player"+i));
            System.out.println("** player" + i +" �� ���� ���� **");
        }
    }
    
    // ī�峪���ֱ�
    public void divCards(){
        // ī�并ġ�� ���´�.
        deck.shuffle();
        
        // ī�带 �����ش�.
        for(int i=0; i < (theCardNum * playerList.size()); i++){
            int turn = i % playerList.size();
            // ���ư��鼭 ī�� ���徿 ������
            playerList.get(turn).setCard(deck.pick(i));
        }
    }
    
    // ���� �Ǵ��ϱ�
    public boolean judgeGame(){
        boolean drawFlag = false;
        boolean first    = true;
        Player winner    = null;;
        
        for(Player player : playerList){
            player.showCards();
            if(first){
                winner = player;
                first = false;
                continue;
            }
            
            if(player.getSum() == winner.getSum()){
                // ����
                drawFlag = true;
            }
            
            if(player.getSum() > winner.getSum()){
                winner = player;
            }
            
            // ī������
            player.resetCards();
        }
        
        if(drawFlag){
            // ����
            System.out.println("** �����ϴ�.**");
        }else{
            // �̱��
            System.out.println("** ���� : " + winner.getId() + " **");
        }
        
        return drawFlag;
    }
}
