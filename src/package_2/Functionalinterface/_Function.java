package package_2.Functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {

        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        // 1 ekleyip 10 la çarpmak için yol 1:
        int number1 = multiplyBy10function.apply(incrementByOneFunction.apply(1));
        System.out.println(number1);

        // 1 ekleyip 10 la çarpmak için yol 2:
        Function<Integer, Integer> addBy1andMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10function);
        System.out.println(addBy1andMultiplyBy10.apply(1));

        // BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementBy1andMultiplyBiFunction.apply(4,100)); // (4+1)*100 return 500

        // same thing with a classic method
        System.out.println(incrementBy1andMultiply(4,100));

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static int increment(int number){
        return number + 1;
    }

    static Function<Integer, Integer> multiplyBy10function = number -> number*10;

    static BiFunction<Integer,Integer,Integer> incrementBy1andMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne+1)*numberToMultiplyBy;

    static int incrementBy1andMultiply(int number, int numToMultiplyBy){
        return (number+1)*numToMultiplyBy;
    }

}
