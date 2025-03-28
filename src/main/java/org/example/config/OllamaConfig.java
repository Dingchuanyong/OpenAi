//package org.example.config;
//
//import org.springframework.ai.ollama.OllamaChatModel;
//import org.springframework.ai.ollama.api.OllamaApi;
//import org.springframework.ai.ollama.api.OllamaOptions;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class OllamaConfig {
//    @Value("${spring.ai.ollama.base-url}")
//    private String baseUrl;
//
//    @Value("${spring.ai.ollama.chat.model}")
//    private String modelName;
//    OllamaApi ollamaApi = new OllamaApi("http://localhost:11434");
//
//    @Bean
//    public OllamaChatModel ollamaChatModel() {
//        return OllamaChatModel.builder().ollamaApi(ollamaApi)
//                .build();
//    }
//}