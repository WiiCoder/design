package cn.wii.factory.design.store;

import java.util.Map;

/**
 * @ClassName ICommodity
 * @Description TODO
 * @Author wii
 * @Date 2021/8/6 4:56 下午
 * @Version 1.0
 */

public interface ICommodity {

    void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
