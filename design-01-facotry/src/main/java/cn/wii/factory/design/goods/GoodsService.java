package cn.wii.factory.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * @ClassName GoodsService
 * @Description
 * @Author wii
 * @Date 2021/8/6 5:11 下午
 * @Version 1.0
 */

public class GoodsService {
    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return true;
    }
}
