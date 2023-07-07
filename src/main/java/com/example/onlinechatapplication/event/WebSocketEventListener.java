package com.example.onlinechatapplication.event;

import com.example.onlinechatapplication.chat.ChatMessage;
import com.example.onlinechatapplication.chat.MessageType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

@Component
@Slf4j
@RequiredArgsConstructor
public class WebSocketEventListener {

    private final SimpMessageSendingOperations msgTemplate;

    @EventListener
    public void handleWebSocketDisconnection(
            SessionDisconnectEvent event){
        StompHeaderAccessor accessor=StompHeaderAccessor.wrap(event.getMessage());
        String username =(String) accessor.getSessionAttributes().get("username");

        if (username != null){
            log.info("User disconnected: {}", username);
            var chatMessage = ChatMessage.builder()
                    .messageType(MessageType.LEAVE)
                    .sender(username)
                    .build();
            msgTemplate.convertAndSend("/topic/public", chatMessage);
        }

    }

}
