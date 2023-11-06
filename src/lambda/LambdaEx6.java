package lambda;

import java.util.function.BiFunction;

public class LambdaEx6 {
    public static void main(String[] args) {
        BiFunction<String, String, Boolean> f = (s1, s2) -> s1.equals(s2);

        System.out.println(f.apply("abc","abcd"));

        BiFunction<String, String, Boolean> f1 = String::equals;
        System.out.println(f1.apply("abc","abcd"));

    }
}
