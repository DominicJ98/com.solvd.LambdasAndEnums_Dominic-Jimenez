import enums.*;

import java.util.function.*;

@FunctionalInterface
interface MyFunction<T, R> {
    R apply(T t);
}

@FunctionalInterface
interface MyBiFunction<T, U, R> {
    R apply(T t, U u);
}

@FunctionalInterface
interface MyPredicate<T> {
    boolean test(T t);
}

public class Main {
    public static void main(String[] args){
        // 1. Function<T, R>: shows length of word
        Function<String, Integer> stringLength = (s) -> s.length();
        System.out.println("Length of 'Hello': " + stringLength.apply("Hello"));

        // 2. Predicate<T>: returns boolean for even/odd
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // 3. Consumer<T>: printing input with accept method
        Consumer<String> print = (s) -> System.out.println("Hello, " + s);
        print.accept("World");

        // 4. Supplier<T>: generate random number
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random value: " + randomValue.get());

        // 5. BiFunction<T, U, R>: add two ints
        BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
        System.out.println("Sum of 2 and 3: " + sum.apply(2, 3));

        // using Custom Lambdas
        // 1. MyFunction with Generics
        MyFunction<String, Integer> myStringLengthFunction = (s) -> s.length();
        System.out.println("Length of 'Generics': " + myStringLengthFunction.apply("Generics"));

        // 2. MyBiFunction with Generics
        MyBiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("Sum: " + add.apply(10, 20));

        // 3. MyPredicate with Generics
        MyPredicate<Integer> isPositive = (n) -> n > 0;
        System.out.println("Is 10 positive? " + isPositive.test(10));

        //Using Enums
        Season currentSeason = Season.SUMMER;
        System.out.println("Current season: " + currentSeason);
        System.out.println("Temperature: " + currentSeason.getTemperature());

        System.out.println("Today is: " + Day.MONDAY + ", Type: " + Day.MONDAY.getType());

        Size s = Size.MEDIUM;
        System.out.println("Size: " + s + ", Volume: " + s.getVolume());

        TrafficLight light = TrafficLight.RED;
        light.printMessage();

        Currency currency = Currency.USD;
        currency.printCurrencyDetails();
    }
}
