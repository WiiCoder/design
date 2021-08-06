package cn.wii.factory.design.store.impl;

import cn.wii.factory.design.coupon.CouponResult;
import cn.wii.factory.design.coupon.CouponService;
import cn.wii.factory.design.store.ICommodity;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @ClassName CardCommodityService
 * @Description TODO
 * @Author wii
 * @Date 2021/8/6 4:58 下午
 * @Version 1.0
 */

public class CardCommodityService implements ICommodity {

    private final Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    private final CouponService couponService = new CouponService();

    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uid, commodityId, bizId);
        logger.info("请求参数【优惠券】=> uid:{} commodityId:{} bizId:{} extMap:{}", uid, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果【优惠券】：{}", JSON.toJSON(couponResult));
    }
}
