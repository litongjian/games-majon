package rio.game.majon.core;

import rio.game.majon.base.BaseCard;
import rio.game.majon.base.BaseConst;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Administrator on 2017/2/15.
 * 牌桌，负责洗牌、发牌
 */
public class CardTable {

    private final int[] types = {0,1,2,3};

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

    private boolean checkWash(BaseCard card){
        int times = 0;
        for (BaseCard tmp:cardRoom){
            times += tmp.compCard(card)?1:0;
        }
        return times < 4;
    }

    private BaseCard createRandomCard(){
        BaseCard card = new BaseCard(UUID.randomUUID().toString());
        Random rd = new Random();
        int tmp = rd.nextInt(4);
        card.setCardType(tmp);
        if (tmp == BaseConst.FENG){
            card.setCardValue(rd.nextInt(7));
        }else {
            card.setCardValue(rd.nextInt(9));
        }
        return card;
    }

    /**
     * 洗牌
     */
    public void washCard(){
        while (cardRoom.size()<144){
            BaseCard card = createRandomCard();
            if (checkWash(card)){
                cardRoom.add(card);
            }
        }
        System.out.println(cardRoom);
    }

    public static void main(String... args){
        CardTable ct = new CardTable();
        ct.washCard();
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
