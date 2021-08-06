package cn.wii.factory.ifelse;

/**
 * @ClassName AwardRes
 * @Description TODO
 * @Author wii
 * @Date 2021/8/6 3:25 下午
 * @Version 1.0
 */

public class AwardRes {

    /**
     * 编码
     */
    private String code;
    /**
     * 描述
     */
    private String info;

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
