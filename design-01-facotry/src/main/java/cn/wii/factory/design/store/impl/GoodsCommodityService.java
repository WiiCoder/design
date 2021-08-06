package cn.wii.factory.design.store.impl;

import cn.wii.factory.design.card.IQiYiCardService;
import cn.wii.factory.design.store.ICommodity;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @ClassName GoodsCommodityService
 * @Description TODO
 * @Author wii
 * @Date 2021/8/6 4:59 下午
 * @Version 1.0
 */

public class GoodsCommodityService implements ICommodity {

    private final Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    // 模拟注入
    private final IQiYiCardService iQiYiCardService = new IQiYiCardService();

    @Override
    public void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uid);
        iQiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uid, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }

}
