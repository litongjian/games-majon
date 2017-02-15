package rio.game.majon.base;

import java.util.Comparator;

/**
 * Created by Administrator on 2017/2/15.
 */
public class CardComparator implements Comparator<BaseCard> {
    public int compare(BaseCard o1, BaseCard o2) {
        int rs = o1.getCardValue() - o2.getCardValue();
        return rs * -1;
    }
}
