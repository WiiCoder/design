package cn.wii.factory.design.coupon;

/**
 * @ClassName CouponService
 * @Description TODO
 * @Author wii
 * @Date 2021/8/6 5:02 下午
 * @Version 1.0
 */

public class CouponService {
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
