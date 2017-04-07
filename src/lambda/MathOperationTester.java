package lambda;

/**
 * Created by shuaihan on 2017/4/7.
 */
public class MathOperationTester {
    public static void main(String args[]) {
        MathOperationTester tester = new MathOperationTester();

        // 类型声明
        MathOperationInterface addition = (int a, int b) -> a + b;

        // 不用类型声明
        MathOperationInterface subtraction = (a, b) -> a - b;

        // 大括号中的返回语句
        MathOperationInterface multiplication = (int a, int b) -> {
            return a * b;
        };

        // 没有大括号及返回语句
        MathOperationInterface division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

    }

    private int operate(int a, int b, MathOperationInterface mathOperation) {
        return mathOperation.operation(a, b);
    }
}
