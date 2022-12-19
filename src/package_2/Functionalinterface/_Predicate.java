package package_2.Functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("with classic methods:");
        System.out.println(isPhoneNumberValid("07000000000"));  // true
        System.out.println(isPhoneNumberValid("0700000000"));   // false
        System.out.println(isPhoneNumberValid("08000000000"));  // false

        System.out.println();
        System.out.println("with predicate:");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));  // true
        System.out.println(isPhoneNumberValidPredicate.test("0700000000"));   // false
        System.out.println(isPhoneNumberValidPredicate.test("08000000000"));  // false

        System.out.println();

        System.out.println("If phone number is valid and contains 3 = "
                + isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003"));

        System.out.println("If phone number is valid and contains 3 = "
                + isPhoneNumberValidPredicate.and(containsNumber3).test("07000000000"));

        System.out.println("If phone number is valid or contains 3 = "
                + isPhoneNumberValidPredicate.or(containsNumber3).test("07003"));

    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length()==11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length()==11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");

}
