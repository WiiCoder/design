package cn.wii.factory.design.card;

/**
 * @ClassName IQiYiCardService
 * @Description
 * @Author wii
 * @Date 2021/8/6 5:10 下午
 * @Version 1.0
 */

public class IQiYiCardService {
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
