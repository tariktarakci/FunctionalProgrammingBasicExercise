package package_2.Functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer Maria = new Customer("Maria","987987398");

        // Normal Java function
        greetCustomer(Maria);
        greetCustomerV2(Maria,false);

        // Consumer Functional interface
        greetCustomerConsumer.accept(Maria);
        greetCustomerConsumerV2.accept(Maria, false);

    }

    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello "+customer.customerName+" thanks for registering\n" +
                    "phone number: "+ (showPhoneNumber ? (customer.customerPhoneNumber) : "**********"));
    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Hello "+customer.customerName+" thanks for registering\n" +
                    "phone number: "+customer.customerPhoneNumber);
    static void greetCustomer(Customer customer){
        System.out.println("Hello "+customer.customerName+" thanks for registering\nphone number: "+customer.customerPhoneNumber);
    }

    static void greetCustomerV2(Customer customer, Boolean showPhoneNumber){
        System.out.println("Hello "+customer.customerName+" thanks for registering\n" +
                "phone number: "+ (showPhoneNumber ? (customer.customerPhoneNumber) : "**********"));
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }


}
