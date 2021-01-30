package com.coaching.maths;

import com.coaching.english.EnglishCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MathCourse {

    private static Logger mathCourse = Logger.getLogger(MathCourse.class.getName());

    public static List primeNumbersOfAnInteger(int number) {
        int n = number;
        List primeNumbers = new ArrayList();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeNumbers.add(i);
                n /= i;
            }
        }
        return primeNumbers;
    }

    public static List<Integer> primeNumbers(int n) {
        return IntStream.rangeClosed(2, n)
                .filter(x -> isPrime(x)).boxed()
                .collect(Collectors.toList());
    }

    public static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number / 2)
                .allMatch(n -> number % n != 0);
    }

    public static List<Integer> fibonacciSeries(int number) {
        return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(number)
                .map(n -> n[0])
                .collect(Collectors.toList());
    }

    public static int[] sortingArray(int [] numArray){
        Arrays.sort(numArray);
        return numArray;
    }

    public static double integerCheck(String  test){
        if(test!=null && !test.isEmpty()) {
            try {

                Integer.parseInt(test);
                return Math.sqrt(Integer.parseInt(test));

            } catch (NumberFormatException e) {
                mathCourse.log(Level.WARNING,"Exception occurred ",e);
            }
        }
        return -1;
    }
}
