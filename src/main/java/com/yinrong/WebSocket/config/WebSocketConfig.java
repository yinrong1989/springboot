package com.yinrong.WebSocket.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by yinrong on 2016/11/20.
 */
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer{
    @Override

    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
        //注册一个STOMP的endpoint，并映射指定的url和指定使用SocketJS协议
        stompEndpointRegistry.addEndpoint("/endpointYinrong").withSockJS();
    }
    //广播式配置消息代理
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic");//
    }
}
