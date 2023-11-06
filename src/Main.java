

import ExecutorExam.ExecutorExample;
import ForkJoin.ForkJoinDirSize;
import functionInterfaceSam.ConsumerExample;
import functionInterfaceSam.FunctionExample;
import functionInterfaceSam.Person;
import functionInterfaceSam.SupplierExample;
import org.w3c.dom.Text;
import test.FunctionSearchingTravel;


import test.TravelInfo;
import thread.ThreadEx1;
import thread.ThreadEx2;
import thread.ThreadEx3;

import javax.swing.*;
import javax.swing.tree.RowMapper;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

class Fruit { public String toString(){return "Fruit";}}
class Apple extends Fruit { public String toString(){return "Apple";}}
class Grape extends Fruit { public String toString(){return "Grape";}}
class Toy { public String toString(){return "Toy";}}



public class Main{

    static boolean autoSave = false;


    public static void main(String[] args){




//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("장윤기", 45));
//        personList.add(new Person("장해라", 18));
//        personList.add(new Person("장해윤", 14));
//        personList.add(new Person("장윤기", 45));

//        Map<String, Person> map = new HashMap<>();
//        map.put("1", new Person("장윤기", 45));
//        map.put("2", new Person("장해리", 18));
//        map.put("3", new Person("장해윤", 14));
//        map.put("4", new Person("장윤기", 45));
//

//
//        List<Integer> list = Arrays.asList(1,2,5, 9, 4);
//
//        int maxvalue = list.stream().reduce(0, Integer::max);
//
//        System.out.println(maxvalue);



        // Thread 상속
//        ThreadEx1 t1 = new ThreadEx1();
//
//        // Runnable 인터페이스 구현
//        Runnable r = new ThreadEx2();
//        Thread t2 = new Thread(r);
//
//        t1.start();
//        t2.start();






    }
}
//
//class Person {
//    String name;
//    int age;
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public String toString() {
//        return name + ":" + age;
//    }
//    @Override
//    public boolean equals(Object obj) {
//
//        if(obj instanceof Person person)
//        {
//            return this.name.equals(person.name) && this.age == person.age;
//        }
//        return false;
//    }
//    @Override
//    public int hashCode() {
//        return (name + age).hashCode();
//    }
//}
