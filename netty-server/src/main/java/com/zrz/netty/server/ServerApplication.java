package com.zrz.netty.server;

import com.zrz.netty.server.bootstraps.EchoServer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ServerApplication {

    public static void main(String[] args) throws Exception{
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new EchoServer(9090).start();
                }catch (Exception e){
                    log.error("Echo server 9090 failed to start !!!");
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    new EchoServer(9091).start();
                }catch (Exception e){
                    log.error("Echo server 9091 failed to start !!!");
                }
            }
        }).start();

        log.info("hello, server!");
    }
}