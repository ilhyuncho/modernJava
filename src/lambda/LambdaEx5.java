package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx5 {
    public static void main(String[] args) {

        Predicate<Integer> p = i -> i < 100;
        Predicate<Integer> q = i -> i < 200;
        Predicate<Integer> r = i -> i%2 == 0;
        Predicate<Integer> notP = p.negate();

        Predicate<Integer> all = notP.and(q.or(r));

        System.out.println(all.test(151));

        String str1 = "abcd";
        String str2 = "abcd";

        Predicate<String> p1 = Predicate.isEqual(str1);
        boolean result = p1.test(str2);
        System.out.println(result);





    }
}
