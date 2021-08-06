package cn.wii.factory;

/**
 * @ClassName CommodityType
 * @Description
 * @Author wii
 * @Date 2021/8/6 5:22 下午
 * @Version 1.0
 */

public enum CommodityType {
    /**
     *
     */
    COUPON(1, "优惠券"),
    GOODS(2, "实物商品"),
    CARD(3, "兑换卡");

    private final Integer code;
    private final String desc;

    CommodityType(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static CommodityType match(Integer code) {
        for (CommodityType item : CommodityType.values()) {
            if (item.getCode().equals(code)) {
                return item;
            }
        }
        return null;
    }
}
