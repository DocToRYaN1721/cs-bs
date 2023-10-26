package com.example.csbs.BS.Web;

import com.example.csbs.BS.server.Client;

public class Web {
    public static void main(String[] args) {
        Client client = new Client("127.0.0.1", 8888); //创建一个客户端对象，传入服务器的IP地址和端口号作为参数，请根据实际情况修改这里的参数值
        client.start(); //启动客户端对象
    }
}
