package domain.user;

import domain.card.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * 게임 참여자를 의미하는 객체
 */
public class Player extends User{
    private final String name;
    private final double bettingMoney;
    

    public Player(String name, double bettingMoney) {
        this.name = name;
        this.bettingMoney = bettingMoney;
    }
    
    /**
     * @return the name
     */
    
     public String getName() {
        return name;
    }
   /**
    * @return the bettingMoney
    */
   public double getBettingMoney() {
       return bettingMoney;
   }

   public double winBettingMoney(){
       return bettingMoney*2;
   }
   
   public double winBlackJackFirst(){
       return bettingMoney*1.5;
   }


}
