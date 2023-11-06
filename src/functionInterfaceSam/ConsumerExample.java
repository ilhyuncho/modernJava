package functionInterfaceSam;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void executeConsumber(List<String> nameList, Consumer<String> consumer){
        for(String s : nameList){
            consumer.accept(s);
        }
    }
}
