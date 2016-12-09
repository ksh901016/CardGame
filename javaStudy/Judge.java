package javaStudy;

import java.util.ArrayList;
import java.util.List;

public class Judge {
    
    final int theCardNum = 7;  // 나눠줄 카드 개수
    private List<Player> playerList = new ArrayList();
	private Deck deck = new Deck();
    
    // 플레이어 등록
    public void setPlayerNum(int num){
        System.out.println("** Player를 등록합니다. **");
        for(int i=0; i<num; i++){
            playerList.add(new Player("player"+i));
            System.out.println("** player" + i +" 님 게임 참석 **");
        }
    }
    
    // 카드나눠주기
    public void divCards(){
        // 카드뭉치를 섞는다.
        deck.shuffle();
        
        // 카드를 나눠준다.
        for(int i=0; i < (theCardNum * playerList.size()); i++){
            int turn = i % playerList.size();
            // 돌아가면서 카드 한장씩 나눠줌
            playerList.get(turn).setCard(deck.pick(i));
        }
    }
    
    // 승자 판단하기
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
                // 비기면
                drawFlag = true;
            }
            
            if(player.getSum() > winner.getSum()){
                winner = player;
            }
            
            // 카드제출
            player.resetCards();
        }
        
        if(drawFlag){
            // 비기면
            System.out.println("** 비겼습니다.**");
        }else{
            // 이기면
            System.out.println("** 승자 : " + winner.getId() + " **");
        }
        
        return drawFlag;
    }
}
