package functionInterfaceSam;

import java.util.function.Function;

public class FunctionExample {

    public static int exce(String context, Function<String, Integer> function)
    {
        return function.apply(context);
    }
}
