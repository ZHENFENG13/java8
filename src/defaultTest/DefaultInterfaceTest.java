package defaultTest;

/**
 * Created by shuaihan on 2017/4/7.
 */
public interface DefaultInterfaceTest {
    String sayHello(String hello);

    //Java 8允许我们给接口添加一个非抽象的方法实现，只需要使用 default关键字即可，这个特征又叫做扩展方法
    default String defaultHello(String hello) {
        return "this is from defaultInterfaceTest : " + hello;
    }
}
