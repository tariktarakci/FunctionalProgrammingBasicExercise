package package_1;

import java.util.*;
import java.util.stream.Stream;

public class Lambda03 {

    static List<String> menu = new ArrayList<>(Arrays.asList("Lahmacun","Adana","Kuzu Tandir","Guvec","Kokorec","Tavuk Sis"));




    // print the elements of the list. according to the last letter of words and reverse order
    public static void printLastLetterReverseOrder(List<String> list){
        list.stream()
                .sorted(Comparator.
                        comparing(t -> t.toString()
                                .charAt(t.toString().length()-1))
                        .reversed()).
                forEach(Methods::print);
    }

    // print the word which has a greater number of character
    public static void printLongestElement(List<String> list){
        System.out.println(
                list.stream()
                        .max(Comparator
                                .comparing(String::length)).get()
        );
    }

    public static void printLongestElement2(List<String> list){
        Stream<String> sonIsim =
                list.stream().
                        sorted(Comparator
                                .comparing(t -> t.toString().length()).reversed())
                        .limit(1);

        System.out.println(Arrays.toString(sonIsim.toArray()));
    }

    public static void printLongestElement3(List<String> list){
        System.out.println(
                list.stream()
                        .sorted(Comparator
                                .comparing(t -> t.toString().length()).reversed())
                        .findFirst().get()
        );

    }


}
