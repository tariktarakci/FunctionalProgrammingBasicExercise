package package_2.Functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        System.out.println(getDBconnectionURL());
        System.out.println(getDBconnectionURLSupplier.get());

    }


    static String getDBconnectionURL (){
        return "jdbc://localhost:5421/users";
    }

    static Supplier<String> getDBconnectionURLSupplier = () ->
            "jdbc://localhost:5421/users";



}
