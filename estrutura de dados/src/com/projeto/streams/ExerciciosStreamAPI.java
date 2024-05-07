package com.projeto.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {
    public static void main(String[] args) {
        List<String> randomNumbers =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        randomNumbers.stream().forEach(num -> System.out.println(num)); // with lambda

        randomNumbers.stream().forEach(System.out::println); // with method reference

        randomNumbers.stream().limit(5).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println(randomNumbers.stream().map(num -> Integer.parseInt(num)).collect(Collectors.toList())); // with lambda

        System.out.println(randomNumbers.stream().map(Integer::parseInt).collect(Collectors.toList())); // with method reference
        randomNumbers.stream()
                .mapToInt(num -> Integer.parseInt(num))
                .average()
                .ifPresent(op -> System.out.println(op)); // with lambda

        // Exercises
        List<Integer> intRandNum = randomNumbers.stream().map(Integer::parseInt).toList();

        randomNumbers.stream().map(Integer::parseInt).filter(num -> num % 2 != 0).forEach(System.out::println);

        System.out.println(intRandNum.stream().max(Integer::compare).get());

        System.out.println(intRandNum.stream().min(Integer::compare).get());

        System.out.println(intRandNum.stream().filter(num -> num % 2 != 0).reduce(0, (a, b) -> a + b));

        System.out.println(intRandNum.stream().collect(Collectors.toSet()).size());

        intRandNum.stream().skip(3).forEach(System.out::println);

        intRandNum.stream().sorted().forEach(System.out::println);

        System.out.println(intRandNum.stream().collect(Collectors.groupingBy(num -> (num % 3 == 0 || num % 5 == 0) && num > 0)));
    }
}
