package cn.edkso.rpc.prepare.proxy.normal;

import cn.edkso.rpc.prepare.proxy.IServer;
import cn.edkso.rpc.prepare.proxy.IServer;
import cn.edkso.rpc.prepare.proxy.Server;

/**
 *类说明：CaoShunLi，实现了选择服务接口，准备代理lison
 */

public class CaoShunLi implements IServer {

    private IServer iServer = new Server();

    @Override
    public void choice(String desc) {
        System.out.println("CaoShunLi 找到前台小姐姐.....");
        //do other something....
        iServer.choice(desc);//前台小姐姐进行处理
        //do other something....,自己选一个
        System.out.println("CaoShunLi:能不能第二个半价？我喜欢小家碧玉，初恋的感觉");
    }
}
