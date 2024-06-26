package edu.xmu.smarthome.entity;

import lombok.Getter;

/**
 * 返回JSON数据封装类
 */
@Getter
public class ResultInfo {
    private final boolean flag;
    private final Object data;
    private final String errMsg;

    private ResultInfo(boolean flag, Object data, String errMsg) {
        this.flag = flag;
        this.data = data;
        this.errMsg = errMsg;
    }

    /**
     * 构造成功的ResultInfo
     *
     * @param data 数据
     * @return 成功的ResultInfo
     */
    public static ResultInfo success(Object data) {
        return new ResultInfo(true, data, "操作成功完成");
    }

    /**
     * 构造成功的ResultInfo
     *
     * @return 成功的ResultInfo
     */
    public static ResultInfo success() {
        return success(null);
    }

    /**
     * 构造失败的ResultInfo
     *
     * @param errMsg 错误消息
     * @return 失败的ResultInfo
     */
    public static ResultInfo fail(String errMsg) {
        return new ResultInfo(false, null, errMsg);
    }

    @Override
    public String toString() {
        return "ResultInfo{" +
                "flag=" + flag +
                ", data=" + data +
                ", errMsg='" + errMsg + '\'' +
                '}';
    }
}
