package package_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class Lambda04_fileReading {

    public static void main(String[] args) throws IOException {

        // TASK 1: print poem.txt on console

        Path path = Path.of("src/package_2/poem.txt");


        // Road 1:
        System.out.println("\nTASK 1: print poem.txt on console (road 1):");
        Files.lines(path).forEach(System.out::println);


        // Road 2 (It may not count as a different road
        // but with these codes, we create a Stream<String> object, it's worth mentioning):
        System.out.println("\nTASK 1: print poem.txt on console (road 2):");
        Stream<String> poemStream = Files.lines(path);
        poemStream.forEach(System.out::println);


        // Task 2: How many times used the word "second" in the poem
        System.out.println("\nTask 2: How many times used the word \"second\" in the poem:");
        System.out.println(
                Files.lines(path)
                .map(String::toLowerCase)
                .filter(n -> n.contains("second"))
                .count()
        );


        // Task 3: print all the words distincting the same words according to the natural order
        System.out.println("\nTask 3: print all the words distincting the same words according to the natural order");
        Files.lines(path)
                .map(String::toLowerCase)
                .map(t -> t.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .sorted().forEach(Methods::print);


        // Task 4: number of words which contains letter 'a'
        System.out.println("\nTask 4: number of words which contains letter 'a'");
        long count=
        Files.lines(path)
                .map(String::toLowerCase)
                .map(t -> t.split(" "))
                .flatMap(Arrays::stream)
                .filter(w -> w.contains("a"))
                .count();

        System.out.println(count);

        // Task 5: print the words which contains letter 'a'
        System.out.println("\nTask 5: print sorted the words which contains letter 'a'");
        Files.lines(path)
                .map(String::toLowerCase)
                .map(t -> t.split(" "))
                .flatMap(Arrays::stream)
                .filter(w -> w.contains("a"))
                .distinct()
                .sorted()
                .forEach(Methods::print);

        // Task 6: How many different words are used in the file
        System.out.println("\nTask 6: How many different words are used in the file");
        System.out.println(
                Files.lines(path)
                .map(String::toLowerCase)
                .map(t -> t.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .count()
        );


        // Task 7: How many letters are used in the file
        System.out.println("\nTask 7: How many letters are used in the file");
        System.out.println(
                Files.lines(path)
                        .map(String::toLowerCase)
                        .map(t -> t.replaceAll("\\W",""))
                        .map(t -> t.split(""))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .count()
        );


    }


}
