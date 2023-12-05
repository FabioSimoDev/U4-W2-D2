package es2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static List<Integer> generateRandomList(int N) {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < N; i++) {
            randomNumbers.add(random.nextInt(101));
        }
        Collections.sort(randomNumbers);
        return randomNumbers;
    }

    public static List<Integer> duplicateAndReverse(List<Integer> originalList) {
        List<Integer> resultList = new ArrayList<>(originalList);
        List<Integer> tempList = new ArrayList<>(originalList);
        Collections.reverse(tempList);
        resultList.addAll(tempList);
        return resultList;
    }

    public static void printEvenOrOdd(List<Integer> list, boolean printEven) {
        for (int i = 0; i < list.size(); i++) {
            if ((printEven && i % 2 == 0) || (!printEven && i % 2 != 0)) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> randomNumbers = generateRandomList(10);
        List<Integer> duplicatedList = duplicateAndReverse(randomNumbers);
        System.out.println("Originale: " + randomNumbers);
        System.out.println("Duplicata e invertita: " + duplicatedList);
        printEvenOrOdd(duplicatedList, true); // Stampa numeri in posizioni pari
        printEvenOrOdd(duplicatedList, false); // Stampa numeri in posizioni dispari
    }

}
