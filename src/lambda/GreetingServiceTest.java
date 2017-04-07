package lambda;

/**
 * Created by 13 on 2017/4/7.
 */
public class GreetingServiceTest {
    public static void main(String args[]) {

        // 不用括号
        GreetingServiceInterface greetService1 = message ->
                System.out.println("Hello " + message);

        // 用括号
        GreetingServiceInterface greetService2 = (message) ->
                System.out.println("Hello " + message);

        greetService1.sayMessage("Runoob");
        greetService2.sayMessage("Google");


    }
}
