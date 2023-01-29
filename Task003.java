import java.util.ArrayList;
import java.util.Random;

import static java.lang.Math.round;
import static java.util.Collections.max;
import static java.util.Collections.min;


public class Task003 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list1.add(val);
        }
        System.out.printf("Initial list %s\n", list1);
        int max = max(list1);
        int min = min(list1);
        int maxItem = list1.get(0);
        int minItem = list1.get(0);
        int sumItems = 0;
        for (int item : list1) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float)sumItems/list1.size();
        System.out.printf("The maximum element using max %s\n", max);
        System.out.printf("Maximum element %s\n", maxItem);
        System.out.printf("The minimum element using min %s\n", min);
        System.out.printf("Minimum element %s\n", minItem);
        System.out.printf("Sum of elements %s\n", sumItems);
        System.out.printf("Arithmetic mean %s\n", average);
    }
}

