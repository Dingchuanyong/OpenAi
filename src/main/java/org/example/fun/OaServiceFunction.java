package org.example.fun;

import java.util.function.Function;

public class OaServiceFunction implements Function<OaServiceFunction.Request,OaServiceFunction.Response>{

    @Override
    public OaServiceFunction.Response apply(Request request) {
        System.err.printf( "call fun 调用 %s is take off%n",request.who);
        return new OaServiceFunction.Response(10);
    }
    public record Request(String who ){

    }
    public record Response(int days){

    }
}