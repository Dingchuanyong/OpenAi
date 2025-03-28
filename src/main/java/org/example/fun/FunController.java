package org.example.fun;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FunController {
    @Autowired
    private ChatClient chatClient ;

    @GetMapping("/api/funcall")
    public String funcall(@RequestParam(value = "message") String message){
        System.out.println("走到这里了 ");
        return chatClient.prompt().
                functions("askForLeave").user(message).call().content();
    }
}
