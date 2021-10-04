package edu.upb.algorithm.coinsgreedy;

import java.util.ArrayList;
import java.util.List;

public class Main {

        static List<Integer> findCoins(int value) {
        int denominations[] = {1, 2, 5, 10, 20};
        int denominationsLenght = denominations.length;
        List<Integer> answer = new ArrayList<>();
        for (int i = denominationsLenght - 1; i >= 0; i--) {
            while (value >= denominations[i]) {
                value -= denominations[i];
                answer.add(denominations[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int input = 36;
        List output = findCoins(input);
        System.out.println("\nEl numero minimo de monedas para "+input+" pesos es de :"+output);
    }
}
