package package_2;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Optional.ofNullable("tt@gmail.com")
                .ifPresentOrElse(email -> System.out.println("email send to "+email),
                ()-> System.out.println("cannot send email"));

        Optional.ofNullable(null)
                .ifPresentOrElse(email -> System.out.println("email send to "+email),
                        ()-> System.out.println("cannot send email"));

    }

}
