package optional;

import java.util.Optional;

/**
 * Created by 13 on 2017/4/9.
 */
public class Example1 {
    public static void main(String args[]) {
        Optional<String> fullName = Optional.ofNullable(null);
        System.out.println("Full Name is set? " + fullName.isPresent());
        System.out.println("Full Name: " + fullName.orElseGet(() -> "[none]"));
        System.out.println(fullName.map(s -> "Hey " + s + "!").orElse("Hey Stranger!"));
    }
}
