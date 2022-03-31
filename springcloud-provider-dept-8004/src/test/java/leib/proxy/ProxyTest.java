package leib.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;

public class ProxyTest {
    public static void main(String[] args) {
        /**
         * Calculator接口的Class对象
         * 得到Class对象的三种方式：
         * 1.Class.forName(xxx)
         * 2.xxx.class
         * 3.xxx.getClass()
         * 注意，这并不是我们new了一个Class对象，而是让虚拟机加载并创建Class对象
         */
        Class<Calculator> calculatorClazz = Calculator.class;
        //Calculator接口的构造器信息
        Constructor<?>[] calculatorClazzConstructors = calculatorClazz.getConstructors();
        //Calculator接口的方法信息
        Method[] calculatorClazzMethods = calculatorClazz.getMethods();
        //打印
        System.out.println("------接口Class的构造器信息------");
        printClassInfo(calculatorClazzConstructors);
        System.out.println("\n");
        System.out.println("------接口Class的方法信息------");
        printClassInfo(calculatorClazzMethods);
        System.out.println("\n");

        /**
         * Calculator实现类的Class对象
         */
        Class<CalculatorImpl> calculatorImplClazz = CalculatorImpl.class;
        //Calculator实现类的构造器信息
        Constructor<?>[] calculatorImplClazzConstructors = calculatorImplClazz.getConstructors();
        //Calculator实现类的方法信息
        Method[] calculatorImplClazzMethods = calculatorImplClazz.getMethods();
        //打印
        System.out.println("------实现类Class的构造器信息------");
        printClassInfo(calculatorImplClazzConstructors);
        System.out.println("\n");
        System.out.println("------实现类Class的方法信息------");
        printClassInfo(calculatorImplClazzMethods);
    }

    public static void printClassInfo(Executable[] targets) {
        for (Executable target : targets) {
            // 构造器/方法名称
            String name = target.getName();
            StringBuilder sBuilder = new StringBuilder(name);
            // 拼接左括号
            sBuilder.append('(');
            Class<?>[] clazzParams = target.getParameterTypes();
            // 拼接参数
            for (Class<?> clazzParam : clazzParams) {
                sBuilder.append(clazzParam.getName()).append(',');
            }
            //删除最后一个参数的逗号
            if (clazzParams.length != 0) {
                sBuilder.deleteCharAt(sBuilder.length() - 1);
            }
            //拼接右括号
            sBuilder.append(')');
            //打印 构造器/方法
            System.out.println(sBuilder.toString());
        }
    }
}
