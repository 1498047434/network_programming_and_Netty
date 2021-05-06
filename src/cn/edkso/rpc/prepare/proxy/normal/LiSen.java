package cn.edkso.rpc.prepare.proxy.normal;


import cn.edkso.rpc.prepare.proxy.IServer;
import cn.edkso.rpc.prepare.proxy.IServer;
import cn.edkso.rpc.prepare.proxy.Server;

/**
 * LiSen自己去请求Server选择喜欢吃的东西
 * 或者，找曹顺利代理
 */
public class LiSen {

    public static void main(String[] args) {
        IServer iServer = new Server();
        iServer.choice("薯条");

        IServer caoshunli = new CaoShunLi();
        caoshunli.choice("选择喜欢吃的东西");
    }

}
