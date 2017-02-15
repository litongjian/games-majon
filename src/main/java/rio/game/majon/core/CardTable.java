package rio.game.majon.core;

import rio.game.majon.base.BaseCard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/2/15.
 * 牌桌，负责洗牌、发牌
 */
public class CardTable {

    private Player[] players = new Player[4]; // 玩家

    private ArrayList<BaseCard> cardRoom = new ArrayList<BaseCard>(); // 牌库

    private ArrayList<BaseCard> cardPool = new ArrayList<BaseCard>(); // 牌池

    private BaseCard standbyCard; // 当前出的牌

    private BaseCard kingCard; // 当前王牌

    private List<BaseCard> queenCard; // 当前皮子

    /**
     * 胡牌
     * @param player
     */
    public void gameDone(Player player){
        // TODO: 2017/2/15
    }

    /**
     * 洗牌
     */
    public void washCard(){
        // TODO: 2017/2/15
    }

    /**
     * 发牌
     * @param player
     * @param num
     */
    public void pushCard(Player player,int num){
        // TODO: 2017/2/15
    }

    /**
     * 出牌
     * @param player
     * @param card
     */
    public void outCard(Player player,BaseCard card){
        // TODO: 2017/2/15
    }
}
