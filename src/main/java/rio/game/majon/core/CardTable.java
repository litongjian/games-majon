package rio.game.majon.core;

import rio.game.majon.base.BaseCard;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/2/15.
 * 牌桌，负责洗牌、发牌
 */
public class CardTable {

    private ArrayList<BaseCard> cardRoom = new ArrayList<BaseCard>(); // 牌库

    private ArrayList<BaseCard> cardPool = new ArrayList<BaseCard>(); // 牌池
}
