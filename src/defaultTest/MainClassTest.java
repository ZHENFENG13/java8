package defaultTest;

/**
 * Created by 13 on 2017/4/7.
 */
public class MainClassTest {
    public static void main(String args[]) {

        String hello = "hello world";
        DefaultInterfaceTest defaultInterfaceTest = new DefaultInterfaceTest() {
            @Override
            public String sayHello(String hello) {
                return "this is from MainClassTest :" + hello;
            }
        };


        System.out.println(defaultInterfaceTest.defaultHello(hello));
        System.out.println(defaultInterfaceTest.sayHello(hello));


        DefaultTest defaultTest = new DefaultTest();
        System.out.println(defaultTest.defaultHello(hello));
        System.out.println(defaultTest.sayHello(hello));
    }


}
