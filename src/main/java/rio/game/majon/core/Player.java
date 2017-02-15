package rio.game.majon.core;

import rio.game.majon.base.BaseCard;
import rio.game.majon.base.BaseConst;
import rio.game.majon.base.CardComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Administrator on 2017/2/15.
 * 玩家对象
 */
public class Player {

    public Player(String uid) {
        this.uid = uid;
    }

    private String uid;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    private int currPosition; // 当前位置

    private int currCash = 0; // 当前积分

    private int currStatus;// 当前状态

    private ArrayList<BaseCard> handCards = new ArrayList<BaseCard>(); // 手牌

    private ArrayList<BaseCard> doneCards = new ArrayList<BaseCard>(); // 已处理的牌

    /**
     * 重置
     */
    public void restart() {
        handCards.clear();
        doneCards.clear();
        currSome = 0;
    }

    /**
     * 按筒条万风排序
     *
     * @param list
     * @return
     */
    private ArrayList<BaseCard> sort(ArrayList<BaseCard> list) {
        CardComparator cc = new CardComparator();
        ArrayList<BaseCard> rs = new ArrayList<BaseCard>();
        ArrayList<BaseCard> tmpTong = new ArrayList<BaseCard>();
        ArrayList<BaseCard> tmpTiao = new ArrayList<BaseCard>();
        ArrayList<BaseCard> tmpWan = new ArrayList<BaseCard>();
        ArrayList<BaseCard> tmpFeng = new ArrayList<BaseCard>();
        ArrayList<BaseCard> tmpQueen = new ArrayList<BaseCard>();
        ArrayList<BaseCard> tmpKing = new ArrayList<BaseCard>();
        for (BaseCard curr : list) {
            switch (curr.getCardType()) {
                case BaseConst.TONG:
                    tmpTong.add(curr);
                    break;
                case BaseConst.TIAO:
                    tmpTiao.add(curr);
                    break;
                case BaseConst.WAN:
                    tmpWan.add(curr);
                    break;
                case BaseConst.FENG:
                    tmpFeng.add(curr);
                    break;
                case BaseConst.QUEEN:
                    tmpQueen.add(curr);
                    break;
                case BaseConst.KING:
                    tmpKing.add(curr);
                    break;
                default:
                    break;
            }
        }
        batchSort(cc, tmpTong, tmpTiao, tmpWan, tmpFeng, tmpKing, tmpQueen);
        batchAdd(rs, tmpTong, tmpTiao, tmpWan, tmpFeng, tmpKing, tmpQueen);
        return rs;
    }

    private void batchAdd(List room, List... lists) {
        for (List curr : lists) {
            room.addAll(curr);
        }
    }

    private void batchSort(Comparator comp, List... lists) {
        for (List curr : lists) {
            curr.sort(comp);
        }
    }

    /**
     * 起牌
     *
     * @param card
     */
    public void addCard(BaseCard card) {
        card.setCurrPosition(this.currPosition);
        handCards.add(card);
        sort(handCards);
    }


    /**
     * 出牌
     *
     * @param uid
     * @return
     */
    public BaseCard outCard(String uid) {
        for (BaseCard curr : handCards) {
            if (curr.getUid().equals(uid)) {
                handCards.remove(curr);
                sort(handCards);
                if (curr.getCardType() == BaseConst.QUEEN) {
                    currSome += 1;
                }
                if (curr.getCardType() == BaseConst.KING) {
                    currSome += 2;
                }
                return curr;
            }
        }
        return null;
    }

    /**
     * 吃牌
     *
     * @param card
     * @param player
     */
    public boolean eatCard(BaseCard card, Player player) {
        if (getCurrPosition()==0 && player.getCurrPosition()!=3 ||getCurrPosition()-player.getCurrPosition()!=1)
            return false;
        // TODO: 2017/2/15   
        return true;
    }

    /**
     * 碰牌
     *
     * @param card
     * @param player
     */
    public boolean touchCard(BaseCard card, Player player) {
        // TODO: 2017/2/15  
        return true;
    }

    /**
     * 明杠
     *
     * @param card
     * @param player
     */
    public boolean brightCard(BaseCard card, Player player) {
        // TODO: 2017/2/15  
        return true;
    }

    /**
     * 暗杠
     *
     * @param card
     */
    public boolean darkCard(BaseCard card) {
        // TODO: 2017/2/15  
        return true;
    }


    private int currSome = 0; // 当前番数

    public int getCurrPosition() {
        return currPosition;
    }

    public void setCurrPosition(int currPosition) {
        this.currPosition = currPosition;
    }

    public int getCurrCash() {
        return currCash;
    }

    public void setCurrCash(int currCash) {
        this.currCash = currCash;
    }

    public int getCurrStatus() {
        return currStatus;
    }

    public void setCurrStatus(int currStatus) {
        this.currStatus = currStatus;
    }

    public int getCurrSome() {
        return currSome;
    }

    public void setCurrSome(int currSome) {
        this.currSome = currSome;
    }
}
