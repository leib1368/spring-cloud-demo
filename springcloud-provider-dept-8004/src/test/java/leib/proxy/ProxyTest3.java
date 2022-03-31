package leib.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest3 {
    public static void main(String[] args) throws Throwable {
        CalculatorImpl target = new CalculatorImpl();
        // 传入目标对象
        Calculator calculatorProxy = (Calculator) getProxy(target);
        calculatorProxy.add(1, 2);
    }

    /**
     * 传入目标对象，获取代理对象
     *
     * @param target
     * @return
     * @throws Exception
     */
    private static Object getProxy(final Object target) throws Exception {
        // 参数1：随便找个类加载器给它 参数2：需要代理的接口
        Class<?> proxyClazz = Proxy.getProxyClass(target.getClass().getClassLoader(), target.getClass().getInterfaces());
        Constructor<?> constructor = proxyClazz.getConstructor(InvocationHandler.class);
        return constructor.newInstance((InvocationHandler) (proxy1, method, args) -> {
            System.out.println(method.getName() + "方法开始执行...");
            Object result = method.invoke(target, args);
            System.out.println(result);
            System.out.println(method.getName() + "方法执行结束...");
            return result;
        });
    }
}
