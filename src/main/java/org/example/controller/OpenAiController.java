//package org.example.controller;
//
//
//import org.springframework.ai.chat.client.ChatClient;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import javax.print.attribute.standard.Media;
//
//@RestController
//@CrossOrigin
//public class OpenAiController {
//    ChatClient chatClient;
//    public OpenAiController(ChatClient.Builder chatClientBuilder){
//        this.chatClient=chatClientBuilder.build();
//    }
//   @CrossOrigin
//   @GetMapping(value = "/api/generateStreamAsString",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
//    public String  generateStreamAsString(@RequestParam(value = "message",defaultValue ="讲个笑话" )String message){
//       String content = chatClient.prompt().user(message).call().content();
//       System.out.println("进来了");
//       return content;
//
//   }
//}
