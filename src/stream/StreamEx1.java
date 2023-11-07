package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamEx1 {
    public static void main(String[] args) {

//        Stream<String> strStream = Stream.of("a","b", "c");
//        Stream<String> strStream1 = Stream.of(new String[]{"a", "b", "c"});
//        Stream<String> strStream2 = Arrays.stream(new String[]{"a", "b", "c"});
//
//        IntStream intStream1 = IntStream.range(2,5);

        IntStream intStream = new Random().ints(4, 100);
        intStream.limit(100).forEach(System.out::println);










    }

    static int test1(List<String> student){
        Objects.requireNonNull(null,"예외 발생~~");

        return 5;
    }

    static Comparator<String> com = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };




    static Student df = new Student(4,8){
        int fdf;

        @Override
        public int compareTo(Student o) {
            return super.compareTo(o);
        }
    };
}
