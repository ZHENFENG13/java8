package defaultTest;

/**
 * Created by shuaihan on 2017/4/7.
 */
public class DefaultTest implements DefaultInterfaceTest {
    @Override
    public String sayHello(String hello) {
        return "this is from class defaultTest : " + hello;
    }
}
