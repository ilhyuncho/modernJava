package stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamEx1 {
    public static void main(String[] args) {

//        Stream<String> strStream = Stream.of("ad","bbdf", "cerer");
//        strStream.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);

        Stream<String[]> strArrStm = Stream.of(new String[] {"abcd", "sdf", "gdfg"}
                                            , new String[] {"hghg","tert", "cvbc"}
        );

        Stream<Object> objectStream = strArrStm.flatMap(Arrays::stream);

        objectStream.forEach(System.out::println);


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
