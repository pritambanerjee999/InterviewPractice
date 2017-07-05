package com.simple.problems;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorsOfANumber {

    public static void main(String args[]) {
        List<Integer> primeFactorList = findPrimeFactors(210);

        for (int i = 0; i < primeFactorList.size(); i++) {
            System.out.println(primeFactorList.get(i));
        }
    }

    public static List<Integer> findPrimeFactors(int number) {
        List<Integer> primeFactorsList = new ArrayList<>();

        if (number == 2) {
            primeFactorsList.add(2);
            return primeFactorsList;
        }

        if (checkIfPrime(number)) {
            primeFactorsList.add(number);

        } else {
            int range = (int) Math.sqrt(number);
            for (int i = 2; i <= range; i++) {
                if (number % i == 0) {
                    if (checkIfPrime(i)) {
                        primeFactorsList.add(i);
                    }
                }
            }
        }
        return primeFactorsList;
    }

    public static boolean checkIfPrime(int number) {
        if (number > -1 && number < 2) {
            return false;
        }

        boolean isPrime = true;

        int range = (int) Math.sqrt(number);

        for (int i = 2; i <= range; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return isPrime;

    }

}
