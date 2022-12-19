package package_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

    /*
    Task:

    * create a method that removes the words contains letter 'a' from given list
    *
    * INPUT = list1={"Aysha","Judith","Alan","Kevin","Maria"}
    * OUTPUT = [Judith,Kevin]

     */

public class Lambda01 {

    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Aysha","Judith","Alan","Kevin","Maria"));


    // using classic method:
    public static ArrayList<String> removeStrWithA(ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<>();
        for (String each:list) {
            if (!(each.contains("a")||each.contains("A"))){
                newList.add(each);
            }
        }
        return newList;
    }


    // using Lambda functions:
    public static void removeStrWithALambdaFunc(ArrayList<String> list){

        System.out.println(list.stream()
                .map(n -> n.toLowerCase())
                .filter(n -> !n.contains("a"))
                .collect(Collectors.toList()));

    }

    public static void removeStrWithALambdaFunc2(ArrayList<String> list){

        System.out.println(list.stream()
                .filter(n -> !n.contains("a")).filter(n -> !n.contains("A"))
                .collect(Collectors.toList()));

    }

    public static void removeStrWithALambdaFunc3(ArrayList<String> list){

        list.removeIf(n -> n.contains("a") || n.contains("A"));
        System.out.println(list);

    }



}
