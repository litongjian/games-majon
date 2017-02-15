package rio.game.majon.base;

import rio.game.majon.core.Player;

/**
 * Created by Administrator on 2017/2/15.
 * 规则接口
 */
public interface BaseRules {

    /**
     * 计算玩家手牌胡牌的牌型及基础值
     * @param player
     * @return
     */
    int procBasePay(Player player);
}
