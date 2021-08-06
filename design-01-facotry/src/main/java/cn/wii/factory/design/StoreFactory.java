package cn.wii.factory.design;

import cn.wii.factory.CommodityType;
import cn.wii.factory.design.store.ICommodity;
import cn.wii.factory.design.store.impl.CardCommodityService;
import cn.wii.factory.design.store.impl.CouponCommodityService;
import cn.wii.factory.design.store.impl.GoodsCommodityService;

/**
 * @ClassName StoreFactory
 * @Description TODO
 * @Author wii
 * @Date 2021/8/6 4:56 下午
 * @Version 1.0
 */

public class StoreFactory {
    
    public ICommodity getCommodityService(Integer commodityType) {
        CommodityType type = CommodityType.match(commodityType);
        if (null == type) {
            throw new RuntimeException("不存在该种类商品");
        }
        switch (type) {
            case CARD:
                return new CardCommodityService();
            case GOODS:
                return new GoodsCommodityService();
            default:
                return new CouponCommodityService();
        }
    }
}
