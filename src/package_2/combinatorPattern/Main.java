package package_2.combinatorPattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Alice",
                "alice@gmail.com",
                "+09999999999",
                LocalDate.of(2000,1,1)
        );

        Customer customer2 = new Customer(
                "Mark",
                "mark@gmail.com",
                "09999999999",
                LocalDate.of(2006,1,1)
        );

        Customer customer3 = new Customer(
                "Berkay",
                "berkay.gmail.com",
                "+09999999999",
                LocalDate.of(1999,1,1)
        );

        /*
        CustomerValidatorService validatorService = new CustomerValidatorService();

        System.out.println(validatorService.isValid(customer));
        System.out.println(validatorService.isValid(customer2));
        System.out.println(validatorService.isValid(customer3));

         */

        //Using combinator pattern
        CustomerRegistrationValidator.ValidationResult result = CustomerRegistrationValidator.isEmailValid().and(CustomerRegistrationValidator.isPhoneNumberValid()).and(CustomerRegistrationValidator.isAnAdult()).apply(customer);

        System.out.println(result);

        if (result != CustomerRegistrationValidator.ValidationResult.SUCCES){
            throw new IllegalStateException(result.name());
        }




    }



}
