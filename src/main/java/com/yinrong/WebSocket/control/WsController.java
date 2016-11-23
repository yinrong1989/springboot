package com.yinrong.WebSocket.control;

import com.yinrong.WebSocket.domain.YinrongMessage;
import com.yinrong.WebSocket.domain.YinrongResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

/**
 * Created by yinrong on 2016/11/20.
 */
@Controller
public class WsController {
@MessageMapping("/welcome")//消息请求url
@SendTo("/topic/getResponse")//消息转发目标
    public YinrongResponse say(YinrongMessage yinrongMessage)throws Exception{
    Thread.sleep(1000);
    return new YinrongResponse("Welcome,"+yinrongMessage.getName()+"!");
}
}
