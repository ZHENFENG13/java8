package optional;

import java.util.Optional;

/**
 * Created by 13 on 2017/4/9.
 */
public class Example2 {
    public static void main(String args[]) {
        Optional<String> firstName = Optional.of("Tom");
        System.out.println("First Name is set? " + firstName.isPresent());
        System.out.println("First Name: " + firstName.orElseGet(() -> "[none]"));
        System.out.println(firstName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
        System.out.println();
    }
}
