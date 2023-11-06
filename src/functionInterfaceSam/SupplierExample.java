package functionInterfaceSam;

import java.util.function.Supplier;

public class SupplierExample {
    public static String exe(Supplier<String>supplier){
        return supplier.get();
    }
}
