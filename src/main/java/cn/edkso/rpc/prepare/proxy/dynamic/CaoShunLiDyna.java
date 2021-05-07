package cn.edkso.rpc.prepare.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *@author 十下
 *
 *类说明：代理类
 */
public class CaoShunLiDyna implements InvocationHandler {

    private Object server;

    public CaoShunLiDyna(Object server) {
        this.server = server;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        System.out.println("曹顺利找到了Server.....");
        Object result = method.invoke(server,args);
        System.out.println("曹顺利：能不能找到了Server.....");
        return result;
    }


}
