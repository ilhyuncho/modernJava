package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

@FunctionalInterface
interface TriFunction<T,U,V,R>{
    R apply(T t, U u, V v);
}



public class LambdaEx4 {

    public static void main(String[] args) {

        TriFunction<Integer,Integer,Integer,Integer> df = (s, a, d) -> s * a * d;

        Supplier<Integer> s = () -> (int)(Math.random() * 100) + 1;

        Consumer<Integer> c = i -> System.out.print(i+", ");
        Predicate<Integer> p = i -> i % 2 == 0;
        Function<Integer, Integer> f = i -> i/10*10;    // i의 일의 자리를 없앤다.

        List<Integer> list = new ArrayList<>();
        makeRandomList(s, list);
        System.out.println(list);
        printEvenNum(p,c,list);






        System.out.println(df.apply(2,45,6));

    }

    static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list){
        System.out.print("[");
        for(T i : list){
            if(p.test(i)){
                c.accept(i);
            }
        }
        System.out.print("]");
    }
    static <T> void makeRandomList(Supplier<T> s, List<T>list){
        for(int i = 0; i < 10; i++){
            list.add(s.get());
        }
    }
}
