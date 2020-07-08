package com.zrz.netty.client;

import com.zrz.netty.client.boostraps.EchoClient;

public class ClientApplication {

    public static void main(String[] args) throws Exception{
        new EchoClient("127.0.0.1", Integer.parseInt(args[0])).start();
    }
}