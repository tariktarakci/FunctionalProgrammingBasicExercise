package package_1;

import java.util.*;

public class Lambda02 {

    static List<Integer> numbers = new ArrayList<>(Arrays.asList(25,65,-56,11,65,4,34,98));


    // find the biggest number

    public static void printMax(List<Integer> list){
        System.out.println(list.stream().reduce(Integer::max).get());
    }


    // print the sum of the numbers
    public static void printSum(List<Integer> list){
        System.out.println(list.stream().reduce(Integer::sum).get());
    }

    // multiply even numbers and print the result
    public static void multiplyEvenNumbers(List<Integer> list){
        System.out.println(list.stream().filter(n -> n%2==0).reduce((i,multiplied) -> i*multiplied).get());
    }

    public static void multiplyEvenNumbers2(List<Integer> list){
        System.out.println(list.stream().filter(n -> n%2==0).reduce(Math::multiplyExact).get());
    }

    // square odd numbers and sort big to small and then print
    public static void squareOddNumbers(List<Integer> list){
        list.stream().filter(n -> n%2 ==1).map(t -> t*t).sorted(Comparator.reverseOrder()).forEach(Methods::print);
    }

}
