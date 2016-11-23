package com.yinrong.WebSocket.domain;

/**
 * Created by yinrong on 2016/11/20.
 */
public class YinrongResponse {
private String responseMessage;

    public YinrongResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
