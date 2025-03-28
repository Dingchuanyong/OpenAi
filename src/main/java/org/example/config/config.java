package org.example.config;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.MessageChatMemoryAdvisor;
import org.springframework.ai.chat.memory.ChatMemory;
import org.springframework.ai.chat.memory.InMemoryChatMemory;

import org.springframework.ai.moonshot.MoonshotChatModel;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class config {

    @Autowired
    private MoonshotChatModel model;
    @Autowired
    private OllamaChatModel model2;



    @Bean
//    public ChatClient chatClient(ChatMemory chatMemory){
    public ChatClient chatClient( ){
        return ChatClient.builder(model).defaultAdvisors(new MessageChatMemoryAdvisor(chatMemory())).
                build();

    }

    @Bean
    public ChatMemory chatMemory(){
        return new InMemoryChatMemory();
    }



}
