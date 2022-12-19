package package_1;

import static package_1.Lambda01.*;
import static package_1.Lambda02.*;
import static package_1.Lambda03.*;

public class Runner01 {

    public static void main(String[] args) {


        System.out.println(removeStrWithA(names));
        System.out.println("****************");
        removeStrWithALambdaFunc(names);
        System.out.println("****************");
        removeStrWithALambdaFunc2(names);
        System.out.println("****************");
        removeStrWithALambdaFunc3(names);
        System.out.println("****************");
        printMax(numbers);
        System.out.println("****************");
        printSum(numbers);
        System.out.println("****************");
        multiplyEvenNumbers(numbers);
        System.out.println("****************");
        multiplyEvenNumbers2(numbers);
        System.out.println("****************");
        squareOddNumbers(numbers);
        System.out.println("****************");
        printLastLetterReverseOrder(menu);
        System.out.println("****************");
        printLongestElement(menu);
        System.out.println("****************");
        printLongestElement2(menu);
        System.out.println("****************");
        printLongestElement3(menu);



    }


}
