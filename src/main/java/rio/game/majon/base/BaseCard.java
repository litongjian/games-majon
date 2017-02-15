package rio.game.majon.base;

/**
 * Created by Administrator on 2017/2/15.
 * 基础牌对象
 */
public class BaseCard {

    private String uid;// 临时KEY

    private int cardType;// 类型

    private int cardValue;// 值

    private int cardStatus;// 状态

    private int currPosition;// 所属位置

    public int getCurrPosition() {
        return currPosition;
    }



    public String getUid() {
        return uid;
    }

    public BaseCard(String uid) {
        this.uid = uid;
    }

    public void setCurrPosition(int currPosition) {
        this.currPosition = currPosition;
    }

    public int getCardType() {
        return cardType;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public int getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(int cardStatus) {
        this.cardStatus = cardStatus;
    }

}
