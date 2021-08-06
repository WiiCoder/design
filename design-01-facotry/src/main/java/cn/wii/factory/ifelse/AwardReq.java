package cn.wii.factory.ifelse;

import java.util.Map;

/**
 * @ClassName AwardReq
 * @Description TODO
 * @Author wii
 * @Date 2021/8/6 3:25 下午
 * @Version 1.0
 */

public class AwardReq {

    /**
     * 用户唯一ID
     */
    private String uid;
    /**
     * 奖品类型 1、优惠券，2、实物商品，3、第三方兑换卡
     */
    private Integer awardType;
    /**
     * 奖品编号：sku、couponNumber、carId
     */
    private String awardNumber;
    /**
     * 业务ID、防重复
     */
    private String bizId;
    /**
     * 拓展信息
     */
    private Map<String,String> extMap;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Integer getAwardType() {
        return awardType;
    }

    public void setAwardType(Integer awardType) {
        this.awardType = awardType;
    }

    public String getAwardNumber() {
        return awardNumber;
    }

    public void setAwardNumber(String awardNumber) {
        this.awardNumber = awardNumber;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }
}
