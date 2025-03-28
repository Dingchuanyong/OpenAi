package org.example.fun;

import org.springframework.ai.model.function.FunctionCallback;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FunctionRegister {
    @Bean
    public FunctionCallback askForLeaveCallBack(){
       return FunctionCallback.builder()
                .function("askForLeave", new OaServiceFunction()) // (1) function name and instance
             .description("当有人请假时，返回请假天数") // (2) function description
               .inputType(OaServiceFunction.Request.class) // (3) function input type
                .build();
    }
}
