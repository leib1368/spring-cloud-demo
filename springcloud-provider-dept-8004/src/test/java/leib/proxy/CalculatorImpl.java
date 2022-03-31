package leib.proxy;

/**
 * 目标类，实现Calculator接口（如果一开始就面向接口编程，其实是不存在这一步的，CalculatorImpl原本就实现Calculator接口）
 */
public class CalculatorImpl implements Calculator {

    // 加
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    // 减
    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    // 乘法、除法...
}
