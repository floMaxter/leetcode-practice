package com.vdovin.yandex.training_4.warmup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskA_warmup {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] firstLine = scanner.nextLine().split(" ");
            int sequenceLength = Integer.parseInt(firstLine[0]);
            int countRequest = Integer.parseInt(firstLine[1]);

            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i < sequenceLength; i++) {
                nums.add(scanner.nextInt());
            }
            scanner.nextLine();

            for (int i = 0; i < countRequest; i++) {
                String[] currRequest = scanner.nextLine().split(" ");
                int l = Integer.parseInt(currRequest[0]);
                int r = Integer.parseInt(currRequest[1]);
                int foundValue = foundNotMinElement(l, r, nums);
                if (foundValue == -1) {
                    System.out.println("NOT FOUND");
                } else {
                    System.out.println(foundValue);
                }
            }
        }
    }

    public static int foundNotMinElement(int l, int r, List<Integer> nums) {
        //Пройти по массиву и найти минимальный элемент
        //Параллельно записываем предыдущее минимальное в отдельную переменную
        //Если минимальное и предыдущее миниимальное не равны, то вернуть предыдущее минимальное
        if (l == r || l > r) return -1;

        int value = nums.get(l);
        int minValue = value;
        for (int i = l; i <= r; i++) {
            if (nums.get(i) > value) {
                minValue = value;
                value = nums.get(i);
            }
        }
        return value == minValue ? -1 : value;
    }
}
