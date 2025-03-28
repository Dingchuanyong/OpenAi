package org.example.simple;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequiredArgsConstructor
public class ChatAi {
    @Autowired
    private ChatClient chatClient ;




    @GetMapping("/api/chatAi")
    public String chatAi(@RequestParam(value = "message",defaultValue ="讲个笑话")String message ){

        return chatClient.prompt().user(message).call().content();

    }
    @GetMapping("/api/stream")
    public Flux<String> chatAiStream(@RequestParam(value = "message",defaultValue ="讲个笑话")String message ){

        return chatClient.prompt().user(message).stream().content();

    }
}
