package cn.edkso.rpc.prepare.proxy.dynamic;

import cn.edkso.rpc.prepare.proxy.IServer;
import cn.edkso.rpc.prepare.proxy.Server;

import java.lang.reflect.Proxy;

public class LisonDyna {
    public static void main(String[] args) {

        IServer iServer =(IServer)
                Proxy.newProxyInstance(IServer.class.getClassLoader(),
                        new Class[]{IServer.class},
                        new CaoShunLiDyna(new Server()));
        iServer.choice("薯条");
    }
}
